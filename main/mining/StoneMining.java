package main.mining;

import main.data.MiningData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.data.MiningData.*;


public class StoneMining extends JFrame {

    public StoneMining() {
        super("Добыча камня");
        super.setBounds(750, 250, 300, 400);


        //создание контейнера


        Container container = super.getRootPane();
        container.setLayout(new GridLayout(4, 10, 2, 6));

        MiningData miningData = new MiningData();

        JLabel desc = new JLabel("Чтобы добыть камень надо кликать!");
        JLabel postDesc = new JLabel("Кол-во камня: "+MiningData.getStone());
        JButton haveStoneButton = new JButton("Добыть камень");
        JButton exit = new JButton("Назад");

        haveStoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                MiningData.setStone(1);
                postDesc.setText("Кол-во камня: "+MiningData.getStone());
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

        container.add(postDesc);
        container.add(desc);
        container.add(haveStoneButton);
        container.add(exit);
        pack();


    }
}
