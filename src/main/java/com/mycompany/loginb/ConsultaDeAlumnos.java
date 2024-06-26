/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 *
 * @author adanel
 */
public class ConsultaDeAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaDeAlumnos
     */
    public  ConsultaDeAlumnos() {
        initComponents();
        Actualizar();
    }
    
   public void  Actualizar() {
        this.setLocationRelativeTo(null);
        DefaultTableModel data = new DefaultTableModel(new String[]{"carne","nombre","apellido","password",},Loginb.alumnos.size());
        jTable1.setModel(data);
        
        int row = 0;
        
        for(Alumno g : Loginb.alumnos ){
            jTable1.setValueAt(g.carnet, row, 0);
            jTable1.setValueAt(g.nombre, row, 1);
            jTable1.setValueAt(g.apellido, row, 2);
            jTable1.setValueAt(g.password, row, 3);
            

            row ++;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar Alumno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cargar Achivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Generar Arch");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EditarAlumno m = new EditarAlumno(jTable1.getSelectedRow());
        m.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        JFileChooser archivo = new JFileChooser("");
        int seleccionado = archivo.showDialog(this, "Cargar");
        if(seleccionado == JFileChooser.APPROVE_OPTION){
        leerArchivoXMLAlumnos(archivo.getSelectedFile());
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String contenido = "<alumnos>\n";
        
        for(Alumno e : Loginb.alumnos){
            contenido+="\t<alumno>\n";
            contenido+="\t\t<carne>";
            contenido+=e.carnet;
            contenido+="</carne>\n";
            contenido+="\t\t<nombre>";
            contenido+=e.nombre;
            contenido+="</nombre>\n";
            contenido+="\t\t<apellido>";
            contenido+=e.apellido;
            contenido+="</apellido>\n";
            contenido+="\t\t<password>";
            contenido+=e.password;
            contenido+="</password>\n";
            contenido+="\t</alumno>\n";
        }
        contenido+="</alumnos>";
        
        JFileChooser archivo = new JFileChooser("");
        int seleccionado = archivo.showDialog(this,"Guardar");
        if(seleccionado==JFileChooser.APPROVE_OPTION){
            escribirArchivoTexto(archivo.getSelectedFile().toPath().toString(),contenido);
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed
public void escribirArchivoTexto(String rutaConNombre, String contenido){
        try{
            
            FileWriter fw = new FileWriter(rutaConNombre);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(contenido);
            pw.close();
            fw.close();            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   public void leerArchivoXMLAlumnos(File archivo) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(archivo);
            
            doc.getDocumentElement().normalize();
            NodeList nodos = doc.getElementsByTagName("alumno");
            for(int i = 0; i<nodos.getLength();i++){
                Node n = nodos.item(i);
                if(n.getNodeType()==Node.ELEMENT_NODE){
                    Element e = (Element) n;
                    Alumno em = new Alumno();
                    em.carnet= e.getElementsByTagName("carne")
                            .item(0)
                            .getTextContent();
                    em.nombre = e.getElementsByTagName("nombre")
                            .item(0)
                            .getTextContent();
                    em.apellido = e.getElementsByTagName("apellido")
                            .item(0)
                            .getTextContent();
                    em.password = e.getElementsByTagName("password")
                            .item(0)
                            .getTextContent();
                    Loginb.alumnos.add(em);
                }
            }
            Actualizar();
            
            
        
        
        
        }catch(Exception e){
        
        }
        
    }
}
