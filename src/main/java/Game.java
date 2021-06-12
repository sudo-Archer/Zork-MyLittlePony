import java.util.Scanner;

public class Game {

    GameMap gameMap = new GameMap();
    Player player = new Player(gameMap, 8, 2);
    Output output = new Output();
    boolean run = true;
    String command;
    CommandParser commandParser = new CommandParser(output, player);
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
