package com.example.valero.bookkeepingnciii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.media.MediaPlayer;

import java.util.List;

public class ResultActivity extends Activity {

    MediaPlayer backgroundMusic;

    int questnum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        backgroundMusic = MediaPlayer.create(ResultActivity.this, R.raw.result);
        backgroundMusic.setLooping(true);
        backgroundMusic.start();

        TextView textResult = (TextView) findViewById(R.id.textResult);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        questnum = b.getInt("questnum");
        String category = b.getString("category");
        QuizHelper quizHelper = new QuizHelper(this);
        final List<Question> filteredQuestions = quizHelper.getQuestionsByCategory(category);
        textResult.setText("Your score is " + " " + score);

        // if last topic then change button text
        if(questnum==20){
            Button btn = (Button) findViewById(R.id.btn);
            String text = "SHOW TALLY OF TOPICS";
            btn.setText(text);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(ResultActivity.this, TallyOfTopics.class));
                }
            });
        }

            Button button13 = (Button) findViewById(R.id.button13);
            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(ResultActivity.this, Firstmenu.class));
                }
            });

            Button ans = (Button) findViewById(R.id.ans);
            ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CorrectAnswersActivity correctans = new CorrectAnswersActivity();
                    CorrectAnswersActivity.setQuestionList(filteredQuestions);
                    startActivity(new Intent(ResultActivity.this, correctans.getClass()));
                }
            });

    }


    public void playagain(View o){

        Intent intent = new Intent(this, QuestionActivity.class);
        Bundle r = new Bundle();
        r.putInt("questnum",questnum);
        intent.putExtras(r);
        startActivity(intent);
        finish();

    }

    @Override
    protected void onPause(){
        super.onPause();
        backgroundMusic.release();
    }

}


