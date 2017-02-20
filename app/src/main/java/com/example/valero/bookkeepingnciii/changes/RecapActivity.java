package com.example.valero.bookkeepingnciii.changes;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.valero.bookkeepingnciii.R;
import com.example.valero.bookkeepingnciii.helper.Constants;
import com.example.valero.bookkeepingnciii.helper.CustomListViewAdapter;

public class RecapActivity extends Activity {

    public static final String SCORE_EXTRA = "SCORE_EXTRA";
    public static final String TOTAL_EXTRA = "TOTAL_EXTRA";
    public static final String PREVIOUS_CATEGORY = "PREV_CATEGORY";

    private int accumulatedScore;
    private int totalScore;
    private String previousCategory;

    private TextView recapMessage;
    private TextView recapScore;
    private Button continueBtn;
    private Button quitBtn;
    private Button reviewPrevious;
    private ListView recapPreviousScoresList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        accumulatedScore = getIntent().getExtras().getInt(SCORE_EXTRA);
        totalScore = getIntent().getExtras().getInt(TOTAL_EXTRA);
        previousCategory = getIntent().getExtras().getString(PREVIOUS_CATEGORY);

        init();
    }

    private void init(){
        recapPreviousScoresList = (ListView) findViewById(R.id.recapPreviousScoresList);
        CustomListViewAdapter adapter = new CustomListViewAdapter(RecapActivity.this, Constants.ANSWERED_HISTORY);
        recapPreviousScoresList.setAdapter(adapter);

        continueBtn = (Button) findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecapActivity.this, CategorySelector.class);
                startActivity(intent);
                finish();
            }
        });
        quitBtn = (Button) findViewById(R.id.quitBtn);
        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constants.ANSWERED_HISTORY.clear();
                Constants.ANSWERED_HISTORY = null;
                Constants.CATEGORIES.clear();
                Constants.CATEGORIES = null;
                finish();
            }
        });
        reviewPrevious = (Button) findViewById(R.id.reviewPrevious);
        reviewPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent questionPagerIntent = new Intent(RecapActivity.this, QuestionsPager.class);
                questionPagerIntent.putExtra(QuestionsPager.CURRENT_CATEGORY_EXTRA, previousCategory);
                questionPagerIntent.putExtra(QuestionsPager.SHOW_ANSWERS_EXTRA, true);
                startActivity(questionPagerIntent);
            }
        });
        recapMessage = (TextView) findViewById(R.id.recapMessage);
        if (accumulatedScore >= 7) {
            recapMessage.setText("Congratulations! You scored HIGH!");
        } else if (accumulatedScore < 7 && accumulatedScore >= 5) {
            recapMessage.setText("It's a bit fair, but hey! Congratulations still!");
        } else {
            recapMessage.setText("Please do more, will you?");
        }
        recapScore = (TextView) findViewById(R.id.recapScore);
        recapScore.setText(accumulatedScore + "/" + totalScore);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recap, menu);
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
}
