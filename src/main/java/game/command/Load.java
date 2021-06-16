package game.command;

import game.controls.CommandParser;
import game.controls.GameConsole;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Load extends Command{
    @Override
    protected void outGame(){
        if(argument.equals("")){
            GameConsole.addOutput("load what?");
        }
        else {

            File file = new File("./src/main/savedGame/" + argument + ".txt");
            try {
                Scanner scanner = new Scanner(file);
                GameConsole.addOutput("Loading saved file...\n");
                String command;
                CommandParser commandParser = new CommandParser(player);
                while (scanner.hasNextLine()) {
                    GameConsole.addOutput("\n");
                    GameConsole.addOutput("Entered command: ");
                    command = scanner.nextLine();
                    GameConsole.addOutput(command + "\n");
                    commandParser.takeInput(command);
                }

            } catch (FileNotFoundException e) {
                GameConsole.addOutput("save not found");
                GameConsole.addOutput(argument);

            }
        }

    }
}
