package main.data;

public class  MiningData {
    private static int tree;
    private static int stone;
    private static int iron;
    private static int diamond;

    public static int getDiamond() {
        return diamond;
    }

    public static void setDiamond(int diamond1) {
        diamond+=diamond1;
    }

    public static int getIron() {
        return iron;
    }

    public static void setIron(int iron1) {
        iron+=iron1;
    }

    public static int getTree() {
        return tree;
    }

    public static void setPlusTree(int tree1){
        tree+=tree1;
    }

    public static void setTree(int tree2){
        tree = tree2;
    }

    public static void setStone1(int stone2){
        stone = stone2;
    }

    public static void setIron1(int iron2){
        iron = iron2;
    }

    public static void setDiamond1(int diamond2){
        diamond = diamond2;
    }

    public static int getStone() {
        return stone;
    }

    public static void setStone(int stone1) {
        stone+=stone1;
    }
}
