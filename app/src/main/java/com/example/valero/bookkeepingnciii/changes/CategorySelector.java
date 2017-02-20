package com.example.valero.bookkeepingnciii.changes;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.valero.bookkeepingnciii.Question;
import com.example.valero.bookkeepingnciii.R;
import com.example.valero.bookkeepingnciii.helper.Constants;

import java.util.Map;

public class CategorySelector extends Activity {

    LinearLayout rootView;
    boolean hasPopulatedCategoryButtons = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selector);
        init();
    }

    private void init() {
        rootView = (LinearLayout) findViewById(R.id.rootView);
    }

    @Override
    protected void onResume() {
        if (Constants.CATEGORIES != null) {
            for (Map.Entry<String, Integer> categoryEntry : Constants.CATEGORIES.entrySet()) {
                final String category = categoryEntry.getKey();
                Button categoryBtn = new Button(CategorySelector.this);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(0,3,0,3);
                categoryBtn.setText(Html.fromHtml("<b>" + category + "</b>"));
                categoryBtn.setTextSize(18F);
                categoryBtn.setBackgroundColor(Color.parseColor("#AAFFFFFF"));
                categoryBtn.setPadding(0, 10, 0, 10);
                categoryBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Constants.CATEGORIES.put(category, 1);
                        Intent questionPagerIntent = new Intent(CategorySelector.this, QuestionsPager.class);
                        questionPagerIntent.putExtra(QuestionsPager.CURRENT_CATEGORY_EXTRA, category);
                        questionPagerIntent.putExtra(QuestionsPager.SHOW_ANSWERS_EXTRA, false);
                        startActivity(questionPagerIntent);
                        finish();
                    }
                });
                if (categoryEntry.getValue() == 1) {
                    categoryBtn.setEnabled(false);
                }
                rootView.addView(categoryBtn, params);
            }
        }
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_category_selector, menu);
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
