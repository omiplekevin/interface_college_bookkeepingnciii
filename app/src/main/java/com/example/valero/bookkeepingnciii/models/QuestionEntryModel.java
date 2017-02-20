package com.example.valero.bookkeepingnciii.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class QuestionEntryModel implements Serializable {

    @SerializedName("qID")
    public String questionID;

    @SerializedName("question")
    public String questionStatement;

    @SerializedName("selection")
    public String[] selections;

    @SerializedName("answer")
    public String answer;
}
