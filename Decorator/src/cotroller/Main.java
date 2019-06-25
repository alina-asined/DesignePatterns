
package cotroller;

import manager.DecoratorObject;
import manager.ObjectDecorator;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DecoratorObject d = new DecoratorObject();
       ObjectDecorator p = new ObjectDecorator(d);
       d.one();
    }
    
}
