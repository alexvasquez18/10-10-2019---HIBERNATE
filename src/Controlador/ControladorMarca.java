package Controlador;
import Modelo.persistencia.Marca;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ControladorMarca {
   public void altaMarca (Marca mar){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(mar);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Marca Insertado Correctamenete");
    
    }    

   
    public Marca buscaMarca(String marca){
  Marca mar;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    mar=(Marca)session.get(Marca.class,marca);
    tx.commit();
    session.close();
    
    return mar;
    }
     public void deleteMarca (Marca mar){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(mar);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Marca Eliminado Correctamenete");
    
    }    

}
