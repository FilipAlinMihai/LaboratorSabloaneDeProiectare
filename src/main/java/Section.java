import java.util.ArrayList;

public class Section implements Element{

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
        elements.add(e);
    }
    public void remove(Element e)
    {
        elements.remove(e);
    }

    public Element get(int x) {
        return elements.get(x);
    }

}
