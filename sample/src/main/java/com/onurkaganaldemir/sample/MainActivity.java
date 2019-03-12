package com.onurkaganaldemir.sample;

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

        // Success
        findViewById(R.id.mainActivityBtnSuccess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.successToast(MainActivity.this, "This is a success toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO);
            }
        });

        // Info
        findViewById(R.id.mainActivityBtnInfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.infoToast(MainActivity.this, "This is a info toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO);
            }
        });

        // Normal
        findViewById(R.id.mainActivityBtnNormal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.normalToast(MainActivity.this, "This is a normal toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO, R.drawable.ic_infinite_white);
            }
        });

        // Warning
        findViewById(R.id.mainActivityBtnWarning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.warningToast(MainActivity.this, "This is a warning toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO);
            }
        });

        // Error
        findViewById(R.id.mainActivityBtnError).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.errorToast(MainActivity.this, "This is a error toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO);
            }
        });

        // Custom Color
        findViewById(R.id.mainActivityBtnCustomColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.customColorToast(MainActivity.this, "This is a custom color toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO, R.color.fuchsia, R.drawable.ic_infinite_white);
            }
        });

        // Custom Drawable
        findViewById(R.id.mainActivityBtnCustomDrawable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KToast.customBackgroudToast(MainActivity.this, "This is a custom drawable toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO, R.drawable.background_toast, null ,R.drawable.ic_infinite_white);
            }
        });
    }
}
