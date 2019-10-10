
package DemoMVC;

import Vista.Alta_Proveedor;

public class DemoMVC {
/*Cuando insertamos dato en cada tabla, como en marca, presentacion, proveedor y presentacion 
    dichos datos introducidos en sus respectivas tablas, deben ser introduciods los mismos datos
    por la relacion que tienen, por ello debe introducir los mismos datos y complementar con sus atributos
    AHORA CUANDO ELIMINAMOS, SE INTRODUCE LOS DATOS A ELIMINAR DE LA TABLA QUE SE DESEA, CUANDO SE ELIMINE LOS DATOS
    DE MARCA PRESENTACION, PROVEEDOR O DE ZONA, AUTOMATICAMENTE SE ELIMINARÁ EL REGISTRO PRODUCTO.
    LA TABLA PRODUCTO, SU ID ES AUTO INCREMENTAL; PERO EN LAS DEMAS TABLAS PUSE EL ID , VARCHAR EN SQL Y STRING EN JAVA; 
    PARA QUE DE ESA MANERA EN LA RELACION, SE PUEDA BUSCAR , GUARDAR CORRECTAMENTE.
    */
    public static void main(String[] args) {
      
        Alta_Proveedor AP = new Alta_Proveedor();
        AP.setVisible(true);
              
    }
    
}
