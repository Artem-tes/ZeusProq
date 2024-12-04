package main.mining;

import main.data.MiningData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiamondMining extends JFrame {

    public DiamondMining(){

        super("Добыча алмаза");
        super.setBounds(750, 250, 300, 400);


        //создание контейнера


        Container container = super.getRootPane();
        container.setLayout(new GridLayout(4, 10, 2, 6));


        JLabel diamondCount = new JLabel("Кол-во алмазов: "+ MiningData.getDiamond());
        JLabel desc = new JLabel("Чтобы заработать алмаз надо кликать!");

        container.add(diamondCount);
        container.add(desc);

        JButton haveDiamond = new JButton("Добыть алмаз");
        JButton exit = new JButton("Назад");

        haveDiamond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiningData.setDiamond(1);
                diamondCount.setText("Кол-во алмазов: "+ MiningData.getDiamond());
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

        container.add(haveDiamond);
        container.add(exit);
        pack();
    }

}
