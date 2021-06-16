package game.command;

import game.controls.GameConsole;

public class Drop extends Command {

    @Override
    public void inGame() {
        boolean dropped = player.removeItem(argument);
        if(dropped){
            GameConsole.addOutput("You have dropped ");
        }
        else{
            GameConsole.addOutput("You don't have ");
        }
        GameConsole.addOutput(argument+"\n");
    }
}
