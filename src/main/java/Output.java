public class Output {
    StringBuilder stringBuilder;

    public Output(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void add(String string){
        stringBuilder.append(string);
        stringBuilder.append("\n");
    }

    public void display(){
        System.out.println(stringBuilder.toString());
        stringBuilder = new StringBuilder();


    }
}
