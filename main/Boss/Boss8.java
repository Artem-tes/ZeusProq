package main.Boss;

import java.util.Random;

public class Boss8 extends Boss{

    private int dMin = 80;
    private int dMax = 100;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
