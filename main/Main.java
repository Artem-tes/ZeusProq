package main;

import main.data.BossData;

public class Main {
    public static void main(String[] args) {
        BossData.setHealth(100);
        BossData.setShoHP(100);
        BossData.setPostAllHP(100);
        BossData.setLvl(1);
        BossData.setLvlBoss(1);
        MainGame mainWindow = new MainGame();
            mainWindow.setVisible(true);
    }

}
