import java.util.ArrayList;
/**
 * Write a description of class InventoryDB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InventoryDB{
    ArrayList<Item_detail> items;

    InventoryDB(ArrayList<Item_detail> items){
        this.items = items;
    }

    public Item_detail getItemDeatils(String itemCode){
        for(Item_detail i : this.items){
            if(i.getItemCode().equalsIgnoreCase(itemCode)){
                return i;
            }
        }
        return null;
    }
    
    public void addItem(Item_detail item){
        this.items.add(item);
    }
    
}
