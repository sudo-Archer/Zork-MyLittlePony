package game;

import game.CommandParser;
import game.Output;
import game.map.GameMap;
import game.map.TestingMap;
import game.player.Player;

import java.util.Scanner;

public class Game {

    private Boolean run = true;
    GameMap gameMap = new TestingMap();
    Player player;
    Output output = new Output();
    String command;
    CommandParser commandParser = new CommandParser(output, player, gameMap);
    Scanner scanner = new Scanner(System.in);


    public void run(){
        output.add("Welcome to Zork Adventure!");
        while(output.isRunning()){
            output.display();
            System.out.print("Enter a command: ");
            command = scanner.nextLine();
            commandParser.takeInput(command);
        }
        output.display();
    }

}
