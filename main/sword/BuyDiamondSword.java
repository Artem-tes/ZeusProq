package main.sword;

import main.data.MiningData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyDiamondSword extends JFrame {

    public BuyDiamondSword(){
        super("Покупка алмазного меча");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(3,10,2,6));

        JLabel desc = new JLabel("Вы уверены что хотите купить меч?");
        JLabel price = new JLabel("Нужно - 50\n    У вас - "+ MiningData.getDiamond());

        container.add(desc);
        container.add(price);

        JButton buySword = new JButton("Да,купить");
        JButton exit = new JButton("В меню");

        buySword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getDiamond()>50){
                    JOptionPane.showConfirmDialog(null,"Успешно\nВаш меч уже лежить в инвентаре","" +
                            "Оповещение",JOptionPane.PLAIN_MESSAGE);

                    MiningData.setDiamond1(MiningData.getDiamond()-50);
                    SwordData.setSword("Алмазный меч");

                    price.setText("Нужно - 50\n    У вас - "+ MiningData.getDiamond());
                } else {
                    JOptionPane.showConfirmDialog(null,"У вас недостаточно средств","" +
                            "Оповещение",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainSword mainSword = new MainSword();
                mainSword.setVisible(true);
                dispose();
            }
        });

        container.add(buySword);
        container.add(exit);
        pack();


    }

}
