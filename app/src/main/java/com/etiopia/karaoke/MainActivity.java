package com.etiopia.karaoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String TAB = "TAB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button artistButton = (Button) findViewById(R.id.artists);
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTabbedActivity(1);
            }
        });
        Button albumsButton = (Button) findViewById(R.id.albums);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTabbedActivity(2);
            }
        });
        Button favoritesButton = (Button) findViewById(R.id.favorites);
        favoritesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTabbedActivity(3);
            }
        });
        Button songButton = (Button) findViewById(R.id.last_played);
        songButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTabbedActivity(0);
            }
        });
    }

    private void startTabbedActivity(int position){
        Intent intent = new Intent(this, TabbedActivity.class);
        intent.putExtra("POSITION", position);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
