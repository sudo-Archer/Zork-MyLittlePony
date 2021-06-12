package game.command;

import game.command.Command;

public class Info extends Command {


    @Override
    public void action() {
        stringBuilder = new StringBuilder();
        stringBuilder.append(player.info()+"\n");
        stringBuilder.append(player.getCurrentRoom().info());

    }
}
