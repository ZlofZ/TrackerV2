package dev.l.tobo.trackerv2.Models;

import java.util.ArrayList;

public class Manga {
    private ArrayList<Chapter> chapterList;
    private String title;
    private String description;
    public Manga(String title, String description){
        this.title=title;
        this.description=description;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public int getChapterAmount(){
        if(chapterList==null)return 0;
        else return chapterList.size();
    }
}
