package main.fishing;

import main.MainMenu;
import main.data.FishingData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManFishing extends JFrame {

    public ManFishing(){

        super("Рыбалка");

        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(6,10,2,6));

        JLabel decs = new JLabel("Вы в меню рыбалки");
        JLabel postDesc = new JLabel("Выберите кто хотите рыбачить");

        container.add(decs);
        container.add(postDesc);

        JButton pond = new JButton("В озере");
        JButton ocean = new JButton("В море");
        JButton exit = new JButton("В меню");

        pond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PondFishing pondFishing = new PondFishing();
                pondFishing.setVisible(true);
                dispose();

            }
        });

        ocean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!FishingData.isIsBoard()){
                    BuyBoard buyBoard = new BuyBoard();
                    buyBoard.setVisible(true);
                    dispose();
                }else {
                    OceanFishing oceanFishing = new OceanFishing();
                    oceanFishing.setVisible(true);
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

        container.add(pond);
        container.add(ocean);
        container.add(exit);
        pack();


    }

}

