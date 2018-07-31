package parser;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zm on 13.02.2018.
 */
public class StatusBar extends JLabel {

    public StatusBar() {

        super();

        super.setPreferredSize(new Dimension(100, 16));

        setMessage("заполните поля и нажмите Сформировать");

    }



    public void setMessage(String message) {

        setText(" "+message);

    }

}
