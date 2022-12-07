package services;

import models.*;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.FileWriter;
import java.io.IOException;

public class BookSaveVisitor implements Visitor {

    public JSONArray obiecte = new JSONArray();

    @Override
    public void visitBook(Book e) throws JSONException {
            obiecte.put(e.toJson());
    }

    @Override
    public void visitSection(Section e) throws JSONException {
        obiecte.put(e.toJson());
    }

    @Override
    public void visitTableOfContents(TableOfContents e) throws JSONException {
        obiecte.put(e.toJson());
    }

    @Override
    public void visitParagraph(Paragraph e) throws JSONException {
        obiecte.put(e.toJson());
    }

    @Override
    public void visitImageProxy(ImageProxy e) throws JSONException {
        obiecte.put(e.toJson());
    }

    @Override
    public void visitImage(Image e) throws JSONException {
        obiecte.put(e.toJson());
    }

    @Override
    public void visitTable(Table e) throws JSONException {
        obiecte.put(e.toJson());
    }


    public void print()
    {
        try (FileWriter file = new FileWriter("book.json")) {

            file.write(obiecte.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
