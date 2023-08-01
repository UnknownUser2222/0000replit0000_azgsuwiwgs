package com.techstudios.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arr = new String[5];
        arr[0] = "I like toast.";
        arr[1] = "I use Android.";
        arr[2] = "Android is so cool.";
        arr[3] = "Logcat is a cat with logs on it.";
        arr[4] = "Logcat is similar to the System.out.println()";

        for (int i=0 ;i <= 4;i += 1){
            Log.i("id1", arr[i]);
        };

    }
}