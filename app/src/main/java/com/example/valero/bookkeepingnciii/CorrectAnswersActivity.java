package com.example.valero.bookkeepingnciii;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by valero on 3/1/2016.
 */
public class CorrectAnswersActivity extends Activity {
    ListView listView ;
    List<Question> quesList;

    int score = 0;
    int qid = 0;
    int cnt;

    com.example.valero.bookkeepingnciii.Question currentQ;
    static List<Question> questionList;

    public static void setQuestionList(List<Question> questionList) {
        CorrectAnswersActivity.questionList = questionList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctans);

        Log.e("CorrectAnswersActivity", Arrays.deepToString(questionList.toArray()));


        String[] questionListArray = new String[questionList.size()];

        for (int i = 0; i < questionList.size(); i++) {
            questionListArray[i] = "QUESTION: \n\n" + questionList.get(i).getQUESTION()
                    + " [ANSWER]: " + questionList.get(i).getANSWER() +"\n";
        }

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        // Define a new Adapter//
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, questionListArray);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}
