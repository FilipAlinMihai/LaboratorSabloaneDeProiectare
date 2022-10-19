import java.util.concurrent.Phaser;

public class Paragraph {

    private String text;
    public Paragraph(String t)
    {
        text=t;
    }
    public void print()
    {
        System.out.println("Paragraph: "+text);
    }
}
