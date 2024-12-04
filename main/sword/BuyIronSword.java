package main.sword;

import main.data.MiningData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyIronSword extends JFrame {

    public BuyIronSword(){
        super("Покупка железного меча");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(3,10,2,6));

        JLabel desc = new JLabel("Вы уверены что хотите купить меч?");
        JLabel price = new JLabel("Нужно - 50\n    У вас - "+ MiningData.getIron());

        JButton buySword = new JButton("Да,купить");
        JButton exit  = new JButton("Назад");

        container.add(desc);
        container.add(price);

        buySword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getIron()>50){
                    JOptionPane.showConfirmDialog(null,"Успешно\nВаш меч уже в инвентаре","" +
                            "Оповещение",JOptionPane.PLAIN_MESSAGE);

                    MiningData.setIron1(MiningData.getIron()-50);
                    SwordData.setSword("Железный меч");

                    price.setText("Нужно - 50\n   У вас - "+ MiningData.getIron());
                }else {
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
