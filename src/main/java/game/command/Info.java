package game.command;

import game.command.Command;

public class Info extends Command {


    @Override
    public void action() {
        output.add(player.info()+"\n");
        output.add(player.getCurrentRoom().info());

    }
}
