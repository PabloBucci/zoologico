/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

/**
 *
 * @author julio.schw
 */
public class Programa {
    
    public void main(){
        Zoologico zoo = new Zoologico();
        zoo.abrir();
        zoo.alimentarAnimales(1000);
        zoo.cerrar();
    }
    
    
}
