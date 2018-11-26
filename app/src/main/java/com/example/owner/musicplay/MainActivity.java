package com.example.owner.musicplay;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Lil Nard category
        TextView lilNard = (TextView) findViewById(R.id.nardMusic);

// Set a click listener on that View
        if (lilNard != null) {
            lilNard.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent nardIntent = new Intent(MainActivity.this, nardActivity.class);
                    startActivity(nardIntent);
                }
            });
        }
        // Find the View that shows the tank category
        TextView tank = (TextView) findViewById(R.id.tankMusic);
        // Set a click listener on that View
        if (tank != null) {
            tank.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the tank category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link tankActivity}
                    Intent tankIntent = new Intent(MainActivity.this, tankActivity.class);
                    // Start the new activity
                    startActivity(tankIntent);
                }
            });

            // Find the View that shows the dumo category
            TextView dumoSquad = (TextView) findViewById(R.id.dumoMusic);
            // Set a click listener on that View
            if (dumoSquad != null) {
                dumoSquad.setOnClickListener(new View.OnClickListener() {
                    // The code in this method will be executed when the Dumo Squad category is clicked on.
                    @Override
                    public void onClick(View view) {
                        // Create a new intent to open the {@link dumoActivity}
                        Intent dumoIntent = new Intent(MainActivity.this, dumoActivity.class);
                        // Start the new activity
                        startActivity(dumoIntent);
                    }
                });

                // Find the View that shows the Inflators category
                TextView inflators = (TextView) findViewById(R.id.inflatorMusic);
                // Set a click listener on that View
                if (inflators != null) {
                    inflators.setOnClickListener(new View.OnClickListener() {
                        // The code in this method will be executed when the Inflators category is clicked on.
                        @Override
                        public void onClick(View view) {
                            // Create a new intent to open the {@link inflatorsActivity}
                            Intent inflatorsIntent = new Intent(MainActivity.this, inflatorsActivity.class);
                            // Start the new activity
                            startActivity(inflatorsIntent);
                        }
                    });
                }

            }
        }
    }

  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}