package main.Boss;

import java.util.Random;

public class Boss1 extends Boss{

    private int dMin = 10;
    private int dMax = 30;
    private int hpBoss = 100;

    public int getHpBoss() {
        return hpBoss;
    }

    public Boss1(){
    }


    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;

    }


}
