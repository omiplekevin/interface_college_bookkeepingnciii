package com.example.valero.bookkeepingnciii.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.valero.bookkeepingnciii.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomListViewAdapter extends BaseAdapter {

    private Context context;
    private HashMap<String, String> values;
    private List<String> infoMergeList;

    public CustomListViewAdapter(Context context, HashMap<String, String> values) {
        this.context = context;
        this.values = values;
        infoMergeList = new ArrayList<>();
        for (Map.Entry<String, String> entry : this.values.entrySet()) {
            infoMergeList.add(entry.getKey() + "||" + entry.getValue());
        }
    }

    @Override
    public int getCount() {
        return this.values.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    public Map.Entry<String, String> getMapItem(String key) {
        for (Map.Entry<String, String> entry : this.values.entrySet()) {
            if (key.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(this.context).inflate(R.layout.recap_custom_listview, null);
        TextView categoryText = (TextView) convertView.findViewById(R.id.categoryName);
        TextView categoryScore = (TextView) convertView.findViewById(R.id.categoryScore);
        String infoMerge = this.infoMergeList.get(position);
        String[] explodedInfo = infoMerge.split("\\|\\|");
        categoryText.setText(explodedInfo[0]);
        categoryScore.setText(explodedInfo[1]);

        return convertView;
    }
}
