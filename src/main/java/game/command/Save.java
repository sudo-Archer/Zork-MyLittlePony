package game.command;

import game.controls.GameConsole;
import game.controls.GameHistory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save extends Command{
    @Override
    protected void inGame(){
        if (argument.equals("")){
            GameConsole.addOutput("File name not specified");
        }
        try {
            FileWriter fileWriter = new FileWriter("./src/main/savedGame/"+argument+".txt");
            fileWriter.write(GameHistory.getCommandHistory());
            fileWriter.close();
            GameConsole.addOutput(GameHistory.getCommandHistory());
            GameConsole.addOutput("Save was successful");
        } catch (IOException e) {
           //if file is null ?
            File file = new File("./src/main/savedGame/"+argument+".txt");
            try {
                file.createNewFile();
                inGame();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


    }
}
