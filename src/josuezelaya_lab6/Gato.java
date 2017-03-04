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
public class Gato extends Articulo{
    private int peso;
    private int altura;

    public Gato() {
        super();
    }

    public Gato(int peso, int altura, int precio) {
        super(precio);
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
