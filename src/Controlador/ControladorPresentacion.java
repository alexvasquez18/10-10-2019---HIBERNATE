
package Controlador;


import Modelo.persistencia.Presentacion;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ControladorPresentacion {
      public void altaPresentacion (Presentacion pre){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(pre);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Presentacion Insertado Correctamenete");
    
    }
       public Presentacion buscaPresentacion(String presentacion){
  Presentacion pre;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    pre=(Presentacion)session.get(Presentacion.class,presentacion);
    tx.commit();
    session.close();
    
    return pre;
    }
       
             public void deletePresentacion (Presentacion pre){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(pre);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Presentacion Eliminado Correctamenete");
    
    }
}
