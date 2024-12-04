package main.fishing;

import main.data.FishingData;
import main.data.MiningData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyBoard extends JFrame {

    public BuyBoard(){
        super("Рыбалка");

        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(6,2,2,6));

        JLabel desc = new JLabel("Чтобы рыбачить в океане вам нужна лодка!");
        JLabel postDesc = new JLabel("Это один раз и навсегда!");
        JLabel balance = new JLabel("Ваш баланс дерева - "+MiningData.getTree());
        JLabel price = new JLabel("Цена - 50 дерева");

        container.add(desc);
        container.add(postDesc);
        container.add(balance);
        container.add(price);

        JButton buyBoard = new JButton("Купить");
        JButton exit = new JButton("Назад");

        buyBoard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getTree()>50){
                    MiningData.setTree(MiningData.getTree()-50);
                    FishingData.setIsBoard(true);
                    JOptionPane.showConfirmDialog(null,"Вы успешно купили лодку!","" +
                            "Покупка",JOptionPane.PLAIN_MESSAGE);
                    balance.setText("Ваш баланс дерева - "+MiningData.getTree());
                } else {
                    JOptionPane.showConfirmDialog(null,"У вас нет дерева на эту покупку\n" +
                            "У вас - "+MiningData.getTree()+"\nНужно - 50","Покупка",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManFishing manFishing = new ManFishing();
                manFishing.setVisible(true);
                dispose();
            }
        });

        container.add(buyBoard);
        container.add(exit);
        pack();

    }
}
