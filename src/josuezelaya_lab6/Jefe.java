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
public class Jefe extends Persona {
    private String seccion_trabajo;
    private ArrayList<Empleado> empleados_mismaseccion;
    private int numero_clientes;
    private double ganancia;

    public Jefe() {
        super();
    }

    public Jefe(String seccion_trabajo, int numero_clientes, double ganancia, int edad, long id, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, color_piel);
        this.seccion_trabajo = seccion_trabajo;
        this.numero_clientes = numero_clientes;
        this.ganancia = ganancia;
    }

  

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public ArrayList<Empleado> getEmpleados_mismaseccion() {
        return empleados_mismaseccion;
    }

    public void setEmpleados_mismaseccion(ArrayList<Empleado> empleados_mismaseccion) {
        this.empleados_mismaseccion = empleados_mismaseccion;
    }

    public int getNumero_clientes() {
        return numero_clientes;
    }

    public void setNumero_clientes(int numero_clientes) {
        this.numero_clientes = numero_clientes;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
    
}
