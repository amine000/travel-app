package com.example.amine_000.test_application;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class GuideActivity extends ActionBarActivity {

    private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_guide);

        Guide guide_data[] = new Guide[]
                {
                        new Guide(R.drawable.app_pic_1, "Angela"),
                        new Guide(R.drawable.arshy, "Arsh"),
                        new Guide(R.drawable.ishmam, "Ishmam"),
                        new Guide(R.drawable.nirmit_shah, "Nirmit"),
                        new Guide(R.drawable.ayush, "Ayush")
                };

        GuideAdapter adapter = new GuideAdapter(this,
                R.layout.listview_item_row, guide_data);


        listView1 = (ListView)findViewById(R.id.listView1);

        //View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
        //listView1.addHeaderView(header);

        listView1.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_guide, menu);
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
