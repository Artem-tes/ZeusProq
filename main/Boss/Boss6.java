package main.Boss;

import java.util.Random;

public class Boss6 extends Boss{

    private int dMin = 60;
    private int dMax = 80;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
