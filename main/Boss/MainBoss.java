package main.Boss;

import main.MainMenu;
import main.data.ArmorData;
import main.data.BossData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainBoss extends JFrame {

    public MainBoss(){
        super("Меню босса");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(5,1,2,6));

        int armor = ArmorData.getArmorCount();
        int hp = BossData.getHealth();

        int allHP = hp + armor;

        JLabel lvl = new JLabel("Ваш уровень - "+BossData.getLvl());
        JLabel health = new JLabel("Ваше здоровье - "+ BossData.getPostAllHP());
        JLabel lvlBoss = new JLabel("Уровень босса - "+BossData.getLvlBoss());
        JLabel sword = new JLabel("Ваш меч - "+ SwordData.getSword());

        JButton fight = new JButton("Сражаться");
        JButton exit = new JButton("В меню");

        container.add(lvl);
        container.add(health);
        container.add(lvlBoss);
        container.add(sword);

        fight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(BossData.getPostAllHP()+ArmorData.getArmorCount()<100){
                    JOptionPane.showConfirmDialog(null,
                            "Вам нужно иметь более чем 100ед брони и хп для того чтобы начать",
                            "Предупреждение",JOptionPane.PLAIN_MESSAGE);
                }else {
                    MainFightBoss mainFightBoss = new MainFightBoss();
                    mainFightBoss.setVisible(true);
                    dispose();
                }
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

        container.add(fight);
        container.add(exit);
        pack();



    }

}
