package main.sword;

import main.data.MiningData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyTreeSword extends JFrame {

    public BuyTreeSword(){
        super("Покупка деревянного меча");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(3,10,2,6));

        JLabel checkBuy = new JLabel("Вы уверены что хотите купить меч?");
        JLabel price = new JLabel("Нужно 50\n   У вас - "+ MiningData.getTree());
        JButton yes = new JButton("Да,купить");
        JButton exit = new JButton("Назад");

        container.add(checkBuy);
        container.add(price);

        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(MiningData.getTree()<50){
                    JOptionPane.showConfirmDialog(null,
                            "Недостаточно средств","Предупреждение",JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showConfirmDialog(null,
                            "Успешная покупка!\n" +
                                    "Меч добавлен в инвентарь","Оповещение",JOptionPane.PLAIN_MESSAGE);



                    MiningData.setTree(MiningData.getTree()-50);
                    SwordData.setSword("Деревянный меч");
                    price.setText("Нужно 50\n  У вас - "+ MiningData.getTree());
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

        container.add(yes);
        container.add(exit);
        pack();

    }

}
