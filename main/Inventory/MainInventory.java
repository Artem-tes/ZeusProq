package main.Inventory;

import main.MainMenu;
import main.data.MiningData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInventory extends JFrame {

    public MainInventory(){

        super("Инвентарь");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(7,3,2,6));


        JLabel desc = new JLabel("Вот ваш инвентарь:");
        JLabel treeInfo = new JLabel("Кол-во дерева : "+ MiningData.getTree());
        JLabel stoneInfo = new JLabel("Кол-во камня: "+MiningData.getStone());
        JLabel ironInfo = new JLabel("Кол-во железа: "+MiningData.getIron());
        JLabel diamondInfo = new JLabel("Кол-во алмаза: "+MiningData.getDiamond());
        JLabel swordInfo = new JLabel("Действующий меч: "+ SwordData.getSword());

        container.add(desc);
        container.add(treeInfo);
        container.add(stoneInfo);
        container.add(ironInfo);
        container.add(diamondInfo);
        container.add(swordInfo);

        JButton tutorial = new JButton("Подсказка");
        JButton fishInventory = new JButton("Рыбный инвентарь");
        JButton exit = new JButton("В меню");

        tutorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,
                        "Полезные ископаемые нужны для того чтобы из них делать мечи\n" +
                                "Мечи нужны чтобы убить босса!\n" +
                                "Ваш действующий меч отображается в инвентаре.","Подсказка",JOptionPane.PLAIN_MESSAGE);

            }
        });

        fishInventory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FishInventory fishInventory1 = new FishInventory();
                fishInventory1.setVisible(true);
                dispose();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        container.add(tutorial);
        container.add(fishInventory);
        container.add(exit);
        pack();




    }

}