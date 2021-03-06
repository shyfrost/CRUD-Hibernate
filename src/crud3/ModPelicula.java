/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud3;

import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;
import sourcedb.Director;
import sourcedb.Genero;
import sourcedb.Pelicula;

/**
 *
 * @author Shy
 */
public class ModPelicula extends javax.swing.JFrame {

    /**
     * Creates new form ModPelicula
     */
    List<Pelicula> ListaPeliculas;
    List<Genero> ListaGeneros;
    List<Director> ListaDirectores;
    Peliculas Pelis = new Peliculas();

    public ModPelicula() {
        initComponents();
        this.ListarDirectoresGeneros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextTitulo = new javax.swing.JTextField();
        TextTituloOriginal = new javax.swing.JTextField();
        TextDuracion = new javax.swing.JTextField();
        ComboGeneros = new javax.swing.JComboBox<>();
        ComboDirectores = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDescripcion = new javax.swing.JTextArea();
        BotonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BotonRegresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextTitulo.setText("Titulo");
        TextTitulo.setToolTipText("Titulo");

        TextTituloOriginal.setText("Titulo Original");
        TextTituloOriginal.setToolTipText("Titulo Original");

        TextDuracion.setText("Duraci??n (min)");
        TextDuracion.setToolTipText("Duraci??n (min)");

        TextDescripcion.setColumns(20);
        TextDescripcion.setLineWrap(true);
        TextDescripcion.setRows(5);
        TextDescripcion.setText("Descripci??n...");
        TextDescripcion.setToolTipText("Descripci??n de la pelicula");
        TextDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TextDescripcion);

        BotonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(0, 153, 0));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        LabelID.setText("...");

        BotonRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(51, 0, 255));
        BotonRegresar.setText("Cancelar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("CUIDADO: ESTA ACCION NO SE PUEDE REVERTIR!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(LabelID)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextTituloOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboDirectores, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(BotonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(126, 126, 126))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonRegresar)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LabelID))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboDirectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextTituloOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(BotonGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListarDirectoresGeneros() {
        ListaDirectores = Pelis.ObtenerDirector();
        ListaGeneros = Pelis.ObtenerGenero();
        for (int i = 0; i < ListaDirectores.size(); i++) {

            ComboDirectores.addItem(ListaDirectores.get(i));
        }
        for (int i = 0; i < ListaGeneros.size(); i++) {

            ComboGeneros.addItem(ListaGeneros.get(i));
        }
    }

    public void AsignarValores(Pelicula pelicula) {
        String id = String.valueOf(pelicula.getIdpelicula());
        LabelID.setText(id);
        TextTitulo.setText(pelicula.getTitulopelicula());
        TextTituloOriginal.setText(pelicula.getTitulooriginal());
        TextDuracion.setText(pelicula.getDuracion());
        TextDescripcion.setText(pelicula.getDescripcion());
        ComboDirectores.setSelectedIndex(pelicula.getDirector().getIddirector() - 1);
        ComboGeneros.setSelectedIndex(pelicula.getGenero().getIdgenero() - 1);
    }
    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Pelis.ActualizarPelicula(LabelID.getText(), TextTitulo.getText(), TextTituloOriginal.getText(), TextDuracion.getText(), TextDescripcion.getText(), (Director) ComboDirectores.getSelectedItem(), (Genero) ComboGeneros.getSelectedItem());
            JOptionPane.showMessageDialog(this, "Modificado con Exito");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        Principal FramePrincipal = new Principal();
        FramePrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Pelis.EliminarPelicula(LabelID.getText(), TextTitulo.getText(), TextTituloOriginal.getText(), TextDuracion.getText(), TextDescripcion.getText(), (Director) ComboDirectores.getSelectedItem(), (Genero) ComboGeneros.getSelectedItem());
            JOptionPane.showMessageDialog(this, "Eliminado con Exito");
            Principal FramePrincipal = new Principal();
            FramePrincipal.setVisible(true);
            this.dispose();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<Director> ComboDirectores;
    private javax.swing.JComboBox<Genero> ComboGeneros;
    private javax.swing.JLabel LabelID;
    private javax.swing.JTextArea TextDescripcion;
    private javax.swing.JTextField TextDuracion;
    private javax.swing.JTextField TextTitulo;
    private javax.swing.JTextField TextTituloOriginal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
