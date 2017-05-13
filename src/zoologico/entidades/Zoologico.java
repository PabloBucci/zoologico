package zoologico.entidades;

import java.util.Date;

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
    public static final int CANTIDAD_ANIMALES = 25;
    public static final int RACIONES_POR_ANIMAL = 5;
    
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
        Cuidador c1 = new Cuidador ("Juan", new Date (1988,3,8), cantidadDeRaciones);
        c1.alimentarAnimales();
    }
}
