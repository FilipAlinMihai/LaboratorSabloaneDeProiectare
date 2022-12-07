package models;

import org.json.JSONException;
import org.json.JSONObject;

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
    public void accept(Visitor v) throws JSONException {
            v.visitTableOfContents(this);
    }

    @Override
    public JSONObject toJson() throws JSONException {
        JSONObject img=new JSONObject();


        img.put("tip","TableOfContents");

        return img;
    }
}
