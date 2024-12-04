package main.Boss;

import java.util.Random;

public class Boss10 extends Boss{

    private int dMin = 100;
    private int dMax = 120;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
