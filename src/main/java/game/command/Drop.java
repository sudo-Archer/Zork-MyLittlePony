package game.command;

public class Drop extends Command {

    @Override
    public void inGame() {
        boolean dropped = player.removeItem(argument);
        if(dropped){
            gameObserver.addOutput("You have dropped ");
        }
        else{
            gameObserver.addOutput("You don't have ");
        }
        gameObserver.addOutput(argument+"\n");
    }
}
