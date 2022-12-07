package models;

import models.*;
import org.json.JSONException;

public interface Visitor {

   public  void visitBook(Book e) throws JSONException;
   public  void visitSection(Section e) throws JSONException;
   public  void visitTableOfContents(TableOfContents e) throws JSONException;
   public  void visitParagraph(Paragraph e) throws JSONException;
   public  void visitImageProxy(ImageProxy e) throws JSONException;
   public  void visitImage(Image e) throws JSONException;
   public  void visitTable(Table e) throws JSONException;

}
