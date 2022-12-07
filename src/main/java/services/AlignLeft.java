package services;

import models.Paragraph;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph p) {
        String text=p.getText();

        text=text+"####################";

        p.setText(text);
    }

}
