package root;
import Pagos.Cliente;
import Pagos.Comisionante;
import Pagos.Pagos;
import Pagos.Producto;


public class root {
    
    public static void main(String[] args) {
        
        boolean pago_fisico = false;
        boolean pago_libro = false;
        boolean pago_membrecia = false;
        boolean pago_actualizar_membrecia = false;
        boolean pago_video = true;
        boolean pago_comision = false;
        
//++++++++++++++ INGRESE LOS DATOS +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++      
        int identidad_producto = 598747;
        String nombre_producto="el cambio esta en ti";
        int total = 20000;
        int identidad_cliente = 10044343;
        String nombre_cliente="Juan";
        String direccion_cliente="cll 55B # 55A-87";
        String correo_cliente="jmaria@gmail.com";
        int telefono_cliente=8854345;
        int identificacion_comisionante=1038865543;
        String nombre_comisionante="Jose";
        String direccion_comisionante="crr 23 # 15A-24";
        String correo_comisionante="juancpulgarin@yahoo.es";
        int telefono_comisionante=5567765;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        if(pago_fisico){
            Pagos p = new Pagos(identidad_producto, total, nombre_producto, direccion_cliente, telefono_cliente, correo_cliente);
            Cliente cl = new Cliente(identidad_cliente, nombre_cliente, direccion_cliente, correo_cliente, telefono_cliente);
            Producto pr = new Producto(identidad_producto, total, nombre_producto);
            p.pagofisico(cl,pr);
        }
        if(pago_libro){
            Pagos p = new Pagos(identidad_producto, total, nombre_producto, direccion_cliente, telefono_cliente, correo_cliente);
            Cliente cl = new Cliente(identidad_cliente, nombre_cliente, direccion_cliente, correo_cliente, telefono_cliente);
            Producto pr = new Producto(identidad_producto, total, nombre_producto);
            p.pago_libro(cl,pr);
        }
        if(pago_membrecia){
            Pagos p = new Pagos(identidad_producto, total, nombre_producto, direccion_cliente, telefono_cliente, correo_cliente);
            Cliente cl = new Cliente(identidad_cliente, nombre_cliente, direccion_cliente, correo_cliente, telefono_cliente);
            Producto pr = new Producto(identidad_producto, total, nombre_producto);
            p.pago_membresia(cl,pr);
        }
        if(pago_actualizar_membrecia){
            Pagos p = new Pagos(identidad_producto, total, nombre_producto, direccion_cliente, telefono_cliente, correo_cliente);
            Cliente cl = new Cliente(identidad_cliente, nombre_cliente, direccion_cliente, correo_cliente, telefono_cliente);
            Producto pr = new Producto(identidad_producto, total, nombre_producto);
            p.actualizar_membresia(cl,pr);
        }
        if(pago_membrecia | pago_actualizar_membrecia){
            System.out.println("UN CORREO DE VERIFICACION FUE ENVIADO AL CORREO ELECTRONICO: "+correo_cliente);
        }
        if(pago_video){
            Pagos p = new Pagos(identidad_producto, total, nombre_producto, direccion_cliente, telefono_cliente, correo_cliente);
            Cliente cl = new Cliente(identidad_cliente, nombre_cliente, direccion_cliente, correo_cliente, telefono_cliente);
            Producto pr = new Producto(identidad_producto, total, nombre_producto);
            p.pago_video(cl,pr);
        }
        if(pago_libro  | pago_fisico){
            Pagos p = new Pagos(identidad_producto, total, nombre_producto, direccion_cliente, telefono_cliente, correo_cliente);
            Cliente cl = new Cliente(identidad_cliente, nombre_cliente, direccion_cliente, correo_cliente, telefono_cliente);
            Producto pr = new Producto(identidad_producto, total, nombre_producto);
            Comisionante co = new Comisionante(identificacion_comisionante, nombre_comisionante, direccion_comisionante, correo_comisionante, telefono_comisionante);
            p.pago_comision(co,pr,cl);
        }
        if(pago_comision){
            Pagos p = new Pagos(identidad_producto, total, nombre_producto, direccion_cliente, telefono_cliente, correo_cliente);
            Cliente cl = new Cliente(identidad_cliente, nombre_cliente, direccion_cliente, correo_cliente, telefono_cliente);
            Producto pr = new Producto(identidad_producto, total, nombre_producto);
            Comisionante co = new Comisionante(identificacion_comisionante, nombre_comisionante, direccion_comisionante, correo_comisionante, telefono_comisionante);
            p.pago_comision(co,pr,cl);
        }
    }
    
}
