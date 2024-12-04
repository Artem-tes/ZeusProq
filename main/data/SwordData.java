package main.data;

public class SwordData {

    private static String sword;

    public static String getSword() {
        if(sword==null){
            return "У вас нет меча";
        }else {
            return sword;
        }
    }

    public static void setSword(String sword) {
        SwordData.sword = sword;
    }
}
