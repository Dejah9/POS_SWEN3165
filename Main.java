
/**
 * Write a description of class main here.
 *
 * @author (KH and JD)
 * @version (a version number or a date)
 */
 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


        public static void main(String[] args) {
            System.out.print("Welcome to POS");
        
        
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