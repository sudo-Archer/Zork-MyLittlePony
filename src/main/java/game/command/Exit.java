package game.command;

import game.controls.GameConsole;
import game.controls.GameRunner;

public class Exit extends Command{
    @Override
    protected void outGame(){
        GameRunner.stopRunning();
        GameConsole.addOutput("See you back soon!");
    }
}
