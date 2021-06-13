package game.command;

import game.command.Command;

public class Info extends Command {


    @Override
    public void inGame() {
        output.add(player.info()+"\n");
        output.add(player.getCurrentRoom().info());

    }
}
