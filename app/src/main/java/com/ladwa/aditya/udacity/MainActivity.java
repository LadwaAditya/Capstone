package com.ladwa.aditya.udacity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSpotify, btnScores, btnLibrary, btnBuildItBigger, btnXyz, btnCapStone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Declare buttons
        btnSpotify = (Button) findViewById(R.id.spotifystreamer);
        btnScores = (Button) findViewById(R.id.scoreapp);
        btnLibrary = (Button) findViewById(R.id.libraryapp);
        btnBuildItBigger = (Button) findViewById(R.id.builditbigger);
        btnXyz = (Button) findViewById(R.id.xyzreader);
        btnCapStone = (Button) findViewById(R.id.capstone);

        //Set on Click listeners
        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXyz.setOnClickListener(this);
        btnCapStone.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotifystreamer:
                showToast(getString(R.string.spotify_streamer));
                break;
            case R.id.scoreapp:
                showToast(getString(R.string.scores_app));
                break;
            case R.id.libraryapp:
                showToast(getString(R.string.library_app));
                break;
            case R.id.builditbigger:
                showToast(getString(R.string.build_it_bigger));
                break;
            case R.id.xyzreader:
                showToast(getString(R.string.xyz_reader));
                break;
            case R.id.capstone:
                showToast(getString(R.string.capstone));
                break;

        }
    }

    public void showToast(CharSequence s) {
        Toast.makeText(getApplicationContext(), getString(R.string.button_launch) + " " + s.toString(), Toast.LENGTH_SHORT).show();
    }
}
