package main.data;

public class BossData {

    private static int health;
    private static int bossHealth;
    private static int lvlBoss;
    private static int lvl;
    private static int bossCountWin;
    private static int allHP;
    private static int postAllHP;
    private static int shoHP;

    public static int getShoHP() {
        return shoHP;
    }

    public static void setShoHP(int shoHP) {
        BossData.shoHP = shoHP;
    }

    public static int getPostAllHP() {
        return postAllHP;
    }

    public static void setPostAllHP(int postAllHP) {
        BossData.postAllHP = postAllHP;
    }

    public static int getAllHP() {
        return allHP;
    }

    public static void setAllHP(int allHP) {
        BossData.allHP = allHP;
    }

    public static int getBossCountWin() {
        return bossCountWin;
    }

    public static void setBossCountWin(int bossCountWin) {
        BossData.bossCountWin = bossCountWin;
    }

    public static int getLvlBoss() {
        return lvlBoss;
    }

    public static void setLvlBoss(int lvlBoss) {
        BossData.lvlBoss = lvlBoss;
    }

    public static int getLvl() {
        return lvl;
    }

    public static void setLvl(int lvl) {
        BossData.lvl = lvl;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        BossData.health = health;
    }

    public static int getBossHealth() {
        return bossHealth;
    }

    public static void setBossHealth(int bossHealth) {
        BossData.bossHealth = bossHealth;
    }
}
