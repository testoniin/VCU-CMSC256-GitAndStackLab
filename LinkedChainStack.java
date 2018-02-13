import java.util.EmptyStackException;
public class LinkedChainStack<E> implements StackInterface<E> {
   private Node<E> topNode;
   private int size;
   
   public LinkedChainStack(){
   this.topNode = null;
   this.size = 0;
   }
   
   public LinkedChainStack(int size){
   this.topNode = null;
   this.size = size;
   }

   
   public void push(E newElement) {
      
// create a node that holds the new element
// set the next node reference of the new node to the current top
// set the top node to reference the new element
   }
   public boolean isEmpty() {
// empty if the topNode is null
   }
   public E pop() {
// throw an exception if stack is empty
// store data from current top node (type E)
// set the top node to reference the next node in the stack
// return the stored data
   }
   public E peek() {
// throw an exception if stack is empty
// return the data from the top node
   }
}