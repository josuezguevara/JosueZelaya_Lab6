/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab6;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Baleada extends    Articulo{
    private ArrayList ingredientes;

    public Baleada() {
        super();
    }

    public Baleada(ArrayList ingredientes, int precio) {
        super(precio);
        this.ingredientes = ingredientes;
    }

    public ArrayList getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
