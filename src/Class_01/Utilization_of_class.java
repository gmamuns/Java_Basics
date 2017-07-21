
package Class_01;

/**
 *
 * @author Mamuns
 */

public class Utilization_of_class {
    public static void main(String[] args) {
        Box box = new Box();
        box.depth = 22;
        box.height = 23;
        box.width = 24;
        
        double volume =  box.depth*box.height*box.width;
        System.out.println(volume);
        
    }
     
}

