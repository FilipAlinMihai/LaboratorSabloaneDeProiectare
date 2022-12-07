import java.awt.*;
import java.lang.reflect.Proxy;

public class ImageProxy implements Picture,Element {
        private String url;
        private Dimension dim;
        private Image realImage= null;

        public ImageProxy(String url)
        {
            this.url=url;
        }


    @Override
    public String url() {
        return this.url;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    @Override
    public String content() {
        return null;
    }

    public Image loadImage()
    {
        if(realImage==null)
        {
            realImage= new Image(url);
        }

        return  realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int x) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
            v.visitImageProxy(this);
    }
}
