package game;

public class GameObserver {
    private StringBuilder output;
    private boolean run = true;
    private StringBuilder commandHistory;

    public GameObserver() {
        this.output = new StringBuilder();
        this.commandHistory = new StringBuilder();
    }


    public void addOutput(String string){
        output.append(string);
    }

    public void addOutput(int number){
        output.append(number);
    }

    public void display(){
        System.out.println(output.toString());
        output = new StringBuilder();
    }
    public boolean isRunning(){ return run;}
    public void stopRunning(){ run = false;}
}
