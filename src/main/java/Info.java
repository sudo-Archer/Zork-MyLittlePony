public class Info extends Command{

    StringBuilder stringBuilder;

    @Override
    public void action() {
        stringBuilder = new StringBuilder();
        playerInfo();

    }

    @Override
    public String output() {
        return stringBuilder.toString();
    }

    private void playerInfo(){
        stringBuilder.append("Player info");
        stringBuilder.append(" HP: ");
        stringBuilder.append(player.getHp());
        stringBuilder.append(" MaxHP: ");
        stringBuilder.append(player.getMaxHp());
        stringBuilder.append(" attack power:");
        stringBuilder.append(player.getAttackPower());
    }

}
