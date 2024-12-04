package main.Boss;

import java.util.Random;

public class Boss3 extends Boss {

    private int dMin = 30;
    private int dMax = 50;



    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(dMin,dMax);
        return damage;
    }
}
