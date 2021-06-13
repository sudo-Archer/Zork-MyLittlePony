package game.command;

public class Exit extends Command{
    @Override
    protected void outGame(){
        output.stopRunning();
        output.add("See you back soon!");
    }
}
