package main.Boss;

import java.util.Random;

public class Boss5 extends Boss{

    private int dMin = 50;
    private int dMax = 70;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
