package main.fishing;

import main.Inventory.FishInventory;
import main.data.ArmorData;
import main.data.FishingData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EatFish extends JFrame {

    private int unlockFish;

    public EatFish(){
        super("Есть рыбу");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(7,2,6,6));

        JLabel desc = new JLabel("Выберите какую рыбу сьесть");
        container.add(desc);
        JButton eatOkun = new JButton("Окунь: "+ FishingData.getOkunCount());
        JButton eatKaras = new JButton("Карась: "+FishingData.getCarasCount());
        JButton eatChuka = new JButton("Щука: "+FishingData.getChykaCount());
        JButton eatFugu = new JButton("Рыба-фугу: "+FishingData.getFuguCount());
        JButton eatLosos = new JButton("Лосось: "+FishingData.getLososCount());
        JButton exit = new JButton("Назад");


        eatOkun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(FishingData.getOkunCount()>0) {
                    FishingData.setOkunCount(FishingData.getOkunCount() - 1);
                    ArmorData.setArmorCount(ArmorData.getArmorCount() + 10);
                    JOptionPane.showConfirmDialog(null, "Вы успешно сьели Окуня\n" +
                                    "У вас осталось " + FishingData.getOkunCount() + " Окуней\nВаша броня - " + ArmorData.getArmorCount(),
                            "Оповещение", JOptionPane.PLAIN_MESSAGE);
                    eatOkun.setText("Окунь: " + FishingData.getOkunCount());
                } else {
                    JOptionPane.showConfirmDialog(null,
                            "У вас уже нет Окуней\nНаловите их!", "Предупреждение", JOptionPane.PLAIN_MESSAGE);

                }

            }
        });





        eatKaras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(FishingData.getCarasCount()>0){
                    FishingData.setCarasCount(FishingData.getCarasCount()-1);
                    ArmorData.setArmorCount(ArmorData.getArmorCount()+20);
                    JOptionPane.showConfirmDialog(null,"Вы успешно сьели Карася" +
                                    "\nУ вас осталось  - "+FishingData.getCarasCount()+"\nВаша броня - "+ ArmorData.getArmorCount(),
                            "Покупка" , JOptionPane.PLAIN_MESSAGE);
                    eatKaras.setText("Карась: "+FishingData.getCarasCount());
                }else {
                    JOptionPane.showConfirmDialog(null,
                            "У вас уже нет Карасей\nНаловите их!", "Предупреждение", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });


        eatChuka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(FishingData.getChykaCount()>0){
                    FishingData.setChykaCount(FishingData.getChykaCount()-1);
                    ArmorData.setArmorCount(ArmorData.getArmorCount()+30);
                    JOptionPane.showConfirmDialog(null,"Вы успешно сьели Щуку\nУ вас осталось Щук:"+
                            FishingData.getChykaCount()+"\nУ вас брони - "+ArmorData.getArmorCount(),"Покупка",JOptionPane.PLAIN_MESSAGE);
                    eatChuka.setText("Щука: "+FishingData.getChykaCount());
                }else {
                    JOptionPane.showConfirmDialog(null,
                            "У вас уже нет Щук\nНаловите их!", "Предупреждение", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        eatFugu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FishingData.getFuguCount()>0){
                    FishingData.setFuguCount(FishingData.getFuguCount()-1);
                    ArmorData.setArmorCount(ArmorData.getArmorCount()+40);
                    JOptionPane.showConfirmDialog(null,"Вы успешно сьели Рыбу-фугу\nУ вас их осталось - "+FishingData.getFuguCount()
                    +"\nКол-во вашей брони - "+ArmorData.getArmorCount(),"Покупка",JOptionPane.PLAIN_MESSAGE);
                    eatFugu.setText("Рыба-фугу: "+FishingData.getFuguCount());
                } else{
                    JOptionPane.showConfirmDialog(null,
                            "У вас уже нет Рыб-фугу\nНаловите их!", "Предупреждение", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });



        eatLosos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(FishingData.getLososCount()>0){
                    FishingData.setLososCount(FishingData.getLososCount()-1);
                    ArmorData.setArmorCount(ArmorData.getArmorCount()+50);
                    JOptionPane.showConfirmDialog(null,"Вы успешно сьели Лосося\nУ вас их осталось - "
                    +FishingData.getLososCount()+"\nКол-во вашей брони - "+ArmorData.getArmorCount(),
                            "Покупка",JOptionPane.PLAIN_MESSAGE);
                    eatLosos.setText("Лосось: "+FishingData.getLososCount());
                } else{
                    JOptionPane.showConfirmDialog(null,
                            "У вас уже нет Лососей\nНаловите их!", "Предупреждение", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });














        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FishInventory fishInventory = new FishInventory();
                fishInventory.setVisible(true);
                dispose();
            }
        });

        if(FishingData.getOkunCount()>0){
            container.add(eatOkun);
            unlockFish++;
        } if(FishingData.getCarasCount()>0){
            container.add(eatKaras);
            unlockFish++;
        }if(FishingData.getChykaCount()>0){
            container.add(eatChuka);
            unlockFish++;
        }if(FishingData.getFuguCount()>0){
            container.add(eatFugu);
            unlockFish++;
        }if(FishingData.getLososCount()>0){
            container.add(eatLosos);
            unlockFish++;
        }if(unlockFish==0){
            JLabel decs1 = new JLabel("У вас нет рыб чтобы их сьесть!");
            container.add(decs1);
        }

        container.add(exit);
        pack();
    }

}
