public class BookStatistics implements Visitor{

    private int nrParagraph;
    private int nrImage;
    private int nrTable;


    @Override
    public void visitBook(Book e) {
    }

    @Override
    public void visitSection(Section e) {
    }

    @Override
    public void visitTableOfContents(TableOfContents e) {
    }

    @Override
    public void visitParagraph(Paragraph e) {
        nrParagraph=nrParagraph+1;
    }

    @Override
    public void visitImageProxy(ImageProxy e) {
        nrImage=nrImage+1;
    }

    @Override
    public void visitImage(Image e) {
        nrImage=nrImage+1;
    }

    @Override
    public void visitTable(Table e) {
        nrTable=nrTable+1;
    }

    public void printStatistics()
    {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: "+nrImage);
        System.out.println("*** Number of tables: "+nrTable);
        System.out.println("*** Number of paragraphs: "+nrParagraph);
    }
}
