package game.controls;

public class MapObserver {
    private static int numOfTokenTaken;
    private static int numberOfMonstersKilled;
    private static int numOfItemTaken;

    private static Integer winningAmountOfMonsters;
    private static Integer winningAmountOfTokens;
    private static Integer winningAmountOfItems;

    public static void setWinningAmountOfMonsters(int winningAmountOfMonsters) {
        MapObserver.winningAmountOfMonsters = winningAmountOfMonsters;
    }

    public static void setWinningAmountOfTokens(int winningAmountOfTokens) {
        MapObserver.winningAmountOfTokens = winningAmountOfTokens;
    }

    public static void setWinningAmountOfItems(int winningAmountOfItems) {
        MapObserver.winningAmountOfItems = winningAmountOfItems;
    }

    public static void initialize(){
       clear();
    }

    public static void clear(){
        numberOfMonstersKilled = 0;
        numOfTokenTaken = 0;
        numOfItemTaken = 0;

        winningAmountOfTokens = null;
        winningAmountOfMonsters = null;
        winningAmountOfItems = null;
    }

    public static int getNumOfTokenTaken() {
        return numOfTokenTaken;
    }

    public static int getNumberOfMonstersKilled() {
        return numberOfMonstersKilled;
    }

    public static int getNumOfItemTaken() {
        return numOfItemTaken;
    }

    public static void incrementMonstersKilled(){
        numberOfMonstersKilled++;
        ifWin(winningAmountOfMonsters, numberOfMonstersKilled);
    }
    public static void incrementTokenTaken(){
        numOfTokenTaken++;
        ifWin(winningAmountOfTokens, numOfTokenTaken);
    }
    public static void incrementItemTaken(){
       numOfItemTaken++;
       ifWin(winningAmountOfItems, numOfItemTaken);
    }
    public static void ifWin(Integer winning, int amount){
        if(winning != null && amount >= winning){
            MapRunner.playerWin();
        }
    }


}
