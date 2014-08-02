/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pagos;

/**
 *
 * @author usuario
 */
public class Producto {
    int identidad_producto,precio;
    String nombre_producto;

    public Producto(int identidad_producto, int precio, String nombre_producto) {
        this.identidad_producto = identidad_producto;
        this.precio = precio;
        this.nombre_producto = nombre_producto;
    }

    public int getIdentidad_producto() {
        return identidad_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdentidad_producto(int identidad_producto) {
        this.identidad_producto = identidad_producto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }
    
}
