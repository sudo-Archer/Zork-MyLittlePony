package game;

import game.controls.CommandParser;
import game.controls.GameConsole;
import game.controls.GameHistory;
import game.controls.GameRunner;
import game.map.GameMap;
import game.player.Player;

import java.util.Scanner;

public class Game {

    private static GameMap gameMap;
    private static Player player;
    private String command;
    private CommandParser commandParser = new CommandParser(player, gameMap);
    private Scanner scanner = new Scanner(System.in);

    private void initialize(){
        GameRunner.initialize();
        GameConsole.initialize();
        GameHistory.initialize();


    }

    public void run(){
        initialize();
        GameConsole.addOutput("Welcome to Zork Adventure!");
        while(GameRunner.isRunning()){
            GameConsole.display();
            System.out.print("Enter a command: ");
            command = scanner.nextLine();
            commandParser.takeInput(command);
        }
        GameConsole.display();
    }





}
