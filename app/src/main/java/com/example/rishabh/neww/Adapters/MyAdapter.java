package com.example.rishabh.neww.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.example.rishabh.neww.Data.NatureModel;
import com.example.rishabh.neww.R;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{

    private List<NatureModel> objectList;
    private LayoutInflater inflater;
    public MyAdapter(Context context,List<NatureModel> objectList)
    {
        inflater=LayoutInflater.from(context);
        this.objectList=objectList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.list_view,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        NatureModel current=objectList.get(position);
        holder.setData(current,position);
    }
    @Override
    public int getItemCount() {
        return objectList.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView title;
        private Switch switchh;
        private int position;
        private NatureModel currentobject;

    public MyViewHolder(View itemView)
    {
        super(itemView);
        title=(TextView)itemView.findViewById(R.id.tvDeviceName);
        switchh=(Switch)itemView.findViewById(R.id.btnSwitch);
    }
    public void setData(NatureModel currentobject,int position)
    {
        this.title.setText(currentobject.getDevice());
        //something for switch 12.41
        this.switchh.setId(currentobject.getSwitchId());
        this.position=position;
        this.currentobject=currentobject;
    }
    }
}
