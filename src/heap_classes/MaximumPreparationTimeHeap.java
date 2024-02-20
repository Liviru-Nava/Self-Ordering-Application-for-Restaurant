/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heap_classes;

/**
 *
 * @author ASUS
 */
public class MaximumPreparationTimeHeap 
{
    private int[] heap;
    private int size;
    private int capacity;
    
    public MaximumPreparationTimeHeap(int capacity)
    {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }
    public void insert(int value) 
    {
        if (size == capacity) 
        {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }
        heap[size] = value;
        heapifyUp(size);
        size++;
    }
    private void heapifyUp(int index) 
    {
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heap[index] > heap[parentIndex]) 
        {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }
    public int extractMax() 
    {
        if (size == 0) 
        {
            System.out.println("Heap is empty. Cannot extract maximum element.");
            return -1; // or throw an exception
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }
    private void heapifyDown(int index) 
    {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largest = index;

        if (leftChildIndex < size && heap[leftChildIndex] > heap[largest]) 
        {
            largest = leftChildIndex;
        }

        if (rightChildIndex < size && heap[rightChildIndex] > heap[largest]) 
        {
            largest = rightChildIndex;
        }
        if (largest != index) 
        {
            swap(index, largest);
            heapifyDown(largest);
        }
    }
    private void swap(int i, int j) 
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public void printHeap() 
    {
        for (int i = 0; i < size; i++) 
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
