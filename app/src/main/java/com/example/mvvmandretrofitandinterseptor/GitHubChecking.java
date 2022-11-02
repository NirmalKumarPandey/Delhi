package com.example.mvvmandretrofitandinterseptor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class GitHubChecking extends AppCompatActivity
{
            private TextView mSum,mMul;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub_checking);
        mSum=findViewById(R.id.txt);
        mMul=findViewById(R.id.txt_sum);
        int a=20;
        int b=3;
        int s=addData(a,b);
        mSum.setText(String.valueOf(s));
       /* String s=addData(a,b);
        mSum.setText(s);*/
      /*  Boolean data=addData(a,b);
        mSum.setText(""+data);*/
        int c = 0,d = 0;
        double mul=multiplication(c,d);
        mMul.setText(String.valueOf(mul));


    }

    private double multiplication(int c, int d)
    {
        c=30;
        d=50;
        double mul=c*d;
        return mul;

    }

    private int addData(int a, int b)
    {
        int sum=a+b;
       return sum;
    }

}