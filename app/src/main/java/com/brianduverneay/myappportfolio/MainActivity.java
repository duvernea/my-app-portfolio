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

    /* Button variables
    private Button mSpotifyButton;
    private Button mScoresButton;
    private Button mLibraryButton;
    private Button mBuilditbiggerButton;
    private Button mXYZreaderButton;
    private Button mCapstoneButton;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v) {
        CharSequence text="";
        switch (v.getId()) {
            case R.id.spotify_streamer_button:
                text="Spotify Streamer";
                break;
            case R.id.scores_app_button:
                text="Scores App";
                break;
            case R.id.library_app_button:
                text="Library App";
                break;
            case R.id.build_it_bigger_app_button:
                text="Build It Bigger App";
                break;
            case R.id.xyz_reader__appbutton:
                text="XYZ Reader App";
                break;
            case R.id.capstone_button:
                text="Capstone App";
                break;
            default:
                text="default";

        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        text = "This button will launch my " + text + "!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
