package com.example.valero.bookkeepingnciii;

import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.valero.bookkeepingnciii.R;
import android.media.MediaPlayer;
import android.widget.Toast;

public class QuestionActivity extends Activity {

    MediaPlayer backgroundMusic;
    private ImageView img;

    List<com.example.valero.bookkeepingnciii.Question> quesList;
    int score = 0;
    int qid=0;
    int cnt;

    CounterClass timer;

    com.example.valero.bookkeepingnciii.Question currentQ;
    TextView txtQuestion, times, scored, categoryText;
    Button button1, button2, button3 ,button4;

   // TopicScores topicScores = new TopicScores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        backgroundMusic = MediaPlayer.create(QuestionActivity.this, R.raw.quez);
        backgroundMusic.setLooping(true);
        backgroundMusic.start();

        img = (ImageView)findViewById(R.id.img);
        img.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
            }
        });


        com.example.valero.bookkeepingnciii.QuizHelper db = new com.example.valero.bookkeepingnciii.QuizHelper(this);  // question bank class
        quesList = db.getAllQuestions();  // this will fetch all quetonall questions
        currentQ = quesList.get(qid); // the current question
        txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        // the textview in which the question will be displayed
        // the three buttons,
        // the idea is to set the text of three buttons with the options from question bank
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        categoryText = (TextView) findViewById(R.id.categoryType);

        // the timer
        times = (TextView) findViewById(R.id.timers);
        // method which will set the things up for the game

        checkExtras();
        //setQuestionView();
        times.setText("00:05:00");
        // A timer of 60 seconds to play for, with an interval of 1 second (1000 milliseconds)
        timer = new CounterClass(300000, 1000);
        timer.start();
        // button click listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // passing the button text to other method
                // to check whether the anser is correct or not
                // same for all three buttons
                getAnswer(button1.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button2.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button3.getText().toString());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button3.getText().toString());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
    }

    public void getAnswer(String AnswerString) {
        final TopicScores topicScores = (TopicScores) getApplicationContext();

        if (currentQ.getANSWER().equals(AnswerString)) {
            // if conditions matches increase the int (score) by 1
            // and set the text of the score view
            score++;
            topicScores.setTopic1Score(score);
        }
        cnt++;

        if (qid==10){

            topicScores.setTopic1Score(score);
        }
        else if (qid==20){
            topicScores.setTopic2Score(score);

        }
        else if (qid==30){
            topicScores.setTopic3Score(score);

        }
        else if (qid==40){
            topicScores.setTopic4Score(score);

        }
        else if (qid==50){
            topicScores.setTopic5Score(score);

        }
        else if (qid==60){
            topicScores.setTopic6Score(score);

        }
        else if (qid==70){
            topicScores.setTopic7Score(score);

        }
        else if (qid==80){
            topicScores.setTopic8Score(score);

        }
        else if (qid==90){
            topicScores.setTopic9Score(score);

        }
        else if (qid==100){
            topicScores.setTopic10Score(score);

        }
        else if (qid==110){
            topicScores.setTopic11Score(score);

        }
        else if (qid==120){
            topicScores.setTopic12Score(score);

        }
        else if (qid==130){
            topicScores.setTopic13Score(score);

        }
        else if (qid==140){
            topicScores.setTopic14Score(score);

        }
        else if (qid==150){
            topicScores.setTopic15Score(score);

        }
        else if (qid==160){
            topicScores.setTopic16Score(score);

        }
        else if (qid==170){
            topicScores.setTopic17Score(score);

        }

        // 10 questions per topic
        if (cnt < 10) {

            // if questions are not over
            currentQ = quesList.get(qid);
            //setQuestionView();
            checkExtras();
        }
        else {
            // if over
            cnt=0;
            Intent intent = new Intent(QuestionActivity.this,
                    ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score
            b.putInt("questnum",qid);
            b.putString("category", CATEGORY);
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            //finish();


        }



    }

    @Override
    protected void onDestroy() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        super.onDestroy();
    }



    public class CounterClass extends CountDownTimer {
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
        }
        @Override
        public void onFinish() {
            times.setText("Time is up");
            Intent intent = new Intent(QuestionActivity.this, ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score
            b.putString("category", CATEGORY);
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
        }


        @Override
        public void onTick(long millisUntilFinished) {
            // TODO Auto-generated method stub
            long millis = millisUntilFinished;
            String hms = String.format(
                    "%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
                            .toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
                            .toMinutes(millis)));
            System.out.println(hms);
            times.setText(hms);
        }
    }
    private void checkExtras(){

        Bundle r = getIntent().getExtras();

        if(r != null){
            qid = r.getInt("questnum");
            getIntent().removeExtra("questnum");
            r=null;

            currentQ = quesList.get(qid); // the current question
            setQuestionView();
            qid++;
        }else{
            qid++;
            setQuestionView();

        }
    }

    public static String CATEGORY = "";
    private void setQuestionView() {
        // the method which will put all things together
        txtQuestion.setText(currentQ.getQUESTION());
        button1.setText(currentQ.getOPTA());
        button2.setText(currentQ.getOPTB());
        button3.setText(currentQ.getOPTC());
        //new single textView
        categoryText.setText(Html.fromHtml("<b>Category:</b> " + "<i>" + currentQ.getCATEGORY() + "</i>"));
        CATEGORY = currentQ.getCATEGORY();
        //qid++;

    }
    @Override
    protected void onPause(){
        super.onPause();
        backgroundMusic.release();
        finish();
    }
}