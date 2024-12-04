package main.mining;

import main.data.MiningData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IronMining extends JFrame {

    public IronMining(){

        super("Добыча железа");
        super.setBounds(750, 250, 300, 400);


        //создание контейнера


        Container container = super.getRootPane();
        container.setLayout(new GridLayout(4, 10, 2, 6));

        JLabel ironCount = new JLabel("Кол-во железа: "+ MiningData.getIron());
        JLabel desc = new JLabel("Чтобы заработать железо надо кликать!");

        container.add(ironCount);
        container.add(desc);

        JButton haveIron = new JButton("Добыть железо");
        JButton exit = new JButton("Назад");

        haveIron.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiningData.setIron(1);
                ironCount.setText("Кол-во железа: "+ MiningData.getIron());
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMining mainMining = new MainMining();
                mainMining.setVisible(true);
                dispose();
            }
        });

        container.add(haveIron);
        container.add(exit);
        pack();
    }

}
