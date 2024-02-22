/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order_classes;

/**
 *
 * @author ASUS
 */
public class OrderItem 
{
    private String item_name;
    private double price;
    
    public OrderItem(String item_name, double price)
    {
        this.item_name = item_name;
        this.price = price;
    }  
    public String getItemName() 
    {   //return item name for other methods to use
        return item_name;
    }
    public double getPrice() 
    {  //return the item price for other methods to use
        return price;
    }
}
