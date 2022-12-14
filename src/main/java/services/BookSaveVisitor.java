package services;

import com.google.gson.Gson;
import models.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

public class BookSaveVisitor implements Visitor {

    public JSONArray obiecte = new JSONArray();
    Gson gson = new Gson();
    FileOutputStream fos = new FileOutputStream("book.json");
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    public BookSaveVisitor() throws IOException {
    }

    @Override
    public void visitBook(Book e) throws JSONException, IOException {
            //obiecte.put(e);
        oos.writeObject(e);
    }

    @Override
    public void visitSection(Section e) throws JSONException, IOException {
        //obiecte.put(e);
        oos.writeObject(e);
    }

    @Override
    public void visitTableOfContents(TableOfContents e) throws JSONException, IOException {
        //obiecte.put(e);
        oos.writeObject(e);
    }

    @Override
    public void visitParagraph(Paragraph e) throws JSONException, IOException {
        //obiecte.put(e);
        oos.writeObject(e);
    }

    @Override
    public void visitImageProxy(ImageProxy e) throws JSONException, IOException {
        //obiecte.put(e);
        oos.writeObject(e);
    }

    @Override
    public void visitImage(Image e) throws JSONException, IOException {
        //obiecte.put(e);
        oos.writeObject(e);
    }

    @Override
    public void visitTable(Table e) throws JSONException, IOException {
        //obiecte.put(e);
       oos.writeObject(e);
    }


    public void print()
    {
//        try (FileWriter file = new FileWriter("book.json")) {
//
//            file.write(obiecte.toString());
//            file.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
