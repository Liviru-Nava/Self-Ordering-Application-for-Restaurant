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
    //perform merge sort from min to max
    public void mergeSortMinMax()
    {
        head = mergeSortMinMaxRec(head);
    }
    private MenuItemNode mergeSortMinMaxRec(MenuItemNode listHead)
    {
        if (listHead == null || listHead.next == null) {
            return listHead; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleMinMax(listHead);
        MenuItemNode nextOfMiddle = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        MenuItemNode left = mergeSortMinMaxRec(listHead);
        MenuItemNode right = mergeSortMinMaxRec(nextOfMiddle);

        // Merge the sorted halves
        return mergeMinMax(left, right);
    }
    // Merge two sorted linked lists
    private MenuItemNode mergeMinMax(MenuItemNode left, MenuItemNode right) {
        MenuItemNode result = null;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        // Compare prices and merge
        if (left.getPrice() <= right.getPrice()) {
            result = left;
            result.next = mergeMinMax(left.next, right);
        } else {
            result = right;
            result.next = mergeMinMax(left, right.next);
        }

        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleMinMax(MenuItemNode head) {
        if (head == null) {
            return head;
        }

        MenuItemNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    //perform merge sort from max to min
    public void mergeSortMaxMin()
    {
        head = mergeSortMaxMinRec(head);
    }
    private MenuItemNode mergeSortMaxMinRec(MenuItemNode listHead)
    {
        if (listHead == null || listHead.next == null) {
            return listHead; // Already sorted or only one element
        }
        // Split the list into two halves
        MenuItemNode middle = getMiddleMaxMin(listHead);
        MenuItemNode nextOfMiddle = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        MenuItemNode left = mergeSortMaxMinRec(listHead);
        MenuItemNode right = mergeSortMaxMinRec(nextOfMiddle);

        // Merge the sorted halves
        return mergeMaxMin(left, right);
    }
    // Merge two sorted linked lists
    private MenuItemNode mergeMaxMin(MenuItemNode left, MenuItemNode right) {
        MenuItemNode result = null;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        // Compare prices and merge
        if (left.getPrice() >= right.getPrice()) {
            result = left;
            result.next = mergeMaxMin(left.next, right);
        } else {
            result = right;
            result.next = mergeMaxMin(left, right.next);
        }

        return result;
    }
    // Helper method to find the middle of the linked list
    private MenuItemNode getMiddleMaxMin(MenuItemNode head) {
        if (head == null) {
            return head;
        }

        MenuItemNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    // Perform merge sort for alphabetical order (A-Z)
    public void mergeSortAlphabetical() {
        head = mergeSortAlphabeticalRec(head);
    }

    // Recursive method for Merge Sort for alphabetical order
    private MenuItemNode mergeSortAlphabeticalRec(MenuItemNode listHead) {
        if (listHead == null || listHead.next == null) {
            return listHead; // Already sorted or only one element
        }

        // Split the list into two halves
        MenuItemNode middle = getMiddleAlphabetical(listHead);
        MenuItemNode nextOfMiddle = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        MenuItemNode left = mergeSortAlphabeticalRec(listHead);
        MenuItemNode right = mergeSortAlphabeticalRec(nextOfMiddle);

        // Merge the sorted halves
        return mergeAlphabetical(left, right);
    }

    // Merge two sorted linked lists for alphabetical order
    private MenuItemNode mergeAlphabetical(MenuItemNode left, MenuItemNode right) {
        MenuItemNode result = null;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        // Compare names and merge
        if (left.getName().compareTo(right.getName()) <= 0) 
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

    // Helper method to find the middle of the linked list for alphabetical order
    private MenuItemNode getMiddleAlphabetical(MenuItemNode head) {
        if (head == null) {
            return head;
        }

        MenuItemNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
