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
}
