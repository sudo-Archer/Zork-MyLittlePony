package game;

import game.controls.*;
import game.map.GameMap;
import game.player.Player;

import java.util.Scanner;

public class Game {

    private static GameMap gameMap;
    private static Player player;
    private String command;
    private CommandParser commandParser = new CommandParser(player);
    private Scanner scanner = new Scanner(System.in);

    private void initialize(){
        GameRunner.initialize();
        GameConsole.initialize();
        GameHistory.initialize();
        MapRunner.initialize();


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
