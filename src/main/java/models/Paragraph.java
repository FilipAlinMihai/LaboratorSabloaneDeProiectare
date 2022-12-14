package models;

import org.json.JSONException;
import org.json.JSONObject;
import services.AlignStrategy;

import java.io.IOException;
import java.io.Serializable;

public class Paragraph implements Element, Serializable {

    private String text;
    public Paragraph(String t)
    {
        text=t;
    }

    private AlignStrategy strategy;
    public void print()
    {
        System.out.println("Paragraph: "+text);
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
        v.visitParagraph(this);
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy a)
    {
        this.strategy=a;
        a.render(this);
    }

}
