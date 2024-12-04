package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infoGame extends JFrame {

    private boolean closeInfo = true;

    public boolean isCloseInfo() {
        return closeInfo;
    }

    public infoGame(){
        super("Информация об игре");
        super.setBounds(750,250,300,400);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,3,2,3));


        JLabel info = new JLabel("Игра написана на языке Java\n" +
                "Использован frameWork - swing\n" +
                "\n" +
                "Game was be writed for Java language\n" +
                "FrameWork from use - Swing");
        JButton exit = new JButton("Закрыть");
        container.add(info);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        container.add(info);
        container.add(exit);


    }

}
