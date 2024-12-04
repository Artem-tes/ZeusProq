package main.sword;

import main.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSword extends JFrame {

    public MainSword(){

        super("Мечи");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(6,10,2,6));

        JLabel desc = new JLabel("  Выберите какой меч хотите приобрести");

        JButton treeSword = new JButton("Деревянный меч");
        JButton stoneSword = new JButton("Каменный меч");
        JButton ironSword = new JButton("Железный меч");
        JButton diamondSword = new JButton("Алмазный меч");
        JButton exitButton = new JButton("В меню");

        container.add(desc);

        treeSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuyTreeSword buyTreeSword = new BuyTreeSword();
                buyTreeSword.setVisible(true);
                dispose();
            }
        });

        stoneSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuyStoneSword buyStoneSword = new BuyStoneSword();
                buyStoneSword.setVisible(true);
                dispose();
            }
        });


        ironSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuyIronSword buyIronSword = new BuyIronSword();
                buyIronSword.setVisible(true);
                dispose();
            }
        });

        diamondSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuyDiamondSword buyDiamondSword = new BuyDiamondSword();
                buyDiamondSword.setVisible(true);
                dispose();
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

        container.add(treeSword);
        container.add(stoneSword);
        container.add(ironSword);
        container.add(diamondSword);
        container.add(exitButton);
        pack();

    }

}
