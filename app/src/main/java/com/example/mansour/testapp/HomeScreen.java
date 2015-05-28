package com.example.mansour.testapp;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class HomeScreen extends ActionBarActivity
{
   // private final String TAG="TKT";
    LinearLayout BackGround;
    Button BtnGreen, BtnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
      //  Log.d(TAG,"OnCreate");
        setContentView(R.layout.linear_layout);
        BackGround = (LinearLayout) findViewById(R.id.backGround);
        BtnGreen=(Button) findViewById(R.id.btnGreen);
        BtnBlue=(Button) findViewById(R.id.btnBlue);
//        for (int counter = 0; counter < 10 ; counter++) {
//            Log.i("Counter","Cunter Value is"+ counter);
//
//        }
        BtnGreen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                BackGround.setBackgroundColor(Color.parseColor("#00ff00"));

            }
        });






    }


}
