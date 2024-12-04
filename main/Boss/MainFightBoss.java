package main.Boss;

import main.MainMenu;
import main.data.ArmorData;
import main.data.BossData;
import main.data.SwordData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFightBoss extends JFrame {

    Boss boss;

    private int attackCount;
    private int damage;
    int countFight;
    int CurNum;
    private int attackCountSuper;
    private int damageBoss;


    public MainFightBoss(){
        super("Битва");
        super.setBounds(750,250,300,400);


        //создание контейнера

        Container container = super.getRootPane();
        container.setLayout(new GridLayout(5,1,2,6));

        if(BossData.getLvlBoss()==1){
            boss = new Boss1();
            BossData.setBossHealth(100);
        }if(BossData.getLvlBoss()==2){
            boss = new Boss2();
            BossData.setBossHealth(200);
        }if(BossData.getLvlBoss()==3){
            boss = new Boss3();
            BossData.setBossHealth(300);
        }if(BossData.getLvlBoss()==4){
            boss = new Boss4();
            BossData.setBossHealth(400);
        }if(BossData.getLvlBoss()==5){
            boss = new Boss5();
            BossData.setBossHealth(500);
        }if(BossData.getLvlBoss()==6){
            boss = new Boss6();
            BossData.setBossHealth(600);
        }if(BossData.getLvlBoss()==7){
            boss = new Boss7();
            BossData.setBossHealth(700);
        }if(BossData.getLvlBoss()==8){
            boss = new Boss8();
            BossData.setBossHealth(800);
        }if(BossData.getLvlBoss()==9){
            boss = new Boss9();
            BossData.setBossHealth(900);
        }if(BossData.getLvlBoss()==10){
            boss = new Boss10();
            BossData.setBossHealth(1000);
        }if(BossData.getLvlBoss()>10){
            boss = new BossLast();
            BossData.setBossHealth(2000);
        }



        if(SwordData.getSword().equals("Деревянный меч")){
            this.damage = 25;
        }if(SwordData.getSword().equals("Каменный меч")){
            this.damage = 50;
        }if(SwordData.getSword().equals("Железный меч")){
            this.damage = 75;
        }if(SwordData.getSword().equals("Алмазный меч")){
            this.damage = 100;
        }

        int allHP = BossData.getHealth()+ArmorData.getArmorCount();
        int postAllHp = +BossData.getPostAllHP();
        int armor = ArmorData.getArmorCount();
        int hpArm = armor+postAllHp;

        JLabel desc = new JLabel("Вы сражаетесь с боссом уровня "+ BossData.getLvlBoss());
        JLabel hpUser = new JLabel("Ваше здоровье(с броней) - "+hpArm);
        JLabel hpBoss = new JLabel("Здоровье босса - "+BossData.getBossHealth());
        JLabel countAttack = new JLabel("Кол-во атак - "+attackCount);
        JLabel damageUser = new JLabel("Ваш урон - "+damage);

        container.add(desc);
        container.add(hpUser);
        container.add(hpBoss);
        container.add(countAttack);
        container.add(damageUser);
        pack();



        JButton attack = new JButton("Атаковать босса");

        int hp = BossData.getHealth();
        int armorq = ArmorData.getArmorCount();


        allHP = hp + armorq;

        BossData.setAllHP(allHP);

        attack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                BossData.setBossHealth(BossData.getBossHealth()-damage);
                if(BossData.getBossHealth()<=0){
                    JOptionPane.showConfirmDialog(null,"Вы победили босса!\n" +
                            "Ждем тебя на следующем боссе Боец!","Победа",JOptionPane.PLAIN_MESSAGE);
                    int arm = ArmorData.getArmorCount();
                    int hpUserG = BossData.getPostAllHP();
                    int sum = arm+hpUserG;

                    BossData.setPostAllHP(sum-arm);
                    ArmorData.setArmorCount(sum-BossData.getPostAllHP());
                    System.out.println(sum);
                    System.out.println(BossData.getPostAllHP());
                    System.out.println(ArmorData.getArmorCount());

                    MainMenu mainMenu = new MainMenu();
                    mainMenu.setVisible(true);
                    dispose();
                    BossData.setLvl(BossData.getLvl()+1);
                    BossData.setLvlBoss(BossData.getLvlBoss()+1);
                    BossData.setBossCountWin(BossData.getBossCountWin()+1);
                }








                damageBoss = boss.attack();

                int armq = ArmorData.getArmorCount();
                int hpq = BossData.getPostAllHP();
                int sumq = armq+hpq;


                if(sumq-damageBoss>100) {
                    ArmorData.setArmorCount(ArmorData.getArmorCount()-damageBoss);
                } else{
                    if(CurNum==0) {
                        JOptionPane.showConfirmDialog(null, "У вас не осталось брони!\nНа первый раз урон не засчитан", "" +
                                "Предупреждение", JOptionPane.PLAIN_MESSAGE);
                        CurNum++;
                    }
                    armq=0;

                    if(countFight==0) {
                        BossData.setAllHP(99);
                        BossData.setPostAllHP(100);

                    } else {
                        int postDamage = BossData.getPostAllHP()-damageBoss;
                        //int fboss = BossData.getPostAllHP()-damageBoss;
                        System.out.println("я тут");
                        System.out.println(postDamage);

                        BossData.setShoHP(postDamage);

                        BossData.setPostAllHP(postDamage);

                    }
                    countFight++;
                }

                if(BossData.getPostAllHP()<=0){
                    JOptionPane.showConfirmDialog(null,"Вы проиграли\nСмерть","Поражение",JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }

                int armq1 = ArmorData.getArmorCount();



                int hpq1 = BossData.getPostAllHP();
                int sumq1 = armq+hpq;

                if(BossData.getAllHP()>=100) {
                    hpUser.setText("Ваше здоровье(с броней) - " + sumq1);
                }

                if(armq==0) {
                    int fboss = BossData.getPostAllHP()-damageBoss;
                    if (fboss<=0){
                        JOptionPane.showConfirmDialog(null,"Вы проиграли\nСмерть","Поражение",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                    hpUser.setText("Ваше здоровье - " + fboss);
                }
                hpBoss.setText("Здоровье босса - "+BossData.getBossHealth());
                attackCount++;
                countAttack.setText("Кол-во атак - "+attackCount);



            }
        });
        container.add(attack);
        pack();






    }

}
