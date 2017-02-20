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
public class TallyOfTopics extends Activity {
    ListView listView ;




    public static void setQuestionList(List<Question> questionList) {
        CorrectAnswersActivity.questionList = questionList;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tallytopics);



        final TopicScores topic = (TopicScores) getApplicationContext();

        String[] TallyArray = new String[]{
                "Accounting Basics: " + topic.getTopic1Score().toString() + "/10",
                "Debits and Credits: " + topic.getTopic2Score().toString() + "/10",
                "Chart of Account: " + topic.getTopic3Score().toString()+ "/10",
                "Bookkeeping: " + topic.getTopic4Score().toString()+ "/10",
                "Accounting Equation: " + topic.getTopic5Score().toString()+ "/10",
                "Accounting Principles: " + topic.getTopic6Score().toString()+ "/10",
                "Financial Accounting: " + topic.getTopic7Score().toString()+ "/10",
                "Adjusting Entries: " + topic.getTopic8Score().toString()+ "/10",
                "Balance Sheet: " + topic.getTopic9Score().toString()+ "/10",
                "Income Statement: " + topic.getTopic10Score().toString()+ "/10",
                "Bank Reconciliation: " + topic.getTopic11Score().toString()+ "/10",
                "Accounts Payable: " + topic.getTopic12Score().toString()+ "/10",
                "Inventory and Cost of Good Sold: " + topic.getTopic13Score().toString()+ "/10",
                "Depreciation: " + topic.getTopic14Score().toString()+ "/10",
                "Payroll Accounting: " + topic.getTopic15Score().toString()+ "/10",
                "Stockholder Equity: " + topic.getTopic16Score().toString()+ "/10",
                "Nonprofit Accounting: " + topic.getTopic17Score().toString()+ "/10"
        };

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, TallyArray);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

    }

}
