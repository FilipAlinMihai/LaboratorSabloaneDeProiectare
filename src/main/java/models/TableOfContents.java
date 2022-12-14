package models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class TableOfContents implements  Element{


    public void print()
    {
        System.out.println("models.Table of Contents");
    }
    public void add(Element e){

    }
    public void remove(Element e)
    {

    }

    public Element get(int x) {
        return null;
    }

    @Override
    public void accept(Visitor v) throws JSONException, IOException {
            v.visitTableOfContents(this);
    }


}
