/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order_classes;


/**
 *
 * @author ASUS
 */
public class Order 
{
    //order attributes
    private static int order_count=0;
    public OrderItem[] items;
    public String customer_telephone;
    public double order_total;
    public String order_time;
    private int order_number;
    private boolean is_active = true;
    
    public Order(String customer_telephone, OrderItem[] items, double order_total, String time)
    {
        this.customer_telephone = customer_telephone;
        this.items = items;
        this.order_total=order_total;
        this.order_time=time;
        this.order_number= ++order_count;
    }
    public String toString() 
    {  
        //method to display the order details into the terminal
        StringBuilder result = new StringBuilder("Order Details:\n");
        result.append("Order Number: ").append(order_number).append("\n");
        result.append("Customer Telephone: ").append(customer_telephone).append("\n");
        result.append("Order Total: ").append(order_total).append("\n");
        result.append("Order Time: ").append(order_time).append("\n");
        result.append("Items:\n");

        for (OrderItem item : items) 
        {
            result.append("Item: ").append(item.getItemName()).append(", Price: ").append(item.getPrice()).append("\n");
        }
        return result.toString();   
    }
    public int getOrderNumber()
    {
        return order_number;
    }
    public void setOrderStatus()
    {
        this.is_active = false;
    }
    public boolean isActive()
    {
        return is_active;
    }
}
