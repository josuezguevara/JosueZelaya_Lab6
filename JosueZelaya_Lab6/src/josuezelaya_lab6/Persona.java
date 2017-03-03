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
public class Persona {
    private int edad;
    private long id;
    private String nacionalidad;
    private String lugar_nacimiento;
    private String nombre;
    private DefaultTreeModel arbol_genealogico;
    private Color color_piel;
    private ArrayList<Familiares> familiares;

    public Persona() {
    }

    public Persona(int edad, long id, String nacionalidad, String lugar_nacimiento, String nombre, DefaultTreeModel arbol_genealogico, Color color_piel, ArrayList<Familiares> familiares) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.arbol_genealogico = arbol_genealogico;
        this.color_piel = color_piel;
        this.familiares = familiares;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DefaultTreeModel getArbol_genealogico() {
        return arbol_genealogico;
    }

    public void setArbol_genealogico(DefaultTreeModel arbol_genealogico) {
        this.arbol_genealogico = arbol_genealogico;
    }

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public ArrayList<Familiares> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Familiares> familiares) {
        this.familiares = familiares;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
