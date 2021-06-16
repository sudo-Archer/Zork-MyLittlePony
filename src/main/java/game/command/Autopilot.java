package game.command;

import game.controls.CommandParser;
import game.controls.GameConsole;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static game.controls.GameConsole.addOutput;

public class Autopilot extends Command{
    @Override
    public void inGame() {
        File file = new File(argument);
        try {
            Scanner scanner = new Scanner(file);
            GameConsole.addOutput("Found given file.\n");
            String command;
            CommandParser commandParser = new CommandParser(player, gameMap);
            while(scanner.hasNextLine()){
                addOutput("\n");
                GameConsole.addOutput("Entered command: ");
                command = scanner.nextLine();
                GameConsole.addOutput(command+"\n");
                commandParser.takeInput(command);
            }

        } catch (FileNotFoundException e) {
            GameConsole.addOutput("File not found ");
            GameConsole.addOutput(argument);

        }
    }

}
