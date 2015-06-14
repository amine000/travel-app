package com.example.amine_000.test_application;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aman on 6/13/15.
 */
public class GuideAdapter extends ArrayAdapter<Guide> {

    Context context;
    int layoutResourceId;
    Guide data[] = null;

    public GuideAdapter(Context context, int layoutResourceId, Guide[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        GuideHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new GuideHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
            holder.ratingText = (TextView)row.findViewById(R.id.ratingText);
            holder.description = (TextView)row.findViewById(R.id.description);

            row.setTag(holder);
        }
        else
        {
            holder = (GuideHolder)row.getTag();
        }

        Guide guide = data[position];
        holder.txtTitle.setText(guide.name);
        holder.imgIcon.setImageResource(guide.picture);
        holder.ratingText.setText(guide.rating);
        holder.description.setText(guide.descrip);

        return row;
    }

    static class GuideHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
        TextView ratingText;
        TextView description;
    }
}
