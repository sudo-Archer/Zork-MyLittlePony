package game.item;

public class Item {

    private String itemName;
    private String itemDescription;


    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemName(){
        return  this.itemName;
    }
    public String getItemDescription(){
        return this.itemDescription;

    }

    public int use() {
        return 0;
    }

}
