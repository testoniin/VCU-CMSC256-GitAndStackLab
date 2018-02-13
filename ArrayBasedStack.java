import java.util.*;
public class ArrayBasedStack<T> implements StackInterface<T>{
   private T data[];//
   private int topOfStack;
   private int INITIAL_CAPACITY = 5;
   private boolean initialized;
   
   public ArrayBasedStack(int INITIAL_CAPACITY){
      if(INITIAL_CAPACITY <= 0){
         throw new IllegalArgumentException("initial capacity has to be greater than 0");
      
      }
      else{
         
         topOfStack = -1;
            this.INITIAL_CAPACITY=INITIAL_CAPACITY;
            this.data=(T[])new Object[INITIAL_CAPACITY];
         }
   }
   
   public ArrayBasedStack(){
      topOfStack = -1;
      this.INITIAL_CAPACITY = 5;
      this.data=(T[])new Object[INITIAL_CAPACITY];
      
   }
   
   private T[] expandArray(){
      T[] eArray = Arrays.copyOf(data, ((data.length)*2));
      this.data = eArray;
      return data;    
   }
   
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry){
      if (topOfStack <= (data.length-1)){
         this.expandArray();
      }
      data[topOfStack+1] = newEntry;
      }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop(){
      if(this.isEmpty()){
         throw new EmptyStackException();
      }
      else{
         T top = data[topOfStack];
         data[topOfStack] = null;
         this.topOfStack--;
         return top;
      }
      
   }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek(){
      if(this.isEmpty()){
         throw new EmptyStackException();
      }
      else{
         return data[topOfStack];
      }


   }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){
      return topOfStack == -1; 
   }
  
   /** Removes all entries from this stack. */
   public void clear(){
      while(!this.isEmpty()){
         this.pop();
      }
   }

public static void main(String args[]){
   StackInterface<String> stack = new ArrayBasedStack(3);
   System.out.println(stack.isEmpty());
   stack.push("b");
   stack.push("e");
   stack.peek();
   stack.pop();
   stack.peek();
   stack.pop();
   stack.push("o");
   stack.pop();
   System.out.println(stack.isEmpty());
   stack.pop();
}

}