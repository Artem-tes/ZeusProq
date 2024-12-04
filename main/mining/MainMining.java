package main.mining;



import main.MainMenu;
import main.data.MiningData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMining extends JFrame {

    public MainMining(){
        super("Добыча");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(5,10,2,6));

        JLabel prediction = new JLabel("Выберите что будете добывать");

        JButton treeMiningButton = new JButton("Дерево");
        JButton stoneMiningButton = new JButton("Камень");
        JButton ironMiningButton = new JButton("Железо");
        JButton diamondMiningButton = new JButton("Алмаз");
        JButton exitButton = new JButton("В меню");



        treeMiningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TreeMining treeMining = new TreeMining();
                treeMining.setVisible(true);
                dispose();
            }
        });

        stoneMiningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getTree() > 50) {
                    StoneMining stoneMining = new StoneMining();
                    stoneMining.setVisible(true);
                    dispose();
                } else{
                    JOptionPane.showConfirmDialog(null,"Чтобы добывать камень нужно чтобы " +
                            "на балансе было более 50 дерева","Предупреждение",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        ironMiningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getStone() > 50) {
                    IronMining ironMining = new IronMining();
                    ironMining.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showConfirmDialog(null,"Чтобы добывать железо нужно чтобы " +
                            "на балансе было более 50 камня","Предупреждение",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });


        diamondMiningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getIron()>50) {
                    DiamondMining diamondMining = new DiamondMining();
                    diamondMining.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showConfirmDialog(null,"Чтобы добывать алмаз нужно чтобы " +
                            "на балансе было более 50 железа","Предупреждение",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });



        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });



        container.add(prediction);
        container.add(treeMiningButton);
        container.add(stoneMiningButton);
        container.add(ironMiningButton);
        container.add(diamondMiningButton);
        container.add(exitButton);
        pack();


    }

}
