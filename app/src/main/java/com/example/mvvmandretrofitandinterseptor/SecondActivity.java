package com.example.mvvmandretrofitandinterseptor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Adapter.MySecondUserListAdapter;
import MyModel.Other;
import ViewModel.MyViewModel;


public class SecondActivity extends AppCompatActivity
{
    private Context context;
    private MySecondUserListAdapter mySecondUserListAdapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView=findViewById(R.id.recycler_view);

        MyViewModel myViewModel=new ViewModelProvider(this).get(MyViewModel.class);
        myViewModel.getAllUser().observe(this, new Observer<List<Other>>()
        {
            @Override
            public void onChanged(List<Other> others)
            {
                for(int i=0;i<others.size();i++) {
                    Log.d("nir", "Data..." + others.get(i).getName());
                }

                mySecondUserListAdapter=new MySecondUserListAdapter(context,others);
                recyclerView.setHasFixedSize(true);
                layoutManager=new LinearLayoutManager(SecondActivity.this,RecyclerView.VERTICAL,false);
                // layoutManager=new GridLayoutManager(SecondActivity.this,2);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(mySecondUserListAdapter);

            }
        });

    }
}