package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGame extends JFrame {

    public boolean close;

    public boolean isClose() {
        return close;
    }

    public MainGame(){
        super("Игра");
        super.setBounds(750,250,300,400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //инизиализация кнопок и лейблов

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,2));
        JLabel firstDescription = new JLabel("Мастер");
        JLabel secondDescription = new JLabel("Арены");
        JButton playButton = new JButton("Играть");
        JButton infoGameButton = new JButton("О игре");
        JButton exitButton = new JButton("Выйти");

        // добавление лейблов
        container.add(firstDescription);
        container.add(secondDescription);
        pack();


        //вешаем на кнопки обработчики

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });
        container.add(playButton);

        infoGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoGame infoGame = new infoGame();
                infoGame.setVisible(true);
            }
        });

        container.add(infoGameButton);
        pack();

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        container.add(exitButton);
        pack();






    }
}
