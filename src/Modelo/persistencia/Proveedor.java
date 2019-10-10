package Modelo.persistencia;
// Generated 09/10/2019 12:10:40 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private String idProveedor;
     private String descripcion;
     private Set productos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String idProveedor, String descripcion) {
        this.idProveedor = idProveedor;
        this.descripcion = descripcion;
    }
    public Proveedor(String idProveedor, String descripcion, Set productos) {
       this.idProveedor = idProveedor;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public String getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


