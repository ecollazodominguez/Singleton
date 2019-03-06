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
public class Singleton {

    private String modelo;
    private String marca;
    private static Singleton instance = null;

    //no se puede instanciar pues solo nos interesa solo UN objeto
    private Singleton() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Singleton{" + "modelo=" + modelo + ", marca=" + marca + '}';
    }

    
    
    //Usamos el método para instanciar el Singleton, si es null, se crea, sino, devuelve el objeto.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
