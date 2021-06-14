package game;

import game.map.GameMap;
import game.player.Player;

import java.util.Scanner;

public class Game {

    private static GameMap gameMap;
    private static Player player;
    private static GameObserver gameObserver = new GameObserver();
    private String command;
    private CommandParser commandParser = new CommandParser(gameObserver, player, gameMap);
    private Scanner scanner = new Scanner(System.in);


    public void run(){
        gameObserver.addOutput("Welcome to Zork Adventure!");
        while(gameObserver.isRunning()){
            gameObserver.display();
            System.out.print("Enter a command: ");
            command = scanner.nextLine();
            commandParser.takeInput(command);
        }
        gameObserver.display();
    }

}
