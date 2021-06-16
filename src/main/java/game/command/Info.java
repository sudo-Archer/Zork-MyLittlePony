package game.command;

import game.controls.GameConsole;

public class Info extends Command {


    @Override
    public void inGame() {
        GameConsole.addOutput(player.info()+"\n");
        GameConsole.addOutput(player.getCurrentRoom().info());

    }
}
