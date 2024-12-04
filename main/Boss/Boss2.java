package main.Boss;

import java.util.Random;

public class Boss2 extends Boss{

    private int dMin = 20;
    private int dMax = 40;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }


}
