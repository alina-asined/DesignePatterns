/* ex primeste o configutatie de la o DB  la care se conecteaza,si folosind aceasta cnfiguratie fabricam mai multe instante
    DP creational-creere de iinstante;practim ce ii cerem ne intoarce o instanta de un anumit tip
*/
package controller;

import manager.Factory;
import manager.FactoryI;


public class Main {

    public static void main(String[] args) {
      Factory f =  Factory.createObject(Factory.Types.X);
      f.m1();
      Factory f1 =  Factory.createObject(Factory.Types.Y);
      f.m2();
    
      FactoryI f2 = new FactoryI();
      f2.m1();
    }
    
}
