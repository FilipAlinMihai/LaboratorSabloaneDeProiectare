import java.util.ArrayList;

public class SubChapter {
    private String name;
    private int index;
    private ArrayList<Image> images;
    private ArrayList<Table> tables;
    private ArrayList<Paragraph> paragraphs;
    public SubChapter(String name)
    {
        this.name=name;
        images=new ArrayList<>();
        tables=new ArrayList<>();
        paragraphs=new ArrayList<>();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void createNewParagraph(String s)
    {
        paragraphs.add(new Paragraph(s));
    }

    public void createNewImage(String s)
    {
        images.add(new Image(s));
    }

    public void createNewTable(String s)
    {
        tables.add(new Table(s));
    }
    public void print()
    {
        System.out.println("Subchapter: "+name);
        for(Paragraph p:paragraphs)
            p.print();
        for(Image i:images)
            i.print();
        for(Table t:tables)
            t.print();
    }


}
