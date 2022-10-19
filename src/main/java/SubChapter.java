import java.util.ArrayList;

public class SubChapter {
    private String name;
    private int index;
    private ArrayList<Element> elements;
    public SubChapter(String name)
    {
        this.name=name;
        elements=new ArrayList<>();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void createNewParagraph(String s)
    {
        elements.add(new Paragraph(s));
    }

    public void createNewImage(String s)
    {
        elements.add(new Image(s));
    }

    public void createNewTable(String s)
    {
        elements.add(new Table(s));
    }
    public void print()
    {
        System.out.println("Subchapter: "+name);
        for(Element p:elements)
            p.print();

    }


}
