package com.example.mvvmandretrofitandinterseptor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread=new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    Thread.sleep(4000);
                    startActivity(new Intent(MainActivity.this,SecondActivity.class));
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}