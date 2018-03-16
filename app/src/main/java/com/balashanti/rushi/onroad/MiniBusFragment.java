package com.balashanti.rushi.onroad;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class MiniBusFragment extends Fragment {


    public MiniBusFragment() {
        // Required empty public constructor
    }

    public static MiniBusFragment newInstance() {
        MiniBusFragment fragment = new MiniBusFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mini_bus, container, false);
    }
}
