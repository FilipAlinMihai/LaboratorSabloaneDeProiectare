package models;

import org.json.JSONException;
import org.json.JSONObject;

public interface Element {

    public void print();
    public void add(Element e);
    public void remove(Element e);
    public Element get(int x);
    public void accept(Visitor v) throws JSONException;

    public JSONObject toJson() throws JSONException;
}
