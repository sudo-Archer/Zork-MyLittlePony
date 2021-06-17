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
        ifWin();
    }
    public static void incrementTokenTaken(){
        numOfTokenTaken++;
        ifWin();
    }
    public static void incrementItemTaken(){
       numOfItemTaken++;
       ifWin();
    }
    public static void ifWin(){
        if(isDone(winningAmountOfItems, numOfItemTaken)&&isDone(winningAmountOfMonsters, numberOfMonstersKilled)&&isDone(winningAmountOfTokens, numOfTokenTaken)){
            MapRunner.playerWin();
        }
    }
    private static boolean isDone(Integer win, int amount){
        return (win==null||win<=amount);
    }


}
