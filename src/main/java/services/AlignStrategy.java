package services;

import models.Paragraph;

public interface AlignStrategy {

    public default void render(Paragraph p) {

        String text = p.getText();

        text = "####################" + text;

        p.setText(text);
    }
}
