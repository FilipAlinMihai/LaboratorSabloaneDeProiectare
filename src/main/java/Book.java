import java.util.ArrayList;

public class Book {

    private String nume;
    private ArrayList<String> paragrafe;
    private ArrayList<String> imagini;
    private ArrayList<String> tabele;

    public Book()
    {

    }
    public Book(String nume)
    {
        this.nume=nume;
        paragrafe=new ArrayList<String>();
        imagini=new ArrayList<String>();
        tabele=new ArrayList<String>();
    }

    public void createNewParagraph(String continut)
    {
        paragrafe.add(continut);
    }

    public void createNewImage(String continut)
    {
        imagini.add(continut);
    }

    public void createNewTable(String continut)
    {
        tabele.add(continut);
    }


    public void print()
    {
       for(String s : paragrafe)
       {
           System.out.println(s);
       }
        for(String s : imagini)
        {
            System.out.println(s);
        }
        for(String s : tabele)
        {
            System.out.println(s);
        }

    }
    
}
