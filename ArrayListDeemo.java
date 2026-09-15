
package Prelim;
import java.util.ArrayList;

public class ArrayListDeemo {
     public static void main(String [] args) {
    ArrayList <String> names = new ArrayList<>();
    
    names.add("Baby");
     names.add("Cutiepie");
     names.add("Sugarplum");
     names.add("Honey");
      names.add("bunch");
      names.add("Ko");
      
      names.set(0, "MyLoves");
      names.remove("Cutiepie");
        // names.clear();
        
        
      System.out.println(names);
         for (int i = 0; i < names.size(); i++) {
             System.out.println(names.get(i)  +   " ");
             
          
         }
}
}
