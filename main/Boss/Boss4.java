package main.Boss;

import java.util.Random;

public class Boss4 extends Boss{

    private int dMin = 40;
    private int dMax = 60;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
