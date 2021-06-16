package game.item;

public class ConstantAttack extends Item {
    private int attack = 0;

    public ConstantAttack(String itemName, String itemDescription) {
        super(itemName, itemDescription);
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public int use(){
        return attack;
    }


}
