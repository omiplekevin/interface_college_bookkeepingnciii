package com.example.valero.bookkeepingnciii;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.valero.bookkeepingnciii.changes.CategorySelector;
import com.example.valero.bookkeepingnciii.helper.Constants;
import com.example.valero.bookkeepingnciii.models.QuestionCollectionModel;
import com.example.valero.bookkeepingnciii.models.QuestionEntryModel;
import com.example.valero.bookkeepingnciii.models.QuestionEntrySetModel;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by valero on 1/28/2016.
 */
public class Gamemode extends Activity {

    private static final String TAG = "GAMEMODE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamemode);

        Button button11 =(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(Gamemode.this, QuestionActivity.class));
                prepareQuestionCollectionList("easy");
            }
        });

        Button button19 =(Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(Gamemode.this, QuestionActivityhard.class));
                prepareQuestionCollectionList("hard");
            }
        });
    }

    private void prepareQuestionCollectionList(final String gameMode) {
        new AsyncTask<Void, Void, Boolean>(){

            @Override
            protected Boolean doInBackground(Void... params) {
                QuestionCollectionModel questionCollectionModel = null;
                switch (gameMode) {
                    case "easy":
                        questionCollectionModel = new Gson().fromJson(readAssetFile("question_easy_category.json"), QuestionCollectionModel.class);
                        break;
                    case "hard":
                        questionCollectionModel = new Gson().fromJson(readAssetFile("question_hard_category.json"), QuestionCollectionModel.class);
                        break;
                }
                if (questionCollectionModel != null) {
                    createDataSet(questionCollectionModel);
                    return true;
                }
                return false;
            }

            @Override
            protected void onPostExecute(Boolean success) {
                if (success) {
                    Intent intent = new Intent(Gamemode.this, CategorySelector.class);
                    startActivity(intent);
                    finish();
                }
            }
        }.execute();
    }

    private String readAssetFile(String filename) {
        String bufferString;
        try {
            InputStream is = getAssets().open(filename);
            int size = is.available();
            byte buffer[] = new byte[size];
            is.read(buffer);
            is.close();
            bufferString = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            bufferString = "";
        }
        return bufferString;
    }

    private void createDataSet(QuestionCollectionModel questionCollectionModel) {
        Constants.QUESTION_ENTRY_SET = questionCollectionModel.data;

        //get categories
        if (Constants.CATEGORIES == null) {
            Constants.CATEGORIES = new HashMap<>();
        }
        Constants.CATEGORIES.clear();
        for (Map.Entry<String, QuestionEntrySetModel> entrySet : Constants.QUESTION_ENTRY_SET.entrySet()) {
            QuestionEntrySetModel entry = entrySet.getValue();
            Constants.CATEGORIES.put(entry.category, 0);
        }
    }

}
