/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_item_classes;
import selfordering.apllication.Admin1;

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
    public void updateinfo(String name, String category, double price, int popularity, int time)
    {
        MenuItemNode current=tail;
        while(!current.item_name.equals(name))
        {            
            current=current.previous;
        }
        current.item_name=name;
        current.item_category=category;
        current.item_price=price;
        current.item_preparation_time=time;
    }
    public void deletemiddle(String name)
    {
        MenuItemNode current=tail;
        while(!current.item_name.equals(name))
        {            
            current=current.previous;
        }
        // Check if the node with the specified name is found
        if (current != null) 
        {
            // Update next pointer of the previous node
            if (current.previous != null) 
            {
                current.previous.next = current.next;
            }
            // Update previous pointer of the next node
            if (current.next != null) 
            {
                current.next.previous = current.previous;
            }
            //if the current is a tail
            if (current == tail) 
            {
                tail = current.previous; // Update tail to the previous node
            }
        }
    }
    public void updatePopular(String name,int popularity)
    {
        MenuItemNode current=tail;
        while(!current.item_name.equals(name))
        {            
            current=current.previous;
        }
        current.item_popularity=popularity;
    }

    //perform merge sort from min to max
    public void mergeSortMinMax()
    {
        head = mergeSortMinMaxRec(head);
    }
    private MenuItemNode mergeSortMinMaxRec(MenuItemNode list_head)
    {
        if (list_head == null || list_head.next == null) 
        {
            return list_head; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleMinMax(list_head);
        MenuItemNode nextOfMiddle = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        MenuItemNode left = mergeSortMinMaxRec(nextOfMiddle);
        MenuItemNode right = mergeSortMinMaxRec(list_head);

        // Merge the sorted halves
        return mergeMinMax(left, right);
    }
    // Merge two sorted linked lists
    private MenuItemNode mergeMinMax(MenuItemNode left, MenuItemNode right) 
    {
        MenuItemNode result = null;
        if (left == null) 
        {
            return right;
        }
        if (right == null) 
        {
            return left;
        }
        // Compare prices and merge
        if (left.getPrice() <= right.getPrice()) 
        {
            result = left;
            result.next = mergeMinMax(left.next, right);
        } 
        else 
        {
            result = right;
            result.next = mergeMinMax(left, right.next);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleMinMax(MenuItemNode list_head) 
    {
        if (list_head == null) 
        {
            return list_head;
        }
        MenuItemNode slow = list_head, fast = list_head;
        while (fast.next != null && fast.next.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //perform merge sort from min to max
    public void mergeSortMaxMin()
    {
        head = mergeSortMaxMinRec(head);
    }
    private MenuItemNode mergeSortMaxMinRec(MenuItemNode list_head)
    {
        if (list_head == null || list_head.next == null) 
        {
            return list_head; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleMaxMin(list_head);
        MenuItemNode nextOfMiddle = middle.next;
        middle.next = null;
        // Recursively sort the two halves
        MenuItemNode left = mergeSortMaxMinRec(list_head);
        MenuItemNode right = mergeSortMaxMinRec(nextOfMiddle);
        // Merge the sorted halves
        return mergeMaxMin(left, right);
    }
    // Merge two sorted linked lists
    private MenuItemNode mergeMaxMin(MenuItemNode left, MenuItemNode right)
    {
        MenuItemNode result = null;
        if (left == null) 
        {
            return right;
        }
        if (right == null) 
        {
            return left;
        }
        // Compare prices and merge
        if (left.getPrice() >= right.getPrice()) 
        {
            result = left;
            result.next = mergeMaxMin(left.next, right);
        } 
        else 
        {
            result = right;
            result.next = mergeMaxMin(left, right.next);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleMaxMin(MenuItemNode list_head) 
    {
        if (list_head == null) 
        {
            return list_head;
        }
        MenuItemNode slow = list_head, fast = list_head;
        while (fast.next != null && fast.next.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //perform merge sort from min to max
    public void mergeSortAlphabetical()
    {
        head = mergeSortAlphabeticalRec(head);
    }
    private MenuItemNode mergeSortAlphabeticalRec(MenuItemNode list_head)
    {
        if (list_head == null || list_head.next == null) 
        {
            return list_head; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleAlphabetical(list_head);
        MenuItemNode nextOfMiddle = middle.next;
        middle.next = null;
        // Recursively sort the two halves
        MenuItemNode left = mergeSortAlphabeticalRec(list_head);
        MenuItemNode right = mergeSortAlphabeticalRec(nextOfMiddle);
        // Merge the sorted halves
        return mergeAlphabetical(left, right);
    }
    // Merge two sorted linked lists
    private MenuItemNode mergeAlphabetical(MenuItemNode left, MenuItemNode right) 
    {
        MenuItemNode result = null;
        if (left == null) 
        {
            return right;
        }
        if (right == null) 
        {
            return left;
        }
        // Compare prices and merge
        if (left.getName().compareTo(right.getName())<= 0) 
        {
            result = left;
            result.next = mergeAlphabetical(left.next, right);
        } 
        else 
        {
            result = right;
            result.next = mergeAlphabetical(left, right.next);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleAlphabetical(MenuItemNode list_head) 
    {
        if (list_head == null) 
        {
            return list_head;
        }
        MenuItemNode slow = list_head, fast = list_head;
        while (fast.next != null && fast.next.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    //perform merge sort from min to max
    public void mergeSortPopular()
    {
        head = mergeSortPopularRec(head);
    }
    private MenuItemNode mergeSortPopularRec(MenuItemNode list_head)
    {
        if (list_head == null || list_head.next == null) 
        {
            return list_head; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddlePopular(list_head);
        MenuItemNode nextOfMiddle = middle.next;
        middle.next = null;
        // Recursively sort the two halves
        MenuItemNode left = mergeSortPopularRec(list_head);
        MenuItemNode right = mergeSortPopularRec(nextOfMiddle);
        // Merge the sorted halves
        return mergePopular(left, right);
    }
    // Merge two sorted linked lists
    private MenuItemNode mergePopular(MenuItemNode left, MenuItemNode right)
    {
        MenuItemNode result = null;
        if (left == null) 
        {
            return right;
        }
        if (right == null) 
        {
            return left;
        }
        // Compare prices and merge
        if (left.getPopularity()>= right.getPopularity()) 
        {
            result = left;
            result.next = mergePopular(left.next, right);
        }
        else 
        {
            result = right;
            result.next = mergePopular(left, right.next);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddlePopular(MenuItemNode list_head) 
    {
        if (list_head == null) 
        {
            return list_head;
        }
        MenuItemNode slow = list_head, fast = list_head;
        while (fast.next != null && fast.next.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void display()
    {
        MenuItemNode currItemNode=head;
        while (currItemNode!= null) 
        {
            System.out.println(currItemNode.item_name);
            currItemNode = currItemNode.next;
        }
    }
}










