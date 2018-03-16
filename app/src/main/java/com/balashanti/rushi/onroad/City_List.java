package com.balashanti.rushi.onroad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class City_List extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    List<ListDhaba> listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView_dhaba);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItem = new ArrayList<>();

        for(int i = 0; i<10; i++){
            ListDhaba listDhaba=new ListDhaba(
                    "heading"+(i+1),
                    "lorem  ipsum dsa tezxt"
            );
            listItem.add(listDhaba);
        }
        adapter = new DhabaAdapter(listItem,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
