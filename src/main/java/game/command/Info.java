package game.command;

public class Info extends Command {


    @Override
    public void inGame() {
        gameObserver.addOutput(player.info()+"\n");
        gameObserver.addOutput(player.getCurrentRoom().info());

    }
}
