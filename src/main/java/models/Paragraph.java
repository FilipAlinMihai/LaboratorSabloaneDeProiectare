package models;

import org.json.JSONException;
import org.json.JSONObject;
import services.AlignStrategy;

public class Paragraph implements Element{

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
    public void accept(Visitor v) throws JSONException {
        v.visitParagraph(this);
    }

    @Override
    public JSONObject toJson() throws JSONException {
        JSONObject img=new JSONObject();


        img.put("tip","Pharagraph");
        img.put("text",text);

        return img;
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
