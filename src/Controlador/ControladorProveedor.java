
package Controlador;

import Modelo.persistencia.Proveedor;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ControladorProveedor {
    public void altaProveedor(Proveedor pro){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(pro);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Proveedor Insertado Correctamenete");
    
    }      
    
      public Proveedor buscaProveedor(String proveedor){
  Proveedor pro;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    pro=(Proveedor)session.get(Proveedor.class,proveedor);
    tx.commit();
    session.close();
    
    return pro;
    }
        public void deleteProveedor(Proveedor pro){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(pro);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Proveedor Eliminado Correctamenete");
    
    }      
}
