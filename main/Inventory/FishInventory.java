package main.Inventory;

import main.data.FishingData;
import main.fishing.EatFish;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FishInventory extends JFrame {

    public FishInventory(){

        super("Рыбный инвентарь");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(7,1,6,6));

        JLabel desc = new JLabel("Вот ваши рыбки");
        JLabel infoKaras = new JLabel("Карась: "+ FishingData.getCarasCount());
        JLabel infoChyka = new JLabel("Щука: "+FishingData.getChykaCount());
        JLabel infoFugu = new JLabel("Рыба-фугу: "+FishingData.getFuguCount());
        JLabel infoLosos = new JLabel("Лосось: "+FishingData.getLososCount());
        JLabel infoOkun = new JLabel("Окунь: "+FishingData.getOkunCount());

        container.add(desc);
        container.add(infoKaras);
        container.add(infoChyka);
        container.add(infoFugu);
        container.add(infoOkun);
        container.add(infoLosos);
        pack();

        JButton exit = new JButton("Назад");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInventory mainInventory = new MainInventory();
                mainInventory.setVisible(true);
                dispose();
            }
        });

        JButton eatFish = new JButton("Сьесть рыбу");

        eatFish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EatFish eatFish1 = new EatFish();
                eatFish1.setVisible(true);
                dispose();
            }
        });



        container.add(eatFish);
        container.add(exit);
        dispose();
    }

}
