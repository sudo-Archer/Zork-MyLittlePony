public class CommandParser {

    Output output;

    public CommandParser(Output output) {
        this.output = output;
    }

    public void takeInput(String command) {
        output.add(command);
    }
}
