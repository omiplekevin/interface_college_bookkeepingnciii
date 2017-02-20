package com.example.valero.bookkeepingnciii.changes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.example.valero.bookkeepingnciii.R;
import com.example.valero.bookkeepingnciii.helper.Constants;
import com.example.valero.bookkeepingnciii.helper.QuestionFragmentPagerAdapter;
import com.example.valero.bookkeepingnciii.models.QuestionEntryModel;
import com.example.valero.bookkeepingnciii.models.QuestionEntrySetModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionsPager extends FragmentActivity {

    public static final String CURRENT_CATEGORY_EXTRA = "CATEGORY";
    public static final String SHOW_ANSWERS_EXTRA = "SHOW_ANSWERS";

    private static final String TAG = "QUESTIONSPAGER";

    private String currentCategory;
    private boolean showAnswers = false;
    private int pageIndex = 0;

    private List<QuestionEntryModel> questions;
    private HashMap<String, String> answersMap;

    private ViewPager questionsPager;
    private Button prevBtn;
    private Button nextBtn;
    private VideoView videoBackground;

    private QuestionAnsweredListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_pager);
        currentCategory = getIntent().getExtras().getString(CURRENT_CATEGORY_EXTRA);
        showAnswers = getIntent().getExtras().getBoolean(SHOW_ANSWERS_EXTRA);

        init();
        prepareQuestionEntries();
        setupViewPager();
    }

    private void init() {

        String videoName = "bg2";
        int id = getResources().getIdentifier(videoName, "raw", getPackageName());
        final String path = "android.resource://" + getPackageName() + "/" + id;

        videoBackground = (VideoView) findViewById(R.id.videoBackground);
        videoBackground.setVideoURI(Uri.parse(path));
        videoBackground.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoBackground.pause();
                videoBackground.seekTo(0);
                videoBackground.start();
            }
        });
        videoBackground.start();

        prevBtn = (Button) findViewById(R.id.prevBtn);
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pageIndex > 0) {
                    pageIndex--;
                    Log.e(TAG, "SELECTING: " + pageIndex);
                    questionsPager.setCurrentItem(pageIndex, true);
                }
            }
        });
        prevBtn.setEnabled(false);
        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pageIndex < questions.size()) {
                    pageIndex++;
                    Log.e(TAG, "SELECTING: " + pageIndex);
                    questionsPager.setCurrentItem(pageIndex, true);
                }
            }
        });

        answersMap = new HashMap<>();
        questionsPager = (ViewPager) findViewById(R.id.questionsPager);
        questionsPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                pageIndex = position;
                Log.e(TAG, "SELECTED INDEX: " + pageIndex);
                if (pageIndex == questions.size()-1) {
                    nextBtn.setEnabled(false);
                } else if (pageIndex == 0) {
                    prevBtn.setEnabled(false);
                } else {
                    prevBtn.setEnabled(true);
                    nextBtn.setEnabled(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        Button finishBtn = (Button) findViewById(R.id.finishButton);
        if (!showAnswers) {
            finishBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (questions.size() != answersMap.size()) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(QuestionsPager.this);
                        AlertDialog dialog = builder.create();
                        dialog.setTitle("Incomplete!");
                        dialog.setMessage("You have " + (questions.size() - answersMap.size()) + " unanswered question(s). Are you sure to finish this category?");
                        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                doTallyToRecap();
                            }
                        });
                        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        dialog.show();
                    } else {
                        doTallyToRecap();
                    }
                }
            });
        } else {
            finishBtn.setEnabled(false);
        }
        listener = new QuestionAnsweredListener() {
            @Override
            public void onQuestionAnswered(String questionID, String answerStatement) {
                if (!showAnswers) {
                    Log.e(TAG, "received an answer from: " + questionID + ", answer: " + answerStatement);
                    answersMap.put(questionID, answerStatement);
                }
            }
        };
    }

    private void doTallyToRecap(){
        int score = checkAnswers();
        if (Constants.ANSWERED_HISTORY == null) {
            Constants.ANSWERED_HISTORY = new HashMap<>();
        }
        Constants.ANSWERED_HISTORY.put(currentCategory, score + "/" + questions.size());
        Intent intent = new Intent(QuestionsPager.this, RecapActivity.class);
        intent.putExtra(RecapActivity.SCORE_EXTRA, score);
        intent.putExtra(RecapActivity.TOTAL_EXTRA, questions.size());
        intent.putExtra(RecapActivity.PREVIOUS_CATEGORY, currentCategory);
        startActivity(intent);
        finish();
    }

    private void prepareQuestionEntries() {
        if (Constants.QUESTION_ENTRY_SET != null) {
            for (Map.Entry<String, QuestionEntrySetModel> entrySetModelEntry : Constants.QUESTION_ENTRY_SET.entrySet()) {
                QuestionEntrySetModel entrySetModel = entrySetModelEntry.getValue();
                Log.e(TAG, entrySetModel.category);
                if (entrySetModel.category.equals(currentCategory)) {
                    questions = entrySetModel.questionSet;
                    break;
                }
            }
        }

        //shuffle questions 3 times
        if (questions != null) {
            Collections.shuffle(questions);
            Collections.shuffle(questions);
            Collections.shuffle(questions);
        }
    }

    private void setupViewPager(){
        QuestionFragmentPagerAdapter pagerAdapter = new QuestionFragmentPagerAdapter(getSupportFragmentManager(), getFragmentList());
        questionsPager.setAdapter(pagerAdapter);
        questionsPager.setOffscreenPageLimit(questions.size()-1);
    }

    private List<Fragment> getFragmentList() {
        List<Fragment> fragments = new ArrayList<>();
        for (QuestionEntryModel questionItem : questions) {
            fragments.add(QuestionFragment.newInstance(questionItem, listener, showAnswers));
        }
        return fragments;
    }

    private int checkAnswers() {
        int score = 0;
        for (Map.Entry<String, String> answer : answersMap.entrySet()) {
            if (lookUpAnswer(answer.getKey()).equals(answer.getValue())) {
                score++;
            }
        }
        return score;
    }

    private String lookUpAnswer(String qID) {
        for (QuestionEntryModel questionItem : questions) {
            if (questionItem.questionID.equals(qID)) {
                return questionItem.answer;
            }
        }
        return "";
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_questions_pager, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public interface QuestionAnsweredListener{
        void onQuestionAnswered(String questionID, String answerStatement);
    }
}
