package com.example.rishabh.neww.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rishabh.neww.Data.Item;
import com.example.rishabh.neww.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ItemViewHolder> {

    public List<Item> list;
    private View  myview;
    public Context context;

    public MainAdapter(List<Item> list) {
        this.list=list;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        public TextView tvDevicename;
        public Switch btnSwitch;

        public ItemViewHolder(View itemView) {
            super(itemView);
            tvDevicename= (TextView) itemView.findViewById(R.id.tvDeviceName);
            btnSwitch= (Switch) itemView.findViewById(R.id.btnSwitch);
        }
    }

    @Override
    public MainAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        context=parent.getContext();
        myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        return new ItemViewHolder(myview);
    }

    @Override
    public void onBindViewHolder(final MainAdapter.ItemViewHolder holder, int position) {
          holder.tvDevicename.setText(list.get(position).getDevicename());

          holder.btnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(isChecked)
                  {
                      Toast.makeText(context, "you clicked "+holder.tvDevicename.getText(), Toast.LENGTH_SHORT).show();
                  }
                  else                      
                  {
                      Toast.makeText(context, "OFF", Toast.LENGTH_SHORT).show();
                  }
              }
          });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
