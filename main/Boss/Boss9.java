package main.Boss;

import java.util.Random;

public class Boss9 extends Boss{

    private int dMin = 90;
    private int dMax = 110;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
