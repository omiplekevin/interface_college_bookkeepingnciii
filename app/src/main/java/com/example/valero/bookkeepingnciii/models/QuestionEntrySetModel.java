package com.example.valero.bookkeepingnciii.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class QuestionEntrySetModel implements Serializable {

    @SerializedName("category")
    public String category;

    @SerializedName("question_set")
    public List<QuestionEntryModel> questionSet;

}

