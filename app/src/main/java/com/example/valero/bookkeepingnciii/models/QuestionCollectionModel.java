package com.example.valero.bookkeepingnciii.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.TreeMap;

public class QuestionCollectionModel implements Serializable {

    @SerializedName("version")
    public String version;

    @SerializedName("data")
    public TreeMap<String, QuestionEntrySetModel> data;

}
