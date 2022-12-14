package models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public interface Element {

    public void print();
    public void add(Element e);
    public void remove(Element e);
    public Element get(int x);
    public void accept(Visitor v) throws JSONException, IOException;

    //public JSONObject toJson() throws JSONException;
}
