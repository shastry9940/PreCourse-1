//Executed the code successfully
// Time complexity = O(1) and space complexity = O(1)
import java.io.*;
import java.util.*;
 
public class Stack {
 
    private int arr[];
    private int size;
    private int counter;
 
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        this.counter = 0;
    }
 
    public void push(int data) {
 
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
 
        arr[counter] = data;
        counter++;
    }
 
    public int pop() {
 
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[--counter];
    }
 
    public boolean isEmpty() {
        if (counter == 0) {
            return true;
        }
        return false;
    }
 
    public boolean isFull() {
        if (counter == size) {
            return true;
        }
        return false;
    }
 
    public int size() {
        return counter;
    }
 
  
// Driver code 
 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(10); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        s.push(40);
        for (int i=0 ; i<10; i++)
            System.out.println("Stack print - " +s.arr[i]);
    } 
}
