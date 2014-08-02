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
public class Cliente implements Accion{
    int identificacion_cliente,telefono;
    String nombre, direccion, correo;

    public Cliente(int identificacion_cliente, String nombre, String direccion, String correo,int telefono) {
        this.identificacion_cliente = identificacion_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono= telefono;
    }
   
    @Override
    public String getnombre() {
        return this.nombre;
    }

    public void setIdentificacion_cliente(int identificacion_cliente) {
        this.identificacion_cliente = identificacion_cliente;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        return this.identificacion_cliente;
    }
    
}
