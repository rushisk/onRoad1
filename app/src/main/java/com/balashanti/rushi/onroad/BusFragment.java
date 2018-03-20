package com.balashanti.rushi.onroad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
* This is the main fragment of bus booking screen
* from here bus booking process starts*/
public class BusFragment extends Fragment {

    public BusFragment() {
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file

        final EditText ct_from,ct_to;
        final ViewPager viewPager;
        TextView current_date,full_date;

       final View view = inflater.inflate(R.layout.fragment_bus, container, false);
        ct_from=(EditText)view.findViewById(R.id.city_from);
        ct_to=(EditText)view.findViewById(R.id.city_to);

//        Swapping of cities
        final ImageButton btn_swap;
        btn_swap=(ImageButton)view.findViewById(R.id.swap_ct);
        btn_swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float deg = btn_swap.getRotation() + 180F;
                btn_swap.animate().rotation(deg).setInterpolator(new LinearInterpolator());
                String city1 = ct_from.getText().toString();
                String city2 = ct_to.getText().toString();
                ct_from.setText(city2);
                ct_to.setText(city1);
            }
        });

//        Search button
        Button search_btn =(Button) view.findViewById(R.id.search_btn);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });

//        date
        current_date= view.findViewById(R.id.c_date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);
        current_date.setText(dayOfTheWeek);

        full_date= view.findViewById(R.id.f_date);
        SimpleDateFormat full_d = new SimpleDateFormat("EEEE, MMM yyyy");
        Date date = new Date();
        String t_date = full_d.format(date);
        full_date.setText(t_date.toString());

//        Date Card
        CardView cd= view.findViewById(R.id.card);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date_Frag();
            }
        });

//Image slider
        viewPager = view.findViewById(R.id.view_pager);
       ViewpageAdapter adapter = new ViewpageAdapter(this.getActivity());
        viewPager.setAdapter(adapter);

        return view;
    }
//date fragment intent method which goes to date picker
    public void date_Frag() {
        Intent i = new Intent(this.getActivity(), DatePick.class);
        startActivityForResult(i,11111);
    }

//    it gets the date selected by user in DatePick activity
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 11111 && resultCode == Activity.RESULT_OK) {
            long date = data.getExtras().getLong("date");
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Bus");
    }
//This is the intent for List of BusListActivity which shows list of available buses
    public void updateDetail() {
        Intent intent = new Intent(getActivity(), BusListActivity.class);
        startActivity(intent);
    }

}