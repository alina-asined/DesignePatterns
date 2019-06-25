/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author Guga
 */
public class ObjectDecorator {
    
    private DecoratorObject d;
    
    public ObjectDecorator(DecoratorObject e){
        this.d = e;
    }
    
    public void one(){
        d.one();
    }
    
    public void two(){
        d.two();
    }
}
