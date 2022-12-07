public interface Visitor {

   public  void visitBook(Book e);
   public  void visitSection(Section e);
   public  void visitTableOfContents(TableOfContents e);
   public  void visitParagraph(Paragraph e);
   public  void visitImageProxy(ImageProxy e);
   public  void visitImage(Image e);
   public  void visitTable(Table e);

}
