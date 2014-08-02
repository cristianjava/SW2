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
public class Pagos {
    int Identidad,telefono_entrega;
    double total;
    String nombre_producto,direccion_entrega,correo_entrega;
    
    public Pagos(int identidad,double total, String nombre_producto, String direccion_entrega, int telefono_entrega, String correo_entrega){
        this.Identidad=identidad;
        this.total=total;
        this.nombre_producto=nombre_producto;
        this.direccion_entrega=direccion_entrega;
        this.telefono_entrega=telefono_entrega;
        this.correo_entrega=correo_entrega;
    }
    public Pagos() {
        
    }
    Accion accion;
    Cliente cliente;
    Producto producto;
    Comisionante comisionante;
    public void pagofisico(Cliente cliente,Producto producto){
        System.out.println("Identidad del Producto: "+producto.getIdentidad_producto());
        System.out.println("Nombre del Producto: "+producto.getNombre_producto());
        System.out.println("Direccion de Entrega: "+cliente.getdireccion());
        System.out.println("Telefono de entrega: "+cliente.gettelefono());
        System.out.println("Correo Electronico: "+cliente.getcorreo());
        System.out.println("Total a Pagar: "+producto.getPrecio());
    }
    
    public void pago_libro(Cliente cliente,Producto producto){
        System.out.println("Identidad del Libro: "+producto.getIdentidad_producto());
        System.out.println("Nombre del Libro: "+producto.getNombre_producto());
        System.out.println("Direccion de Entrega: "+cliente.getdireccion()+" 'Departamento del Libro'");
        System.out.println("Telefono de entrega: "+cliente.gettelefono());
        System.out.println("Correo Electronico: "+cliente.getcorreo());
        System.out.println("Total a Pagar: "+producto.getPrecio());
    }
    
    public void pago_membresia(Cliente cliente,Producto producto){
        System.out.println("Identidad de la Membresia: "+producto.getIdentidad_producto());
        System.out.println("Nombre de la Membresia: "+producto.getNombre_producto());
        System.out.println("Direccion de Entrega: "+cliente.getdireccion());
        System.out.println("Telefono de entrega: "+cliente.gettelefono());
        System.out.println("Correo Electronico: "+cliente.getcorreo());
        System.out.println("Total a Pagar: "+producto.getPrecio());
        System.out.println("****************************************************");
        System.out.println("La Membresia fue ARCHIVADA correctamente");
    }
    
    public void actualizar_membresia(Cliente cliente,Producto producto){
        System.out.println("Identidad de la Membresia: "+producto.getIdentidad_producto());
        System.out.println("Nombre de la Membresia: "+producto.getNombre_producto());
        System.out.println("Direccion de Entrega: "+cliente.getdireccion());
        System.out.println("Telefono de entrega: "+cliente.gettelefono());
        System.out.println("Correo Electronico: "+cliente.getcorreo());
        System.out.println("Total a Pagar: "+producto.getPrecio());
        int nuevaidentidad=7;
        int nuevotelefono=55457667;
        String nuevonombre="Los Aldeanos";
        String nuevadireccion="cra 13 # 23-54";
        String nuevocorreo="ccardona@hotmail.com";
        producto.setIdentidad_producto(nuevaidentidad);
        producto.setNombre_producto(nuevonombre);
        cliente.setDireccion(nuevadireccion);
        cliente.setTelefono(nuevotelefono);
        cliente.setCorreo(nuevocorreo);
        System.out.println("Nueva Identidad de la Membresia: "+producto.getIdentidad_producto());
        System.out.println("Nuevo Nombre de la membresia: "+producto.getNombre_producto());
        System.out.println("Nueva Direccion de Entrega: "+cliente.getdireccion());
        System.out.println("Nuevo Telefono de entrega: "+cliente.gettelefono());
        System.out.println("Nuevo Correo Electronico: "+cliente.getcorreo());
        System.out.println("Total a Pagar: "+producto.getPrecio());
        System.out.println("****************************************************");
        System.out.println("La Membresia Actualizada fue ARCHIVADA correctamente");
    }
    
    public void pago_video(Cliente cliente,Producto producto){
        System.out.println("Identidad del Video: "+producto.getIdentidad_producto());
        System.out.println("Nombre del Video: "+"'"+producto.getNombre_producto()+"'"+" y te obsequiamos gratis el video 'Primeros Auxilios'");
        System.out.println("Direccion de Entrega: "+cliente.getdireccion());
        System.out.println("Telefono de entrega: "+cliente.gettelefono());
        System.out.println("Correo Electronico: "+cliente.getcorreo());
        System.out.println("Total a Pagar: "+producto.getPrecio());
    }
    
    public void pago_comision(Comisionante comisionante,Producto producto,Cliente cliente){
        System.out.println("Cedula del Comisionante"+comisionante.getcedula());
        System.out.println("Nombre del Comisionante: "+comisionante.getnombre());
        System.out.println("Direccion del Comisionante: "+comisionante.getdireccion());
        System.out.println("Telefono del Comisionante: "+comisionante.gettelefono());
        System.out.println("Correo Electronico del Comisionante: "+cliente.getcorreo());
        double comision = producto.getPrecio()*0.05;
        System.out.println("Total de la comision: "+comision);
    }
}
