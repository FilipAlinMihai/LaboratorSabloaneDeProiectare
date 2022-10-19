import java.util.ArrayList;

public class Chapter {
    private String name;
    private int index;
    private ArrayList<SubChapter> subChapters;
    public Chapter (String name)
    {
        this.name=name;
        subChapters=new ArrayList<>();
    }
    public void setIndex(int i)
    {
        index=i;
    }
    public int getIndex()
    {
        return this.index;
    }
    public int createSubChapter(String name)
    {
        SubChapter sch=new SubChapter(name);
        sch.setIndex(subChapters.size()+1);
        subChapters.add(sch);
        return subChapters.size();
    }
    public SubChapter getSubChapter(int i)
    {
        for(SubChapter sc:subChapters)
            if(sc.getIndex()==i)
                return sc;
        return null;
    }

    public void print()
    {
        for(SubChapter sc:subChapters)
            sc.print();
    }
}
