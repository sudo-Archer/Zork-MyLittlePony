package game.command;

import game.command.Command;

public class Info extends Command {


    @Override
    public void action() {
        stringBuilder = new StringBuilder();
        playerInfo();

    }


    private void playerInfo(){
        stringBuilder.append("game.player.Player info");
        stringBuilder.append(" HP: ");
        stringBuilder.append(player.getHp());
        stringBuilder.append(" MaxHP: ");
        stringBuilder.append(player.getMaxHp());
        stringBuilder.append(" attack power:");
        stringBuilder.append(player.getAttackPower());
    }

}
