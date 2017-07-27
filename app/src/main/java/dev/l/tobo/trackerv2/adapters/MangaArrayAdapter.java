package dev.l.tobo.trackerv2.adapters;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import dev.l.tobo.trackerv2.HomePageActivity;
import dev.l.tobo.trackerv2.R;

import java.util.ArrayList;

public class MangaArrayAdapter extends ArrayAdapter<String> {
    public MangaArrayAdapter(Context context, ArrayList<String> users) {
        super(context, 0, users);
        Log.d("TrackerApp","MangaArrayAdapter contructor");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("TrackerApp","MangaArrayAdapter getView");
        //Manga manga=getItem(position);
        String manga = getItem(position);

        Log.d("TrackerApp","Make Layouinlfater");
        LayoutInflater inflater=(LayoutInflater)super.getContext().getSystemService(HomePageActivity.LAYOUT_INFLATER_SERVICE);
        Log.d("TrackerApp","inflate view");
        convertView= inflater.inflate(R.layout.browse_list_item,null);
        Log.d("TrackerApp","title");
        TextView title=(TextView)convertView.findViewById(R.id.titleText);
        Log.d("TrackerApp","chapter");
        TextView desc=(TextView)convertView.findViewById(R.id.chapterText);
        //title.setText(manga.getTitle());
        title.setText(manga);
        //desc.setText(Integer.toString(manga.getChapterAmount()));
        Log.d("TrackerApp","ret view");
        return convertView;
    }
}