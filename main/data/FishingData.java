package main.data;

public class FishingData {

    private static int carasCount;
    private static int chykaCount;
    private static int fuguCount;
    private static int okunCount;
    private static int lososCount;
    private static boolean isBoard;

    public static boolean isIsBoard() {
        return isBoard;
    }

    public static String  showIsBoard() {
        if(isBoard){
            return "Есть";
        } else{
            return "Нет";
        }
    }

    public static void setIsBoard(boolean isBoard) {
        FishingData.isBoard = isBoard;
    }

    public static int getCarasCount() {
        return carasCount;
    }

    public static void setCarasCount(int carasCount) {
        FishingData.carasCount = carasCount;
    }

    public static int getLososCount() {
        return lososCount;
    }

    public static void setLososCount(int lososCount) {
        FishingData.lososCount = lososCount;
    }

    public static int getOkunCount() {
        return okunCount;
    }

    public static void setOkunCount(int okunCount) {
        FishingData.okunCount = okunCount;
    }

    public static int getFuguCount() {
        return fuguCount;
    }

    public static void setFuguCount(int fuguCount) {
        FishingData.fuguCount = fuguCount;
    }

    public static int getChykaCount() {
        return chykaCount;
    }

    public static void setChykaCount(int chykaCount) {
        FishingData.chykaCount = chykaCount;
    }
}
