package com.balashanti.rushi.onroad;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourBusFragment extends Fragment {


    public TourBusFragment() {
        // Required empty public constructor
    }

    public static TourBusFragment newInstance() {
        TourBusFragment fragment = new TourBusFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tour_bus, container, false);
    }
}
