package com.brianduverneay.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v) {
        CharSequence text;
        text=((Button)v).getText().toString();;

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        text = "This button will launch my " + text + "!";
        if (mAppToast != null) {
            mAppToast.cancel();
        }
        mAppToast = Toast.makeText(context, text, duration);
        mAppToast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
