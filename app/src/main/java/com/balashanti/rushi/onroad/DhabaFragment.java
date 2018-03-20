package com.balashanti.rushi.onroad;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
//main screen of daba
public class DhabaFragment extends Fragment {
    public DhabaFragment() {
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewPager dhabaPager;
        //returning our layout file
       View rootView= inflater.inflate(R.layout.fragment_dhaba, container, false);

        Button button = (Button) rootView.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
//Image slider
        dhabaPager = (ViewPager)rootView.findViewById(R.id.daba_pager);
        DhabapageAdapter adapter = new DhabapageAdapter(this.getActivity());
        dhabaPager.setAdapter(adapter);

        return rootView;
    }
    public void updateDetail() {
        Intent intent = new Intent(getActivity(), City_List.class);
        startActivity(intent);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Dhaba");
    }
}
