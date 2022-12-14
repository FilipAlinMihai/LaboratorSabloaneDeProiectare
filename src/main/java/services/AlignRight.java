package services;

import models.Paragraph;

import java.io.Serializable;

public class AlignRight implements  AlignStrategy, Serializable {


    @Override
    public void render(Paragraph p) {
        String text=p.getText();

        text="####################"+text;

        p.setText(text);
    }


}
