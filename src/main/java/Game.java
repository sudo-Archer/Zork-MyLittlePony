import java.util.Scanner;

public class Game {

    Output output = new Output();
    boolean run = true;
    String command;
    CommandParser commandParser = new CommandParser(output);
    Scanner scanner = new Scanner(System.in);




    public void run(){
        while(run){
            output.display();
            System.out.print("Enter a command: ");
            command = scanner.nextLine();
            commandParser.takeInput(command);

        }
    }
}
