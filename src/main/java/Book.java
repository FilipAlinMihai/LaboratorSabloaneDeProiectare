import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<Author> authors;
    private ArrayList<Chapter> chapters;
    public Book(String nume)
    {
        this.name=nume;
        chapters=new ArrayList<>();
        authors=new ArrayList<>();
    }
    public void addAuthor(Author a)
    {
        authors.add(a);
    }
    public int createChapter(String name)
    {
        Chapter ch=new Chapter(name);
        ch.setIndex(chapters.size()+1);
        chapters.add(ch);
        return chapters.size();
    }
    public Chapter getChapter(int i)
    {
        for(Chapter c:chapters)
            if(c.getIndex()==i)
                return c;
        return null;
    }
    public void print()
    {
        System.out.println("Book :"+name);
        for(Author a:authors)
            a.print();
        for(Chapter ch:chapters)
            ch.print();
    }

}
