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
public class Comisionante implements Accion{
    int identificacion_comisionante,telefono;
    String nombre,direccion,correo;

    public Comisionante(int identificacion_comisionante, String nombre, String direccion, String correo,int telefono) {
        this.identificacion_comisionante = identificacion_comisionante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono=telefono;
    }
    
    @Override
    public String getnombre() {
        return this.nombre;
    }

    @Override
    public String getdireccion() {
        return this.direccion;
    }

    @Override
    public int gettelefono() {
        return this.telefono;
    }

    @Override
    public String getcorreo() {
        return this.correo;
    }

    @Override
    public int getcedula() {
        return this.identificacion_comisionante;
    }
    
}
