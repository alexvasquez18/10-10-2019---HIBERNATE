
package Controlador;

import Modelo.persistencia.Zona;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ControladorZona {
  public void altaZona (Zona zona){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(zona);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Zona Insertado Correctamenete");
    
    }   
  
      public Zona buscaZona(String zona){
  Zona zon;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    zon=(Zona)session.get(Zona.class,zona);
    tx.commit();
    session.close();
    
    return zon;
    }
      public void deleteZona (Zona zona){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(zona);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Zona Eliminado Correctamenete");
    
    }  

}
