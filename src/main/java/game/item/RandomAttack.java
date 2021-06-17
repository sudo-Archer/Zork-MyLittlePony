package game.item;

public class RandomAttack extends Item {
    private int baseAttack = 0;
    private int maxAttack = 0;
    public RandomAttack(String itemName, String itemDescription, int baseAttack, int maxAttack) {
        super(itemName, itemDescription);
        this.baseAttack = baseAttack;
        this.maxAttack = maxAttack;
    }

    @Override
    public int use(){
        return baseAttack+random.nextInt(maxAttack-baseAttack+1);
    }
}
