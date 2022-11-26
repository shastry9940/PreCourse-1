//Time complexity 0(1), space complexity o(1)

public class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int a[]; // Maximum size of Stack
    

    Stack()
    { 
       //Initialize your constructor
    //MAX = 1000; 
    top = -1;
    a = new int[MAX];
    } 
  
    boolean isEmpty() 
    {
        if (top == -1) return true;
        else return false;
    }
  
    boolean isFull()
    {
        if (top == MAX - 1) return true;
        else return false;
    }
    
    int push(int x) 
    {
        if(isFull()) return -1;
        else return a[++top]=x;
    }

  
    int pop() 
    { 
        if (isEmpty()) return -1;
        else return a[top--];
    } 
  
    int peek() 
    { 
           return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
