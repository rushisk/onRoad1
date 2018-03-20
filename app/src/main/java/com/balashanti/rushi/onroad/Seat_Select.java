package com.balashanti.rushi.onroad;
/*Its a seat selection screen for user*/
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Camera.PreviewCallback;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;


public class Seat_Select extends AppCompatActivity {
    GridView androidgridview;

    int[] image = {
            R.drawable.rect_select, R.drawable.rect_select,
            R.drawable.rect_select, R.drawable.rect_select,
            R.drawable.rect_select, R.drawable.rect_select,
            R.drawable.rect_select, R.drawable.rect_select,
            R.drawable.rect_select, R.drawable.rect_select,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat__select);

        androidgridview = findViewById(R.id.grid);
        SeatAdapter seatAdapter=new SeatAdapter(Seat_Select.this,image);
        androidgridview.setAdapter(seatAdapter);

        androidgridview.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Grid Item " + (position + 1) + " Selected", Toast.LENGTH_LONG).show();

            }
        });

    }


}
