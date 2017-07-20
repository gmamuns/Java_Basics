package Class_01;

/**
 *
 * @author mamuns
 */
public class For_and_advanced_ForLoop {

    public static void main(String[] args) {
       
        
        //Traditional for Loop
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is: " + i);
        }
        
        
        //For Loop to access collections/Object
        int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
        
        
        
    }
}
