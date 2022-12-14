package models;

import models.*;
import org.json.JSONException;

import java.io.IOException;

public interface Visitor {

   public  void visitBook(Book e) throws JSONException, IOException;
   public  void visitSection(Section e) throws JSONException, IOException;
   public  void visitTableOfContents(TableOfContents e) throws JSONException, IOException;
   public  void visitParagraph(Paragraph e) throws JSONException, IOException;
   public  void visitImageProxy(ImageProxy e) throws JSONException, IOException;
   public  void visitImage(Image e) throws JSONException, IOException;
   public  void visitTable(Table e) throws JSONException, IOException;

}
