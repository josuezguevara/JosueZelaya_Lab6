/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author usuario
 */
public class Cliente  extends Persona{
    private int ticket;
    private long dinero_quelleva;
    private ArrayList<Orden> ordenes;

    public Cliente() {
        super();
    }

    public Cliente(int ticket, long dinero_quelleva, ArrayList<Orden> ordenes, int edad, long id, String nacionalidad, String lugar_nacimiento, String nombre, DefaultTreeModel arbol_genealogico, Color color_piel, ArrayList<Familiares> familiares) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, arbol_genealogico, color_piel, familiares);
        this.ticket = ticket;
        this.dinero_quelleva = dinero_quelleva;
        this.ordenes = ordenes;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public long getDinero_quelleva() {
        return dinero_quelleva;
    }

    public void setDinero_quelleva(long dinero_quelleva) {
        this.dinero_quelleva = dinero_quelleva;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
