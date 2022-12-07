public class TableOfContents implements  Element{


    public void print()
    {
        System.out.println("Table of Contents");
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
    public void accept(Visitor v) {
            v.visitTableOfContents(this);
    }
}
