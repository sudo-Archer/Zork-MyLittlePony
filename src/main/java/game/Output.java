package game;

public class Output {
    StringBuilder stringBuilder;
    boolean run = true;

    public Output() {
        this.stringBuilder = new StringBuilder();
    }

    public void add(String string){
        stringBuilder.append(string);
    }

    public void add(int number){
        stringBuilder.append(number);
    }

    public void display(){
        System.out.println(stringBuilder.toString());
        stringBuilder = new StringBuilder();
    }
    public boolean isRunning(){ return run;}
    public void stopRunning(){ run = false;}
}
