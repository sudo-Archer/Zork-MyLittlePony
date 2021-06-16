package game.controls;

public class GameHistory {


    private static StringBuilder commandHistory;
    private static  boolean recordHistory;

    public static void initialize() {
        commandHistory = new StringBuilder();
        recordHistory = false;
    }

    public static void addHistory(String command){
        if(recordHistory){
            commandHistory.append(command);
            commandHistory.append("\n");
        }
    }

    public static void startRecordHistory(){ recordHistory = true; }
    public static void stopRecordHistory(){ recordHistory = false; }
    public static String getCommandHistory(){
        return commandHistory.toString();
    }
    public static void clearCommandHistory(){
        commandHistory = new StringBuilder();
    }


}
