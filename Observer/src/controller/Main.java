/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import manager.ListenerImpl;
import manager.Subiect;

/**
 *
 * @author Guga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subiect s = new Subiect();
        
        ListenerImpl l = new ListenerImpl();
        ListenerImpl l1 = new ListenerImpl();
        ListenerImpl l2 = new ListenerImpl();
        
        s.addL(l);
        s.addL(l2);
        s.addL(l1);
        
        s.method();
    }
    
}
