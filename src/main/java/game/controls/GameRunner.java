package game.controls;

public class GameRunner {
    public static boolean run;


    public static boolean isRunning(){ return run;}
    public static void stopRunning(){ run = false;}
    public static void initialize(){ run = true;}
}
