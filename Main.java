import java.util.*;
public class Main {
  /********

Implementing Queue and assigning values to enqueue and dequeue

  *********/
    public static void main(String[] args) {
    
    Main queuey=new Main();
    System.out.println("Added Elements to Queque using 2 stacks");
    queuey.enqueue(8);
    queuey.enqueue(9);
    queuey.enqueue(10);

    queuey.dequeue();

    queuey.enqueue(11);
    queuey.enqueue(12);
    
    queuey.dequeue();
    queuey.dequeue();
    queuey.dequeue();
    

  }
  /********

Implementing and creating 2 stacks 
Doing this will emplement push() to put into the queue 

  *********/
  private Stack<Integer> firstS=new Stack<>();
  private Stack<Integer> secondS=new Stack<>();
   /********

enqueue is initiated but the first Stack (firstS)
pushes itself into element (integer e)

  *********/

  public void enqueue(int e){
    firstS.push(e);
  }


     /********

dequeue is initiated 
but checks if second stack (secondS) and first stack (firstS) is empty 
and if the firstS isnt emptu it pushes the 
popped element of firstS to secondS
to define the queue

  *********/
  public void dequeue(){
    if(secondS.isEmpty()){
      if(firstS.isEmpty()){
        System.out.println("nothing");
      }
      else{
        while(!firstS.isEmpty()){
          secondS.push(firstS.pop());
        }

      }

    }
    System.out.print(secondS.pop()+" ");

  }


}