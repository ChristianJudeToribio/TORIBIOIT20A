
package Prelim;
//import java.util.LinkedList;
//singly linkedList
public class Linkedlistdemo {
    //Node
      //inner class 
    class Magic{
        int data;
        Magic next;
        
       Magic(int data){
            this.data = data;
            this.next = null;
        }
    }
  
    Magic head;
    void add (int data) { 
        Magic newMagic = new Magic (data);
        if (head == null){
            head = newMagic;
            return;
         }
        Magic current = head ;
      while(current.next != null) {
        current = current.next;
                
    }
        current.next = newMagic;
    }
    
    void display () {
        Magic current = head;
        while(current.next != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
        public static void main (String [] args){
           Linkedlistdemo list = new Linkedlistdemo ();
           
           list.add(10);
           list.add(20);
           list.add(30);
            list.display();
        }           
    }
        
    
    

    



    
    
    
    
    
    
    
    

