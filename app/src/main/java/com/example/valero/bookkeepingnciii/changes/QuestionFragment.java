package com.example.valero.bookkeepingnciii.changes;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.valero.bookkeepingnciii.R;
import com.example.valero.bookkeepingnciii.models.QuestionEntryModel;

public class QuestionFragment extends Fragment {

    public static final String QUESTION_EXTRA = "QUESTION_ITEM";

    public static final String TAG = "QUESTION_FRAGMENT";

    private static String choice = "";

    private QuestionEntryModel questionItem;

    private static QuestionsPager.QuestionAnsweredListener answerListener;
    private static boolean showAnswers = false;

    public static QuestionFragment newInstance(QuestionEntryModel questionItem, QuestionsPager.QuestionAnsweredListener answerListener, boolean showAnswers) {
        QuestionFragment.answerListener = answerListener;
        QuestionFragment.showAnswers = showAnswers;

        QuestionFragment questionFragment = new QuestionFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(QUESTION_EXTRA, questionItem);
        questionFragment.setArguments(bundle);

        return questionFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (getArguments() != null) {
            questionItem = (QuestionEntryModel)getArguments().get(QUESTION_EXTRA);
        }

        View v = inflater.inflate(R.layout.fragment_question, container, false);

        /*TextView qId = (TextView) v.findViewById(R.id.entryQId);
        qId.setText(questionItem.questionID);*/
        TextView question = (TextView) v.findViewById(R.id.entryQuestion);
        question.setText(questionItem.questionStatement);
        RadioGroup radioGroup = (RadioGroup) v.findViewById(R.id.radioGroup);
        for (String choice : questionItem.selections) {
            if (!choice.isEmpty()) {
                RadioButton radioBtnChoice = new RadioButton(getActivity().getApplicationContext());
                radioBtnChoice.setText(choice);
                radioBtnChoice.setTextColor(Color.parseColor("#000000"));
                radioBtnChoice.setTextSize(24F);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                radioGroup.addView(radioBtnChoice, params);

                if (showAnswers) {
                    if (choice.equals(questionItem.answer)) {
                        radioBtnChoice.setChecked(true);
                    }
                    radioBtnChoice.setEnabled(false);
                }
            }
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radioButton = group.findViewById(checkedId);
                int index = group.indexOfChild(radioButton);
                if (!showAnswers) {
                    answerListener.onQuestionAnswered(questionItem.questionID, ((RadioButton) radioButton).getText().toString().trim());
                }
            }
        });

        if (showAnswers) {
            TextView correctAnswer = (TextView) v.findViewById(R.id.correctAnswer);
            correctAnswer.setText("Correct Answer is: " + questionItem.answer);
            correctAnswer.setVisibility(View.VISIBLE);
        }

        return v;
    }
}
