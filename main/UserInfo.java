package main;

import main.data.ArmorData;
import main.data.BossData;
import main.data.FishingData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInfo extends JFrame {

    public UserInfo(){
        super("Статистика");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(5,1,2,6));

        JLabel desc = new JLabel("Вот информация о вас: ");
        JLabel lvl = new JLabel("Ваш уровень - "+ BossData.getLvl());
        JLabel health = new JLabel("Ваше здоровье - "+BossData.getPostAllHP());
        JLabel armor = new JLabel("Ваша броня - "+ ArmorData.getArmorCount());
        JLabel sword = new JLabel("Ваш меч - "+ SwordData.getSword());
        JLabel boat = new JLabel("Ваша лодка - "+ FishingData.showIsBoard());
        JLabel bossCount = new JLabel("Кол во побежденных боссов -"+BossData.getBossCountWin());
        JButton exit = new JButton("В меню");

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        container.add(desc);
        container.add(lvl);
        container.add(health);
        container.add(armor);
        container.add(sword);
        container.add(boat);
        container.add(bossCount);
        container.add(exit);
        pack();
    }

}
