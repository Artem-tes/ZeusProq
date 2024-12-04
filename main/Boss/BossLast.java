package main.Boss;

import java.util.Random;

public class BossLast extends Boss{

    private int dMin = 130;
    private int dMax = 230;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }

}
