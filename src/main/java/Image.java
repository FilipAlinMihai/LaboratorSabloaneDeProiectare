import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture {

    private String imageName;

    public Image(String name)
    {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        imageName=name;
    }

    public void print()
    {
        System.out.println("Image with name: "+imageName);
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
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public String content() {
        return null;
    }
}
