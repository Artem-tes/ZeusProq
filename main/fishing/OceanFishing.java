package main.fishing;

import main.data.FishingData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class OceanFishing extends JFrame {

    public OceanFishing(){
        super("Рыбалка в море");

        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(6,10,2,6));


        JLabel desc = new JLabel("Вы вышли в море,тут одна ваша рыба = 2рыбы");
        JLabel postDesc = new JLabel("Выберете что делать");

        container.add(desc);
        container.add(postDesc);
        pack();


        JButton fishingButton = new JButton("Ловить рыбу");
        JButton exit = new JButton("Назад");

        fishingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Random random = new Random();

                String[] fish = {"Карась","Щука","Рыба-фугу","Окунь","Лосось","Ничего"};

                int randCountFishArray = random.nextInt(0,fish.length);

                String Fish = fish[randCountFishArray];

                if(Fish.equals("Карась")){
                    FishingData.setCarasCount(FishingData.getCarasCount()+2);
                } if(Fish.equals("Щука")){
                    FishingData.setChykaCount(FishingData.getChykaCount()+2);
                } if(Fish.equals("Рыба-фугу")){
                    FishingData.setFuguCount(FishingData.getFuguCount()+2);
                } if(Fish.equals("Лосось")){
                    FishingData.setLososCount(FishingData.getLososCount()+2);
                } if(Fish.equals("Окунь")){
                    FishingData.setOkunCount(FishingData.getOkunCount()+2);
                }

                JOptionPane.showConfirmDialog(null,"Вы успешно выловили 2 штуки  - "+Fish,"" +
                        "Оповещение",JOptionPane.PLAIN_MESSAGE);

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

        container.add(fishingButton);
        container.add(exit);
        pack();
    }

}
