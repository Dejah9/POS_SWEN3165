package Main;
/**
 * Write a description of class main here.
 *
 * @author (KH and JD)
 * @version (a version number or a date)
 */
 

import Classes.Item_detail;
import Classes.InventoryDB;
import Database.InventoryDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
        

        public static void main(String[] args) {
            System.out.print("Welcome to POS");
            ArrayList<Item_detail> items = new ArrayList<Item_detail>();
            items.add(new Item_detail("54634434343434", 65, false, "Flour"));
            items.add(new Item_detail("43343434534535", 60, false, "Rice"));
            items.add(new Item_detail("53435434534352", 230, false, "Chicken"));
            items.add(new Item_detail("78545678695453", 60, false, "Oil"));
            
            InventoryDB db = new InventoryDB(items);
            
            
            System.out.println(db.getItemDeatils("43343434534535"));
            
            
            System.out.println("Please choose your items, after the item please add its quantity");
            System.out.println("milk\n " +
                    "flour\n "+
                    "rice\n" +
                    "sugar\n"+ 
                    "crackers\n" );
        
        
            List<String> cos_lst = new ArrayList<>();
            Scanner cos_input = new Scanner(System.in);
            System.out.println("Enter your items");
        
            do{
                    //System.out.println("Your list is:");
                    //System.out.print("\n" + cos_lst);
                    System.out.println("Any items? (y/n)");
                    if (cos_input.next().startsWith("y")){
                        System.out.println("Enter : ");
                        cos_lst.add(cos_input.next());
                    } else {
                        break;
                    }
                } while (true);
                System.out.println("Your list is:" + cos_lst);
                //String[] arr = cos_lst.toArray(new String[0]);
                //System.out.println("Array is " + Arrays.toString(arr));
        }
}