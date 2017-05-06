
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Zoologico {
    private final int CANTIDAD_ANIMALES = 25;
    private final int RACIONES_POR_ANIMAL = 5;
    
    private boolean abierto;

    public Zoologico() {
        this.abierto = false;
    }
    
    public void abrir(){
        this.abierto = true;
    }
    
    public void cerrar(){
        this.abierto = false;
    }
    
    public void alimentarAnimales(int cantidadDeRaciones){
        
    }
}
