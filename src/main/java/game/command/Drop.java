package game.command;

public class Drop extends Command {

    @Override
    public void action() {
        boolean dropped = player.removeItem(argument);
        if(dropped){
            stringBuilder.append("You have dropped ");
        }
        else{
            stringBuilder.append("you don't have ");
        }
        stringBuilder.append(argument);
    }
}
