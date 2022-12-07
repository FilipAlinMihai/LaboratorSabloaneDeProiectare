package models;

import org.json.JSONException;
import org.json.JSONObject;

public class Table implements  Element {

    private String title;
    public Table(String t)
    {
        title=t;
    }
    public void print()
    {
        System.out.println("Table with Title: "+title);
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
        v.visitTable(this);
    }

    @Override
    public JSONObject toJson() throws JSONException {
        JSONObject img=new JSONObject();


        img.put("tip","Table");
        img.put("Titlu",title);

        return img;
    }
}
