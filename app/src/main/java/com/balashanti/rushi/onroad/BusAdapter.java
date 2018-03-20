package com.balashanti.rushi.onroad;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/*
 * Created by Rushikesh Kotule
  * Date 10-Feb-18.
 * Description ----------
 * Version 1.0
 * this adapter is being used for showing the list of current available buses
*/


public class BusAdapter extends RecyclerView.Adapter<BusAdapter.ViewHolder> {
    List<ListBus> listItem;
    Context context;

    public BusAdapter(List<ListBus> listItem, Context context) {
        this.listItem = listItem;
        this.context = context;
    }

    /**
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.layout_bus_lists,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListBus listBus=listItem.get(position);

        holder.Bus_name.setText(listBus.getName_bus());
        holder.Bus_type.setText(listBus.getType_bus());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              To_Seat();
            }
        });

    }

    public void To_Seat(){
        Intent intent = new Intent(context, Seat_Select.class);
        context.startActivity(intent);
    }
    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView Bus_name;
        public TextView Bus_type;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            Bus_name = itemView.findViewById(R.id.Bus_name);
            Bus_type = itemView.findViewById(R.id.Bus_type);
            linearLayout = itemView.findViewById(R.id.bus_list_layout);
        }
    }
}
