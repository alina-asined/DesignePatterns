/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guga
 */
public class Subiect {
    public List<ListenerInterface> listener = new ArrayList<>();
    
    public void addL(ListenerInterface list){
        listener.add(list);
        
    }
    
    public void removeL(ListenerInterface list){
        listener.remove(list);
    }
    
    public void method(){
        notification();
    }
    public void notification(){
        listener.forEach(ListenerInterface::subiectModificat);
    }
}
