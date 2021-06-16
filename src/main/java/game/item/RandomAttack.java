package game.item;

public class RandomAttack extends Item {
    private int baseAttack = 0;
    private int maxAttack = 0;
    public RandomAttack(String itemName, String itemDescription) {
        super(itemName, itemDescription);
    }
    public void setMaxAttack(int attack){
        this.maxAttack = attack;
    }
    public void setBaseAttack(int baseAttack){
        this.baseAttack = baseAttack;
    }

    @Override
    public int use(){
        return baseAttack+random.nextInt(maxAttack-baseAttack+1);
    }
}
