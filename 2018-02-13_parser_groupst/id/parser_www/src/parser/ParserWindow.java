package parser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by zm on 13.02.2018.
 */
class ParserWindow extends JFrame {
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 250;
    private static final int WINDOW_POS_X = 650;
    private static final int WINDOW_POS_Y = 250;


    private TypeTraffic[] typeTraffics;
    private TypeTraffic typeTraffic;
    private JComboBox typeTrafficBox;


    private LineTraffic[] lineTraffics;
    private LineTraffic lineTraffic;
    private JComboBox lineTrafficBox;

    private JLabel jLabelStatus;
    private JLabel statusBar;


    ParserWindow(){
        //общие настройки
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setTitle("Парсинг сайтов по услугам перевозки грузов");
        setResizable(false);

        //начальное заполнение
        preparation();

        // верхняя часть - настройки

        Container c = new Container();
        addControls(c);
        add(c, BorderLayout.NORTH);

        // центральная часть - панель статуса



        //нижняя часть - кнопка Сформировать
        JButton btnReport = new JButton("Сформировать");
        btnReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startReport();
            }
        });

        JPanel panelBottom = new JPanel(new GridLayout(1,1));
        panelBottom.add(btnReport);

        add(panelBottom,BorderLayout.SOUTH);






        // начальное заполнение
        setVisible(true);
    }

    void addControls(Container container){
        container.setLayout(new GridLayout(7, 1));
        /*
        * вид перевозки
        */
        JLabel jLabelType = new JLabel("Выберите вид перевозки:");
        container.add(jLabelType);
        typeTrafficBox = new JComboBox();

        typeTrafficBox.addItem("");
        for (int i = 0; i < typeTraffics.length; i++) {
            typeTrafficBox.addItem(typeTraffics[i].getType());
        }

        typeTrafficBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //setupTypeTraffic(e);
                }
            }
        });

        container.add(typeTrafficBox);


        /*
        * направление перевозки
        */
        JLabel jLabelLine = new JLabel("Выберите направление перевозки:");
        container.add(jLabelLine);
        lineTrafficBox = new JComboBox();
        lineTrafficBox.addItem("");
        for (int i = 0; i < lineTraffics.length; i++) {
            lineTrafficBox.addItem(lineTraffics[i].getLine());

        }
        container.add(lineTrafficBox);


        /*
        * пустая строка
        */
        JLabel jLabelEmpty = new JLabel("");
        container.add(jLabelEmpty);

        JLabel jLabelStatusText = new JLabel("Состояние:");
        container.add(jLabelStatusText);

        statusBar = new StatusBar();
        container.add(statusBar);

    }

    void preparation(){
        //виды перевозки
        this.typeTraffics = new TypeTraffic[2];
        this.typeTraffics[0] = new TypeTraffic("Авиа перевозка");
        this.typeTraffics[1] = new TypeTraffic("ЖД перевозка");

        this.lineTraffics = new LineTraffic[2];
        this.lineTraffics[0] = new LineTraffic("Москва - Владивосток");
        this.lineTraffics[1] = new LineTraffic("Москва - Петропавловск-Камчатский");

    }

    private void setupTypeTraffic(ItemEvent event){

//        typeTraffic = typeTraffics[typeTrafficBox.getSelectedIndex()-1];
//
//        System.out.println(typeTraffic.getType());

    }

    boolean checkFill(){
        boolean res = true;
        if (typeTrafficBox.getSelectedIndex() == 0){
            statusBar.setText("не заполнено: вид перевозки");
            return false;
        }
        if (lineTrafficBox.getSelectedIndex() == 0) {
            statusBar.setText("не заполнено: направление перевозки");
            return false;
        }

        statusBar.setText("");
        return res;
    }

    void startReport(){
        //System.out.println("Starting report");
        if (!checkFill()) return;

        System.out.println(typeTrafficBox.getSelectedItem() + " " + lineTrafficBox.getSelectedItem());
        statusBar.setText("парсим сайты...");

        //System.out.println(statusBar);
        //statusBar.setText("123");

    }




}
