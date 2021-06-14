package game.command;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save extends Command{
    @Override
    protected void inGame(){
        if (argument.equals("")){
            gameObserver.addOutput("File name not specified");
        }
        try {
            FileWriter fileWriter = new FileWriter("./src/main/savedGame/"+argument+".txt");
            fileWriter.write(gameObserver.getCommandHistory());
            fileWriter.close();
            gameObserver.addOutput(gameObserver.getCommandHistory());
            gameObserver.addOutput("Save was successful");
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
