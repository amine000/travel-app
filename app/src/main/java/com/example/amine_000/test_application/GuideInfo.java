package com.example.amine_000.test_application;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class GuideInfo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_info);

        Intent intent = getIntent();
        String message = intent.getStringExtra("NAME");
        int picture = intent.getIntExtra("PICTURE" , 0);
        TextView name = (TextView) findViewById(R.id.infoName);
        name.setText(message);
        ImageView image = (ImageView) findViewById(R.id.largeImg);
        image.setImageResource(picture);
        String rating = intent.getStringExtra("RATING");
        String descrip = intent.getStringExtra("DESCRIP");
        TextView ratingView = (TextView) findViewById(R.id.infoRating);
        TextView description = (TextView) findViewById(R.id.infoDescription);
        ratingView.setText(rating);
        description.setText(descrip);
    }

    public void connectGuide(View view){
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_guide_info, menu);
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
