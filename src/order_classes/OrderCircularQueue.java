/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order_classes;

/**
 *
 * @author ASUS
 */
public class OrderCircularQueue 
{
    private static final int MAX_SIZE = 10;
    public Order[] orders;
    public int front, rear, size;
    
    public OrderCircularQueue()
    {
        orders = new Order[MAX_SIZE];
        front=rear=size=0;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean isFull()
    {
        return size == MAX_SIZE;
    }
    public void enqueueOrder(Order order)
    {
        if (!isFull()) 
        {
            orders[rear] = order;
            rear = (rear + 1) % MAX_SIZE;
            size++;
        } 
        else 
        {
            System.out.println("Queue is full. Cannot enqueue.");
        }
    }
    public Order dequeueOrder() {
        if (!isEmpty()) 
        {
            Order order = orders[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            return order;
        } 
        else 
        {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
    }
}
