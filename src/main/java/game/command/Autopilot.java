package game.command;

import game.CommandParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Autopilot extends Command{
    @Override
    public void inGame() {
        File file = new File(argument);
        try {
            Scanner scanner = new Scanner(file);
            gameObserver.addOutput("Found given file.\n");
            String command;
            CommandParser commandParser = new CommandParser(gameObserver, player, gameMap);
            while(scanner.hasNextLine()){
                gameObserver.addOutput("\n");
                gameObserver.addOutput("Entered command: ");
                command = scanner.nextLine();
                gameObserver.addOutput(command+"\n");
                commandParser.takeInput(command);
            }

        } catch (FileNotFoundException e) {
            gameObserver.addOutput("File not found ");
            gameObserver.addOutput(argument);

        }
    }

}
