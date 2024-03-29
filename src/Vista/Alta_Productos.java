/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.persistencia.Producto;
import Modelo.persistencia.Zona;
import Modelo.persistencia.Marca;
import Modelo.persistencia.Presentacion;
import Modelo.persistencia.Proveedor;
import Controlador.*;

/**
 *
 * @author Tottus
 */
public class Alta_Productos extends javax.swing.JFrame {
ControladorProducto cp;
 ControladorMarca cm;
   ControladorProveedor cpr;
   ControladorZona cz;
   ControladorPresentacion cpre;
    /**
     * Creates new form Alta_Productos
     */
    public Alta_Productos() {
        initComponents();
        cp= new ControladorProducto();
          cm = new ControladorMarca();
    cpr = new ControladorProveedor();
    cz = new ControladorZona();
    cpre = new ControladorPresentacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        des_producto = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        iva = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id_marca = new javax.swing.JTextField();
        id_presentacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        id_proveedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        id_zona = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));

        jLabel3.setText("descripcion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 194, -1, -1));

        jLabel4.setText("precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, -1, -1));

        jLabel5.setText("stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setText("iva");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, -1, -1));

        jLabel7.setText("peso");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 332, -1, -1));
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 153, 121, -1));
        getContentPane().add(des_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 191, 121, -1));
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 229, 121, -1));
        getContentPane().add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 267, 121, -1));
        getContentPane().add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 298, 121, -1));
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 329, 121, -1));

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 367, -1, -1));

        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 367, -1, -1));

        jLabel8.setText("id_marca");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, -1, -1));

        jLabel9.setText("id_presentacion");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));
        getContentPane().add(id_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 31, 121, -1));
        getContentPane().add(id_presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 62, 121, -1));

        jLabel10.setText("id_proveedor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, -1));
        getContentPane().add(id_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 93, 121, -1));

        jLabel11.setText("id_zona");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, -1));
        getContentPane().add(id_zona, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 124, 121, -1));

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 367, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6imagen.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Marca mar_res=cm.buscaMarca(id_marca.getText());
Presentacion pre_res=cpre.buscaPresentacion(id_presentacion.getText());
Proveedor pro_res=cpr.buscaProveedor(id_proveedor.getText());
Zona zon_res=cz.buscaZona(id_zona.getText());
Producto prod = new Producto(mar_res,pre_res,pro_res,zon_res,Integer.parseInt(codigo.getText()),des_producto.getText(),
        Double.parseDouble(precio.getText()),Integer.parseInt(stock.getText()),Integer.parseInt(iva.getText()),
        Double.parseDouble(peso.getText()));
cp.altaProducto(prod);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Alta_Proveedor AP = new Alta_Proveedor();
AP.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Marca mar_res=cm.buscaMarca(id_marca.getText());
Presentacion pre_res=cpre.buscaPresentacion(id_presentacion.getText());
Proveedor pro_res=cpr.buscaProveedor(id_proveedor.getText());
Zona zon_res=cz.buscaZona(id_zona.getText());
Producto prod = new Producto(mar_res,pre_res,pro_res,zon_res,Integer.parseInt(codigo.getText()),des_producto.getText(),
        Double.parseDouble(precio.getText()),Integer.parseInt(stock.getText()),Integer.parseInt(iva.getText()),
        Double.parseDouble(peso.getText()));
cp.deleteProducto(prod);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField des_producto;
    private javax.swing.JTextField id_marca;
    private javax.swing.JTextField id_presentacion;
    private javax.swing.JTextField id_proveedor;
    private javax.swing.JTextField id_zona;
    private javax.swing.JTextField iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
