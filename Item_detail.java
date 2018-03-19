
/**
 * Write a description of class Item_detail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item_detail
{
    // instance variables - replace the example below with your own
    private boolean itemTaxIndicator;
    private double itemPrice;
    private String itemCode;
    private String itemDescription;

    /**
     * Constructor for objects of class Item_detail
     */
    public Item_detail(String item_code, double item_price, boolean item_taxIndicator, String item_description)
    {
        this.itemCode = item_code;
        this.itemPrice = item_price;
        this.itemTaxIndicator = item_taxIndicator;
        this.itemDescription = item_description;
        

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getItemCode()
    {
        return this.itemCode;
    }    

    public double getItemPrice()
    {
        return this.itemPrice;
    }

    public boolean getItemTaxIndicator()
    {
        // put your code here
        return this.itemTaxIndicator;
    }

    public String getItemDescription()
    {
        // put your code here
        return this.itemDescription;
    }

}
