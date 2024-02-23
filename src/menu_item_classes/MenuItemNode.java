/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_item_classes;

/**
 *
 * @author ASUS
 */
public class MenuItemNode 
{
    String item_name;
    String item_category;
    double item_price;
    int item_popularity;
    int item_preparation_time;
 
    public MenuItemNode next;
    public MenuItemNode previous;
    
    public MenuItemNode(String name, String category, double price, int popularity, int time)
    {
        this.item_name = name;
        this.item_category = category;
        this.item_price = price;
        this.item_popularity = popularity;
        this.item_preparation_time = time;
    }
    //getters
    public String getName() //return the name
    {
        return item_name;
    }
    public String getCategory() //return the category
    {
        return item_category;
    }
    public double getPrice()    //return the price
    {
        return item_price;
    }
    public int getPopularity()  //return the popularity
    {
        return item_popularity;
    }
    public int getPreparationTime() //return the prep time
    {
        return item_preparation_time;
    }
}
