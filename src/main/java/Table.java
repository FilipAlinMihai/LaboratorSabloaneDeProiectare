public class Table implements  Element {

    private String title;
    public Table(String t)
    {
        title=t;
    }
    public void print()
    {
        System.out.println("Table with Title: "+title);
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
