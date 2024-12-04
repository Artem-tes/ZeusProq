package main.sword;

import main.MainMenu;
import main.data.MiningData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyStoneSword extends JFrame {

    public BuyStoneSword(){

        super("Покупка каменного меча");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(3,10,2,6));

        JLabel check = new JLabel("Вы уверены что хотите меч?");
        JLabel balance = new JLabel("Нужно - 50\n    У вас - "+ MiningData.getStone());

        container.add(check);
        container.add(balance);

        JButton buySword = new JButton("Да,купить");
        JButton exit = new JButton("Назад");

        buySword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getStone()>50){
                    JOptionPane.showConfirmDialog(null,"Успешно!\nМеч уже лежит в инвентаре","" +
                            "Оповещение",JOptionPane.PLAIN_MESSAGE);



                    MiningData.setStone1(MiningData.getStone()-50);
                    SwordData.setSword("Каменный меч");

                    balance.setText("Нужно - 50\n   У вас - "+ MiningData.getStone());

                } else {
                    JOptionPane.showConfirmDialog(null,"У вас недостаточно ресурсов","" +
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
