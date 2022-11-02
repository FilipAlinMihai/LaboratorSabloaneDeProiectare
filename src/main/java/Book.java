import java.util.ArrayList;

public class Book extends  Section{
    private ArrayList<Author> authors;


    public Book(String nume)
    {
        super(nume);
        authors=new ArrayList<>();
    }
    public void addAuthor(Author a)
    {
        authors.add(a);
    }
//    public int createChapter(String name)
//    {
//        Chapter ch=new Chapter(name);
//        ch.setIndex(chapters.size()+1);
//        chapters.add(ch);
//        return chapters.size();
//    }
//    public Chapter getChapter(int i)
//    {
//        for(Chapter c:chapters)
//            if(c.getIndex()==i)
//                return c;
//        return null;
//    }

    public void addContent(Element e)
    {
        super.add(e);
    }
    @Override
    public void print()
    {
        System.out.println("Book :"+super.name);
        for(Author a:authors)
            a.print();
        for(Element ch:super.elements)
            ch.print();
    }

}
