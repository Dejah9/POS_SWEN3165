package Classes;

/**
 * Write a description of class Item_detail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item_detail
{
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
        return this.itemTaxIndicator;
    }

    public String getItemDescription()
    {
        return this.itemDescription;
    }

}
