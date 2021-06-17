package game.item;

public class ConstantAttack extends Item {
    private int attack;

    public ConstantAttack(String itemName, String itemDescription, int attack) {
        super(itemName, itemDescription);
        this.attack = attack;
    }
    public int use(){
        return attack;
    }


}
