package game;

public class Output {
    StringBuilder stringBuilder;

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
}
