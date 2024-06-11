/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adanel
 */
public class ConsultadeCursosAsignadosPro extends javax.swing.JFrame {

    /**
     * Creates new form ConsultadeCursosAsignadosPro
     */
    public ConsultadeCursosAsignadosPro() {
        initComponents();
           this.setLocationRelativeTo(null);
       
        Curso cursoSeleccionado = null;
        Profesor ProfesorSeleccionado = Loginb.ProfesorLogeado;
       
         for(Curso b : Loginb.cursos){
             if(b.profesor.equals(ProfesorSeleccionado.nombre)){
                 cursoSeleccionado = b;
             }
         } 
        if(ProfesorSeleccionado.nombre.equals(cursoSeleccionado.profesor)){
        DefaultTableModel data = new DefaultTableModel(new String[]{"nombre","ID","fechaInicio" ,"fechaFin" ,"horaInicio","horaFin","Seccion","Profesor"},Loginb.ProfesorLogeado.cursos.size());
        jTable1.setModel(data);
      
        
        int row = 0;
        
        for(Curso b : Loginb.ProfesorLogeado.cursos){
        jTable1.setValueAt(b.nombre, row, 0);
        jTable1.setValueAt(b.ID, row, 1);
        jTable1.setValueAt(b.fechaFin, row, 2);
        jTable1.setValueAt(b.fechaInicio, row, 3);
        jTable1.setValueAt(b.horaInicio, row, 4);
        jTable1.setValueAt(b.horaFin, row, 5);
        jTable1.setValueAt(b.seccion, row, 6);
        jTable1.setValueAt(b.profesor, row, 7);
       
        
       
       
        
        row ++;
    }                                        
          }
         
       
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
