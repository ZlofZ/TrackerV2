package dev.l.tobo.trackerv2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import dev.l.tobo.trackerv2.Models.Manga;
import dev.l.tobo.trackerv2.adapters.MangaArrayAdapter;

import java.util.ArrayList;
import java.util.TreeSet;

public class BrowseActivity extends AppCompatActivity {
    private ArrayList<String> mangaList=new ArrayList<>();
    private TreeSet<Manga> MangaList2 = new TreeSet<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        setup();
    }
    private void setup(){
        System.out.println("makemanga");
        makeManga();
        System.out.println("mangaarrayadaoter");
        ListView lv = (ListView) findViewById(R.id.browseList);
        AutoCompleteTextView acView = (AutoCompleteTextView) findViewById(R.id.acView);

        MangaArrayAdapter maa = new MangaArrayAdapter(this.getApplicationContext(),mangaList);
        acView.setAdapter(maa);
        lv.setAdapter(maa);
    }
    private void makeManga(){
        for(int i=0;i<200;i++){
            Manga m = new Manga("Title#"+i,"Description#"+i);
            mangaList.add("thing#"+i);
        }
        mangaList.add("aaa");
        mangaList.add("aab");
    }
}
