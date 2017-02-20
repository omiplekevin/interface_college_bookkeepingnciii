package com.example.valero.bookkeepingnciii;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by valero on 2/23/2016.
 */
public class ResultActivityhard extends Activity {

    MediaPlayer backgroundMusic;

    int questnum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        backgroundMusic = MediaPlayer.create(ResultActivityhard.this, R.raw.result);
        backgroundMusic.setLooping(true);
        backgroundMusic.start();

        TextView textResult = (TextView) findViewById(R.id.textResult);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        questnum = b.getInt("questnum");
        String categoryHard = b.getString("categoryHard");
        QuizHelperhard quizHelperhard = new QuizHelperhard(this);
        final List<Question> filteredQuestions = quizHelperhard.getQuestionsByCategory(categoryHard);
        textResult.setText("Your score is " + " " + score);


        // if last topic then change button text
        if(questnum==170){
            Button btn = (Button) findViewById(R.id.btn);
            String text = "SHOW TALLY OF TOPICS";
            btn.setText(text);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(ResultActivityhard.this, TallyOfTopics.class));
                }
            });
        }


        Button button13 =(Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivityhard.this, Firstmenu.class));
            }
        });

        Button ans =(Button) findViewById(R.id.ans);
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CorrectAnswersActivity correctans = new CorrectAnswersActivity();
                CorrectAnswersActivity.setQuestionList(filteredQuestions);
                startActivity(new Intent(ResultActivityhard.this, correctans.getClass()));
            }
        });

    }

    public void playagain(View o){

        Intent intent = new Intent(this, QuestionActivityhard.class);
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
        finish();
    }

}
