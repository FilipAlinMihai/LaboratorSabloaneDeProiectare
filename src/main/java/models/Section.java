package models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Section implements Element, Serializable {

    protected String name;
    protected int index;
    protected ArrayList<Element> elements;
    public Section(String name)
    {
        this.name=name;
        elements=new ArrayList<>();
    }

    public void print()
    {
        System.out.println(name);
        for(Element p:elements)
            p.print();

    }

    public void add(Element e){

        if(!elements.contains(e))
            elements.add(e);
        else
        {
            System.out.println("Elementul nu a fost adaugat! Nu sunt suportate duplicate!");
        }
    }
    public void remove(Element e)
    {
        elements.remove(e);
    }

    public Element get(int x) {
        return elements.get(x);
    }

    @Override
    public void accept(Visitor v) throws JSONException, IOException {
        v.visitSection(this);
        for(Element e:elements)
            e.accept(v);
    }



}
