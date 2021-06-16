package game.controls;

public class GameConsole {
    private static StringBuilder output;

    public static void initialize() {
        output = new StringBuilder();
    }

    public static void addOutput(String string){
        output.append(string);
    }

    public static void addOutput(int number){
        output.append(number);
    }

    public static void display(){
        System.out.println(output.toString());
        output = new StringBuilder();
    }



}
