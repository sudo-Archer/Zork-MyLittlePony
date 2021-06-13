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
            output.add("Found given file.\n");
            String command;
            CommandParser commandParser = new CommandParser(output, player, gameMap);
            while(scanner.hasNextLine()){
                output.add("\n");
                output.add("Entered command: ");
                command = scanner.nextLine();
                output.add(command+"\n");
                commandParser.takeInput(command);
            }

        } catch (FileNotFoundException e) {
            output.add("File not found ");
            output.add(argument);

        }
    }

}
