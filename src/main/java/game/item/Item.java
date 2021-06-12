package game.item;

public class Item {

    private String itemName;
    private String itemInfo;


    public Item(String itemName, String itemInfo) {
        this.itemName = itemName;
        this.itemInfo = itemInfo;
    }

    public String getItemName(){
        return  this.itemName;
    }
    public String getItemInfo(){
        return this.itemInfo;

    }
}
