import java.util.concurrent.Phaser;

public class Paragraph implements Element{

    private String text;
    public Paragraph(String t)
    {
        text=t;
    }
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
}
