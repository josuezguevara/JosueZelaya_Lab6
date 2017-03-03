/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab6;

/**
 *
 * @author usuario
 */
class Orden {
  private   int cantidad_articulos;
  private Empleado empleado;

    public Orden() {
    }

    public Orden(int cantidad_articulos, Empleado empleado) {
        this.cantidad_articulos = cantidad_articulos;
        this.empleado = empleado;
    }

    public int getCantidad_articulos() {
        return cantidad_articulos;
    }

    public void setCantidad_articulos(int cantidad_articulos) {
        this.cantidad_articulos = cantidad_articulos;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
  
}
