package game.command;

import game.CommandParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Load extends Command{
    @Override
    protected void outGame(){
        if(argument.equals("")){
            gameObserver.addOutput("load what?");
        }
        else {

            File file = new File("./src/main/savedGame/" + argument + ".txt");
            try {
                Scanner scanner = new Scanner(file);
                gameObserver.addOutput("Loading saved file...\n");
                String command;
                CommandParser commandParser = new CommandParser(gameObserver, player, gameMap);
                while (scanner.hasNextLine()) {
                    gameObserver.addOutput("\n");
                    gameObserver.addOutput("Entered command: ");
                    command = scanner.nextLine();
                    gameObserver.addOutput(command + "\n");
                    commandParser.takeInput(command);
                }

            } catch (FileNotFoundException e) {
                gameObserver.addOutput("save not found");
                gameObserver.addOutput(argument);

            }
        }

    }
}
