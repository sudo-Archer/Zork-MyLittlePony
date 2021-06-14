package game;

public class GameObserver {
    private StringBuilder output;
    private boolean run = true;
    private StringBuilder commandHistory;
    private boolean recordHistory;

    public GameObserver() {
        this.output = new StringBuilder();
        this.commandHistory = new StringBuilder();
        this.recordHistory = false;
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


    public void addHistory(String command){
        if(recordHistory){
            commandHistory.append(command);
            commandHistory.append("\n");
        }
    }
    public void setRecordHistory(boolean bool){
        recordHistory = bool;
    }
    public String getCommandHistory(){
        return commandHistory.toString();
    }
    public void clearCommandHistory(){
        commandHistory = new StringBuilder();
    }


}
