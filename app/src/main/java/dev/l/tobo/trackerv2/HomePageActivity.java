package dev.l.tobo.trackerv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Log.d("TrackerApp","Starting");
    }
    public void launchBrowseActivity(View view){
        Log.d("TrackerApp","LaunchBrowseActivity");
        Intent i = new Intent(this, BrowseActivity.class);
        startActivity(i);
    }
}
