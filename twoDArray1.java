
package Prelim;


public class twoDArray1 {
      
    
    public static void main(String[] args) {
       int grades [] [] = {
       
      { 80, 85, 90, 95,98},
       { 82, 87, 92, 97,100},
       { 81, 86, 91, 96,99},
       
       };
       
        for ( int i = 0; i < grades.length; i++) 
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i] [j]  +    "  ");
            }
           System.out.println();
        }
       
    }

    
    

