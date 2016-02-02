package com.ladwa.aditya.udacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.spotifystreamer)
    Button btnSpotify;
    @Bind(R.id.scoreapp)
    Button btnScores;
    @Bind(R.id.libraryapp)
    Button btnLibrary;
    @Bind(R.id.builditbigger)
    Button btnBuildItBigger;
    @Bind(R.id.xyzreader)
    Button btnXyz;
    @Bind(R.id.capstone)
    Button btnCapStone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

    @OnClick({R.id.spotifystreamer, R.id.scoreapp, R.id.libraryapp, R.id.builditbigger, R.id.xyzreader, R.id.capstone})
    public void showToast(Button b) {

        Toast.makeText(getApplicationContext(), getString(R.string.button_launch) + " " + b.getText(), Toast.LENGTH_SHORT).show();
    }
}
