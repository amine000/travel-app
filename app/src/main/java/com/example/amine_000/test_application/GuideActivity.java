package com.example.amine_000.test_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class GuideActivity extends ActionBarActivity {

    private ListView listView1;

    String desc1 = "I'm a lifelong resident of San Fransisco. You could say I've tried every eatery in the place.";
    String desc2 = "I'm a San Fransisco taxi driver, and I've driven literally every road in 'sisco";
    String desc3 = "I've lived in San Fransisco since 1997, and I know this place inside and out.";
    String desc4 = "I'm a professional food critic, trust me to help you find the best places in San Francisco";
    String desc5 = "I'm a teacher in the San Fransisco District, and I love spending my evenings with my husband in the beautiful" +
            "place called San Fransisco. Let me show you around";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_guide);

        final Guide guide_data[] = new Guide[]
                {
                        new Guide(R.drawable.app_pic_1, "Angela", "Rating: 2/5", desc1 ),
                        new Guide(R.drawable.arshy, "Arsh", "Rating: 3/5", desc2),
                        new Guide(R.drawable.ishmam, "Ishmam","Rating: 3/5", desc3 ),
                        new Guide(R.drawable.nirmit_shah, "Nirmit", "Rating: 3/5", desc4),
                        new Guide(R.drawable.ayush, "Ayush", "Rating: 3/5", desc5)
                };

        GuideAdapter adapter = new GuideAdapter(this,
                R.layout.listview_item_row, guide_data);


        listView1 = (ListView)findViewById(R.id.listView1);

        //View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
        //listView1.addHeaderView(header);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = "FUCKBOIS";

                int pos = position;
                Guide guideSelected =  guide_data[pos];
                int picture = guideSelected.picture;
                String name = guideSelected.name;
                String description = guideSelected.descrip;
                String rating = guideSelected.rating;

                Intent intent = new Intent(GuideActivity.this, GuideInfo.class);
                intent.putExtra("NAME", name);
                intent.putExtra("DESCRIP", description);
                intent.putExtra("RATING", rating);
                intent.putExtra("PICTURE", picture);
                startActivity(intent);

            }
        });
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
