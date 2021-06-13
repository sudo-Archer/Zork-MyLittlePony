package game;

import game.CommandParser;
import game.Output;
import game.map.GameMap;
import game.map.TestingMap;
import game.player.Player;

import java.util.Scanner;

public class Game {

    GameMap gameMap;
    Player player;
    Output output = new Output();
    String command;
    CommandParser commandParser = new CommandParser(output, player, gameMap);
    Scanner scanner = new Scanner(System.in);
    private boolean run = true;


    public void run(){
        output.add("Welcome to Zork Adventure!");
        while(run){
            output.display();
            System.out.print("Enter a command: ");
            command = scanner.nextLine();
            commandParser.takeInput(command);
        }
        output.display();
    }

}
