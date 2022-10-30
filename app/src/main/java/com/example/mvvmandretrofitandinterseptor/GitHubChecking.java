package com.example.mvvmandretrofitandinterseptor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class GitHubChecking extends AppCompatActivity
{
            private TextView mSum;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub_checking);
        mSum=findViewById(R.id.txt);
        int a=20;
        int b=3;
        int s=addData(a,b);
        mSum.setText(String.valueOf(s));
       /* String s=addData(a,b);
        mSum.setText(s);*/
      /*  Boolean data=addData(a,b);
        mSum.setText(""+data);*/


    }

    private int addData(int a, int b)
    {
        int sum=a+b;
       return sum;
    }

}