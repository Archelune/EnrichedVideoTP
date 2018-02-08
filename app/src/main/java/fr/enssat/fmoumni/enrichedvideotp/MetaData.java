package fr.enssat.fmoumni.enrichedvideotp;

/**
 * Created by fayssalmoumni on 11/01/2018.
 */

public class MetaData {
    private int cursor;
    private String title;
    private String url;

    public MetaData(String rTitle, int rCursor, String rUrl){
        this.cursor = rCursor;
        this.url = rUrl;
        this.title = rTitle;
    }

    public int getCursor(){
        return this.cursor;
    }

    public String getUrl(){
        return this.url;
    }

    public String getTitle(){
        return this.title;
    }
}