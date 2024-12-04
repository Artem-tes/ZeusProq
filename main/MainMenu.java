package main;

import main.Boss.MainBoss;
import main.Inventory.MainInventory;
import main.data.BossData;
import main.fishing.ManFishing;
import main.mining.MainMining;
import main.sword.MainSword;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {



    public MainMenu(){
        super("Главное меню");
        super.setBounds(750,250,300,400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(5,1,2,6));

        //инизиализая лейблов и кнопоок

        JLabel lvlInfo = new JLabel("Мастер Арены");

        JButton miningButton = new JButton("Добыча");
        JButton inventoryButton = new JButton("Инвентарь");
        JButton buySwordButton = new JButton("Купить меч");
        JButton fishing = new JButton("Рыбалка");
        JButton fightBossButton = new JButton("Бой с боссом");
        JButton userInfo = new JButton("Статистика");
        JButton IngenerInfo = new JButton("Информация о разработчике");


        miningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMining mainMining = new MainMining();
                mainMining.setVisible(true);
                dispose();
            }
        });

        inventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInventory mainInventory = new MainInventory();
                mainInventory.setVisible(true);
                dispose();
            }
        });

        fishing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManFishing manFishing = new ManFishing();
                manFishing.setVisible(true);
                dispose();
            }
        });

        buySwordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainSword mainSword = new MainSword();
                mainSword.setVisible(true);
                dispose();
            }
        });


        fightBossButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainBoss mainBoss = new MainBoss();
                mainBoss.setVisible(true);
                dispose();
            }
        });



        userInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserInfo userInfo1 = new UserInfo();
                userInfo1.setVisible(true);
                dispose();
            }
        });


        IngenerInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"Привет!\n" +
                        "Меня зовут Артем я занимаюсь разработкой игр\n" +
                        "Эта игра написана на Java\n" +
                        "С использованием фреймворка - Swing","Оповещение",JOptionPane.PLAIN_MESSAGE);
            }
        });






        container.add(lvlInfo);
        container.add(miningButton);
        container.add(inventoryButton);
        container.add(fishing);
        container.add(buySwordButton);
        container.add(fightBossButton);
        container.add(userInfo);
        container.add(IngenerInfo);
        pack();

    }

}
