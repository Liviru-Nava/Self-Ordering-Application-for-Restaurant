/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_item_classes;

/**
 *
 * @author ASUS
 */
public class MenuItemLinkedList 
{
    public MenuItemNode head;
    public MenuItemNode tail;
    
    public MenuItemLinkedList()
    {
        this.head = null;
        this.tail = null;
    }
    //method to insert products to the linked list
    public void insertProducts(String name, String category, double price, int popularity, int time)
    {
        MenuItemNode new_menu_list = new MenuItemNode(name, category, price, popularity, time);
        if(head == null)
        {
            head = new_menu_list;
            tail = new_menu_list;
        }
        else
        {
            tail.next = new_menu_list;
            new_menu_list.previous = tail;
            tail = new_menu_list;
        }
    }
}
