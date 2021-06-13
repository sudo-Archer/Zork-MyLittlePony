package game.command;

public class Drop extends Command {

    @Override
    public void action() {
        boolean dropped = player.removeItem(argument);
        if(dropped){
            output.add("You have dropped ");
        }
        else{
            output.add("You don't have ");
        }
        output.add(argument+"\n");
    }
}
