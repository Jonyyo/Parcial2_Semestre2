/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Form;

import Com.BaseDatos.ClaseVendedorJDBC;
import Com.Dominio.MdVendedores;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Edwar Alejandro
 */
public class principal extends javax.swing.JFrame {
    ClaseVendedorJDBC JDBC=new ClaseVendedorJDBC();
    /**
     * Creates new form Comisiones
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbtitulo3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbEnero = new javax.swing.JLabel();
        lbFebrero = new javax.swing.JLabel();
        lbMarzo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bttEliminarRegistro = new javax.swing.JButton();
        bttSelecttodo = new javax.swing.JButton();
        bttVentasMayores = new javax.swing.JButton();
        bttVentasMenores = new javax.swing.JButton();
        bttVentaTotalMayor = new javax.swing.JButton();
        bttnuevovendedor = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        lbtitulo3.setBackground(new java.awt.Color(0, 0, 255));
        lbtitulo3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        lbtitulo3.setForeground(new java.awt.Color(0, 0, 0));
        lbtitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtitulo3.setText("Elija una opcion");
        lbtitulo3.setToolTipText("");
        lbtitulo3.setAutoscrolls(true);
        lbtitulo3.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(24);
        jScrollPane2.setViewportView(jTable1);

        lbEnero.setBackground(new java.awt.Color(153, 153, 153));
        lbEnero.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lbEnero.setForeground(new java.awt.Color(0, 0, 0));

        lbFebrero.setBackground(new java.awt.Color(153, 153, 153));
        lbFebrero.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lbFebrero.setForeground(new java.awt.Color(0, 0, 0));

        lbMarzo.setBackground(new java.awt.Color(153, 153, 153));
        lbMarzo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lbMarzo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("SUMAS:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(lbEnero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lbMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFebrero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbEnero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbMarzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Para eliminar a uno de los Vendedores selecciona en la Tabla el que Desees Eliminar y Despues Presiona Eliminar");

        bttEliminarRegistro.setBackground(new java.awt.Color(255, 255, 255));
        bttEliminarRegistro.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bttEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Imagenes/Eliminar.png"))); // NOI18N
        bttEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttEliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(bttEliminarRegistro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bttSelecttodo.setBackground(new java.awt.Color(0, 0, 255));
        bttSelecttodo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bttSelecttodo.setForeground(new java.awt.Color(0, 0, 0));
        bttSelecttodo.setText("MOSTRAR TODOS");
        bttSelecttodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSelecttodoActionPerformed(evt);
            }
        });

        bttVentasMayores.setBackground(new java.awt.Color(0, 0, 255));
        bttVentasMayores.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bttVentasMayores.setForeground(new java.awt.Color(0, 0, 0));
        bttVentasMayores.setText("VENTAS MAYORES");
        bttVentasMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVentasMayoresActionPerformed(evt);
            }
        });

        bttVentasMenores.setBackground(new java.awt.Color(51, 0, 255));
        bttVentasMenores.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bttVentasMenores.setForeground(new java.awt.Color(0, 0, 0));
        bttVentasMenores.setText("VENTAS MENORES");
        bttVentasMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVentasMenoresActionPerformed(evt);
            }
        });

        bttVentaTotalMayor.setBackground(new java.awt.Color(0, 0, 255));
        bttVentaTotalMayor.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bttVentaTotalMayor.setForeground(new java.awt.Color(0, 0, 0));
        bttVentaTotalMayor.setText("VENTA MAYOR");
        bttVentaTotalMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVentaTotalMayorActionPerformed(evt);
            }
        });

        bttnuevovendedor.setBackground(new java.awt.Color(0, 0, 255));
        bttnuevovendedor.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bttnuevovendedor.setForeground(new java.awt.Color(0, 0, 0));
        bttnuevovendedor.setText("NUEVO");
        bttnuevovendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnuevovendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bttVentaTotalMayor, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(bttnuevovendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttSelecttodo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bttVentasMayores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                                        .addComponent(bttVentasMenores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(bttSelecttodo)
                        .addGap(18, 18, 18)
                        .addComponent(bttVentasMayores))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnuevovendedor)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(bttVentasMenores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bttVentaTotalMayor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnuevovendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnuevovendedorActionPerformed
      Vendedor insertar=new Vendedor();
      insertar.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_bttnuevovendedorActionPerformed
    String dato[][];
    private void bttSelecttodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSelecttodoActionPerformed
        Double E=0.0,F=0.0,M=0.0;
        String Nombres []={"Codigo","Nombre","Enero","Febero","Marzo","VentasTotales","Promedio"};
        List<MdVendedores> Imprimir=JDBC.SeleccionarTodalaInfo();
         dato =new String[Imprimir.size()][7];
        int acumulador=0;
        for (MdVendedores Xs : Imprimir) {
            E+=Xs.getEnero();
            F+=Xs.getFebrero();
            M+=Xs.getMarzo();
            dato[acumulador][0]=Xs.getCodigo()+"";
            dato[acumulador][1]=Xs.getNombre();
            dato[acumulador][2]="Q"+Xs.getEnero()+"";
            dato[acumulador][3]="Q"+Xs.getFebrero()+"";
            dato[acumulador][4]="Q"+Xs.getMarzo()+"";
            dato[acumulador][5]="Q"+Xs.getVentasTotales()+"";
            dato[acumulador][6]=Xs.getPromedio()+"";
            acumulador++;
        }
        lbEnero.setText("Q"+E+"");
        lbFebrero.setText("Q"+F+"");
        lbMarzo.setText("Q"+M+"");
        jTable1.setModel(new DefaultTableModel(dato,Nombres)); 
    }//GEN-LAST:event_bttSelecttodoActionPerformed

    private void bttVentasMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVentasMayoresActionPerformed
      String Enero="";
      String Febrero="";
      String Marzo="";
      Enero=JDBC.VentasMayoresyMenores("Enero","max");
      Febrero=JDBC.VentasMayoresyMenores("Febrero","max");
      Marzo=JDBC.VentasMayoresyMenores("Marzo","max");
      String Respuesta="\nVentas Mayores Enero\n"+Enero+"\n"
              +"Ventas Mayores Febrero\n"+Febrero+"\n"
              +"Ventas Mayores Marzo\n"+Marzo;
      JOptionPane.showMessageDialog(null,Respuesta,"VENTAS MAYORES POR MES",JOptionPane.INFORMATION_MESSAGE);
     
    }//GEN-LAST:event_bttVentasMayoresActionPerformed

    private void bttVentasMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVentasMenoresActionPerformed
      String Enero="";
      String Febrero="";
      String Marzo="";
      Enero=JDBC.VentasMayoresyMenores("Enero","min");
      Febrero=JDBC.VentasMayoresyMenores("Febrero","min");
      Marzo=JDBC.VentasMayoresyMenores("Marzo","min");
      String Respuesta="\nVentas Menores Enero\n"+Enero+"\n"
              +"Ventas Menores Febrero\n"+Febrero+"\n"
              +"Ventas Menores Marzo\n"+Marzo;
      JOptionPane.showMessageDialog(null,Respuesta,"VENTAS MENORES POR MES",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bttVentasMenoresActionPerformed

    private void bttEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarRegistroActionPerformed
        int codigo=jTable1.getSelectedRow();
        DefaultTableModel modelo=(DefaultTableModel)jTable1.getModel();
        
        if(codigo>=0){
         int respuesta=JOptionPane.showConfirmDialog(this,"Deseas Eliminar el Registro?","CONFIRMACION",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if (respuesta==JOptionPane.YES_OPTION) {
                modelo.removeRow(codigo); 
                int Code=Integer.parseInt(dato[codigo][0]);
                JDBC.EliminarVendedor(Code);
                System.out.println(Code);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Presiona Mostrar Todos y Selecciona","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bttEliminarRegistroActionPerformed

    private void bttVentaTotalMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVentaTotalMayorActionPerformed
        JOptionPane.showMessageDialog(null, JDBC.VentaTotalMayor("total"),"MEJOR VENDEDOR",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bttVentaTotalMayorActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEliminarRegistro;
    private javax.swing.JButton bttSelecttodo;
    private javax.swing.JButton bttVentaTotalMayor;
    private javax.swing.JButton bttVentasMayores;
    private javax.swing.JButton bttVentasMenores;
    private javax.swing.JButton bttnuevovendedor;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbEnero;
    private javax.swing.JLabel lbFebrero;
    private javax.swing.JLabel lbMarzo;
    private javax.swing.JLabel lbtitulo3;
    // End of variables declaration//GEN-END:variables
}
