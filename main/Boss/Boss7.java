package main.Boss;

import java.util.Random;

public class Boss7 extends Boss{

    private int dMin = 70;
    private int dMax = 90;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
