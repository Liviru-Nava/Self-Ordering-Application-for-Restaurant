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
        tail = mergeSortMinMaxRec(tail);
    }
    private MenuItemNode mergeSortMinMaxRec(MenuItemNode listTail)
    {
        if (listTail == null || listTail.previous == null) 
        {
            return listTail; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleMinMax(listTail);
        MenuItemNode nextOfMiddle = middle.previous;
        middle.previous = null;

        // Recursively sort the two halves
        MenuItemNode left = mergeSortMinMaxRec(listTail);
        MenuItemNode right = mergeSortMinMaxRec(nextOfMiddle);

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
            result.previous = mergeMinMax(left.previous, right);
        } 
        else 
        {
            result = right;
            result.previous = mergeMinMax(left, right.previous);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleMinMax(MenuItemNode head) 
    {
        if (head == null) 
        {
            return head;
        }
        MenuItemNode slow = head, fast = head;
        while (fast.previous != null && fast.previous.previous != null) 
        {
            slow = slow.previous;
            fast = fast.previous.previous;
        }
        return slow;
    }
    //perform merge sort from min to max
    public void mergeSortMaxMin()
    {
        tail = mergeSortMaxMinRec(tail);
    }
    private MenuItemNode mergeSortMaxMinRec(MenuItemNode listTail)
    {
        if (listTail == null || listTail.previous == null) 
        {
            return listTail; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleMaxMin(listTail);
        MenuItemNode nextOfMiddle = middle.previous;
        middle.previous = null;
        // Recursively sort the two halves
        MenuItemNode left = mergeSortMaxMinRec(listTail);
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
            result.previous = mergeMaxMin(left.previous, right);
        } 
        else 
        {
            result = right;
            result.previous = mergeMaxMin(left, right.previous);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleMaxMin(MenuItemNode head) 
    {
        if (head == null) 
        {
            return head;
        }
        MenuItemNode slow = head, fast = head;
        while (fast.previous != null && fast.previous.previous != null) 
        {
            slow = slow.previous;
            fast = fast.previous.previous;
        }
        return slow;
    }
    //perform merge sort from min to max
    public void mergeSortAlphabetical()
    {
        tail = mergeSortAlphabeticalRec(tail);
    }
    private MenuItemNode mergeSortAlphabeticalRec(MenuItemNode listTail)
    {
        if (listTail == null || listTail.previous == null) 
        {
            return listTail; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleAlphabetical(listTail);
        MenuItemNode nextOfMiddle = middle.previous;
        middle.previous = null;
        // Recursively sort the two halves
        MenuItemNode left = mergeSortAlphabeticalRec(listTail);
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
            result.previous = mergeAlphabetical(left.previous, right);
        } 
        else 
        {
            result = right;
            result.previous = mergeAlphabetical(left, right.previous);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleAlphabetical(MenuItemNode head) 
    {
        if (head == null) 
        {
            return head;
        }
        MenuItemNode slow = head, fast = head;
        while (fast.previous != null && fast.previous.previous != null) 
        {
            slow = slow.previous;
            fast = fast.previous.previous;
        }
        return slow;
    }
    
    //perform merge sort from min to max
    public void mergeSortPopular()
    {
        tail = mergeSortPopularRec(tail);
    }
    private MenuItemNode mergeSortPopularRec(MenuItemNode listTail)
    {
        if (listTail == null || listTail.previous == null) 
        {
            return listTail; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddlePopular(listTail);
        MenuItemNode nextOfMiddle = middle.previous;
        middle.previous = null;
        // Recursively sort the two halves
        MenuItemNode left = mergeSortPopularRec(listTail);
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
            result.previous = mergePopular(left.previous, right);
        }
        else 
        {
            result = right;
            result.previous = mergePopular(left, right.previous);
        }
        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddlePopular(MenuItemNode head) 
    {
        if (head == null) 
        {
            return head;
        }
        MenuItemNode slow = head, fast = head;
        while (fast.previous != null && fast.previous.previous != null) 
        {
            slow = slow.previous;
            fast = fast.previous.previous;
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










