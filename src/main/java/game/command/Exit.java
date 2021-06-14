package game.command;

public class Exit extends Command{
    @Override
    protected void outGame(){
        gameObserver.stopRunning();
        gameObserver.addOutput("See you back soon!");
    }
}
