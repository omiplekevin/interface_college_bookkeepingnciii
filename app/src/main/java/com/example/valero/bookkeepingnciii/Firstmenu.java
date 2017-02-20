package com.example.valero.bookkeepingnciii;



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

import java.io.File;


public class Firstmenu extends ActionBarActivity {


    //Return the primary shared/external storage directory.
    public static final String MAIN_DIR = Environment.getExternalStorageDirectory() + "/" + "bookkeepingnciii";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstmenu);

        File mainDir = new File(MAIN_DIR);
        if(mainDir.mkdir()) {
            Log.e("FirstMenu", "created bookkeepingnciii folder");
        } else {
            Log.e("FirstMenu", "bookkeepingnciii folder existing");
        }

        Button button5 =(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*AlertDialog.Builder builder = new AlertDialog.Builder(Firstmenu.this);
                AlertDialog dialog = builder.create();
                dialog.setMessage("Do you want to play New Game or Continue where you left off?");
                dialog.setButton(AlertDialog.BUTTON_POSITIVE, "New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();*/
                        startActivity(new Intent(Firstmenu.this, Gamemode.class));
                /*    }
                });
                dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        startActivity(new Intent(Firstmenu.this,QuestionActivity.class));
                        //continue functionality
                    }
                });
                dialog.show();*/
            }
        });
        Button button6 =(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstmenu.this,Option.class));
            }
        });
        Button button7 =(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstmenu.this,Help.class));
            }
        });

        Button button8 =(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firstmenu.this,About.class));
            }
        });

    }

}






