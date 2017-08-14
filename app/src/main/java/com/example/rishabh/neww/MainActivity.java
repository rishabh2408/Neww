package com.example.rishabh.neww;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.example.rishabh.neww.Adapters.MainAdapter;
import com.example.rishabh.neww.Data.Item;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Item> list;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code for the recycler view

        /* MyAdapter adapter=new MyAdapter(this,NatureModel.getobjectList());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutmanager=new LinearLayoutManager(this);
        layoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutmanager);
        */

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        list=new ArrayList<>();

        list.add(new Item("one"));
        list.add(new Item("two"));
        list.add(new Item("three"));
        list.add(new Item("four"));
        list.add(new Item("five"));
        adapter=new MainAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //code for the floating action button and create and icon
        ImageView icon = new ImageView(this);
        icon.setImageResource(R.drawable.ic_bookmark_black_24dp);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
        // repeat many times:
        ImageView itemIcon1 = new ImageView(this);
        itemIcon1.setScaleX(3f);
        itemIcon1.setScaleY(3f);
        itemIcon1.setImageResource(R.drawable.ic_stats);


        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setScaleX(3f);
        itemIcon2.setScaleY(3f);
        itemIcon2.setImageResource(R.mipmap.ic_launcher);

        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setScaleX(3f);
        itemIcon3.setScaleY(3f);
        itemIcon3.setImageResource(R.mipmap.ic_launcher);

        SubActionButton button1 = itemBuilder.setContentView(itemIcon1).build();
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();

        //attach the sub buttons to the main button
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .attachTo(actionButton)
                .build();
    }
}
