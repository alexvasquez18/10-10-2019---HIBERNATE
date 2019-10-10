
package Controlador;

import Modelo.persistencia.*;
import javax.swing.JOptionPane;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ControladorProducto {
    
    public void altaProducto (Producto prod){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(prod);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"PRODUCTO Insertado Correctamenete");
    
    }
     public void deleteProducto (Producto prod){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(prod);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"PRODUCTO Eliminado Correctamenete");
    
    }
    
  
   
}
