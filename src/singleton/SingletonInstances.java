/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Mirroriced
 */
public class SingletonInstances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Singleton s = Singleton.getInstance();
     Singleton s2 = Singleton.getInstance();
     
     s.setMarca("OPEL");
     s.setModelo("CORSA");
     
        System.out.println(s.toString());
        
     s2.setMarca("RENAULT");
     s2.setModelo("CLIO");
     
        System.out.println(s2.toString());
        System.out.println(s.toString());
    }
    
}
