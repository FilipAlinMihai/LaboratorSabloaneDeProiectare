package models;

import java.io.Serializable;

public class Author implements Serializable {

    private String name;

    public Author(String n)
    {
        name=n;
    }

    public void print()
    {
        System.out.println("Author :"+name);
    }


}
