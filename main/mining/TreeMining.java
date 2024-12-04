package main.mining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.data.MiningData;
import main.data.MiningData.*;
public class TreeMining extends JFrame {


    public TreeMining(){
        super("Добыча дерева");
        super.setBounds(750,250,300,400);


        //создание контейнера

        MiningData miningData = new MiningData();


        Container container = super.getRootPane();
        container.setLayout(new GridLayout(4,10,2,6));

        JLabel desc = new JLabel("Чтобы добыть дерево вам нужно на него кликать!");
        JLabel treeCount = new JLabel("Кол-во дерева: "+miningData.getTree());

        JButton havetree = new JButton("Добыть дерево");
        JButton exit = new JButton("Назад");

        havetree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miningData.setPlusTree(1);
                treeCount.setText("Кол-во дерева: "+miningData.getTree());

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

        container.add(treeCount);
        container.add(desc);
        container.add(havetree);
        container.add(exit);
        pack();
    }

}
