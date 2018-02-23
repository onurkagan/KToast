package com.onurkaganaldemir.ktoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.onurkaganaldemir.ktoastlib.KToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.mainActivityBtnToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.successToast(MainActivity.this ,"You win !", Gravity.BOTTOM, KToast.LENGTH_AUTO);
            }
        });
    }
}
