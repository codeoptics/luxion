package com.my.loxion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(1000);
                }

                catch(Exception e)
                {
                    e.printStackTrace();
                }

                finally
                {
                    Intent mainIntent = new Intent(MainActivity.this, Home.class);
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();

    }

    @Override
    protected void onPause()
    {
        super.onPause();

        finish();
    }
}

