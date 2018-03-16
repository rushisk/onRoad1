package com.balashanti.rushi.onroad;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rushikesh Kotule on 13-Mar-18.
 */

 class TextAdapter extends BaseAdapter
{
    List<String> ItemsList;
    String[] itemsName = new String[]{
            "ONE",
            "TWO"
    };

    Context context;

    public TextAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {

        return itemsName.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub

        return itemsName[position];
    }

    @Override
    public long getItemId(int position) {

        // TODO Auto-generated method stub

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ItemsList = new ArrayList<String>(Arrays.asList(itemsName));
        TextView text = new TextView(this.context);

        text.setText(itemsName[position]);

        text.setGravity(Gravity.CENTER);

        text.setBackgroundColor(Color.parseColor("#fbdcbb"));

        text.setTextColor(Color.parseColor("#040404"));

        text.setLayoutParams(new GridView.LayoutParams(144, 144));


        return text;

    }
}
