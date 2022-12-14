package models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.Serializable;

public class Table implements  Element, Serializable {

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
    public void accept(Visitor v) throws JSONException, IOException {
        v.visitTable(this);
    }


}
