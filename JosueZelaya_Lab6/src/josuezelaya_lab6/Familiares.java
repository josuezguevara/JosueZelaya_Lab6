/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab6;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
class Familiares {
    private int edad;
    private long id;
    private String nacionalidad;
    private String lugar_nacimiento;
    private String nombre;
    private Color color_piel;
    private Familiares familiar_padre;
    private ArrayList<Familiares> hijos;

    public Familiares() {
    }

    public Familiares(int edad, long id, String nacionalidad, String lugar_nacimiento, String nombre, Color color_piel, Familiares familiar_padre) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color_piel = color_piel;
        this.familiar_padre = familiar_padre;
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

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public Familiares getFamiliar_padre() {
        return familiar_padre;
    }

    public void setFamiliar_padre(Familiares familiar_padre) {
        this.familiar_padre = familiar_padre;
    }

    public ArrayList<Familiares> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Familiares> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
