package com.balashanti.rushi.onroad;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rushikesh Kotule on 11-Feb-18.
 * Adpater for daba recyclerview
 */

public class DhabaAdapter extends RecyclerView.Adapter<DhabaAdapter.ViewHolder> {
    List<ListDhaba> listItem;
    Context context;

    public DhabaAdapter(List<ListDhaba> listItem, Context context){
        this.listItem=listItem;
        this.context=context;
    }

    @Override
    public DhabaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.layout_dhaba_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DhabaAdapter.ViewHolder holder, int position) {
        ListDhaba listDhaba=listItem.get(position);

        holder.Dhaba_name.setText(listDhaba.getName_dhaba());
        holder.Dhaba_type.setText(listDhaba.getType_dhaba());

    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView Dhaba_name;
        public TextView Dhaba_type;

        public ViewHolder(View itemView) {
            super(itemView);
            Dhaba_name = (TextView)itemView.findViewById(R.id.Dhaba_name);
            Dhaba_type = (TextView)itemView.findViewById(R.id.Dhaba_type);
        }
    }
}
