/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;


/**
 *
 * @author Laboratorio
 */
public class Menu extends javax.swing.JFrame 
{   
    private boolean estado;
    
    private ImageIcon imagen;
    private Icon icono;
    public Menu() 
    {   
        initComponents();
        eventosmenu();
        this.pintarImagen(jimagen, "src/Imagenes/fondo.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jimagen = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jAcceso = new javax.swing.JMenu();
        jAccesoUsuario = new javax.swing.JMenuItem();
        jExit = new javax.swing.JMenuItem();
        jMaestros = new javax.swing.JMenu();
        jPais = new javax.swing.JMenuItem();
        jCiudades = new javax.swing.JMenuItem();
        jIdioma = new javax.swing.JMenuItem();
        jAyuda = new javax.swing.JMenu();

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jAcceso.setText("Acceso");

        jAccesoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jAccesoUsuario.setText("Acceso Usuario");
        jAccesoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccesoUsuarioActionPerformed(evt);
            }
        });
        jAcceso.add(jAccesoUsuario);

        jExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jExit.setText("Salir");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jAcceso.add(jExit);

        jMenuBar2.add(jAcceso);

        jMaestros.setText("Maestros");

        jPais.setText("Pais");
        jPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPaisActionPerformed(evt);
            }
        });
        jMaestros.add(jPais);

        jCiudades.setText("Ciudades");
        jMaestros.add(jCiudades);

        jIdioma.setText("Idioma");
        jMaestros.add(jIdioma);

        jMenuBar2.add(jMaestros);

        jAyuda.setText("Ayuda");
        jAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAyudaActionPerformed(evt);
            }
        });
        jMenuBar2.add(jAyuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAccesoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccesoUsuarioActionPerformed

    }//GEN-LAST:event_jAccesoUsuarioActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_jExitActionPerformed

    public void cerrar()
    {
        int opcion=0;
        opcion = JOptionPane.showConfirmDialog(this,"¿Seguro que desea cerrar el programa?","Aviso",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        switch(opcion)
        {
            case JOptionPane.YES_OPTION:
                System.exit(0);
                break;
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void jAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAyudaActionPerformed
         
    }//GEN-LAST:event_jAyudaActionPerformed

    private void jPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPaisActionPerformed

    private void eventosmenu()
    {
       
         // opcion del menu pais    
        ActionListener oyentepais = new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {    
                VistaPais vistaPais = new VistaPais();
                vistaPais.setVisible(true);    
            }
        };
        jPais.addActionListener(oyentepais);
        
        
        
        // opcion del menu ciudad
        ActionListener oyenteciudad = new ActionListener()
        {  
            public void actionPerformed(ActionEvent e) 
            {
                VistaCiudad vistaCiudad = new VistaCiudad();
                vistaCiudad.setVisible(true);
            }   
        };
        jCiudades.addActionListener(oyenteciudad);
        
        // opcion del menu idioma
        ActionListener oyenteidiomapais = new ActionListener()
        {  
            public void actionPerformed(ActionEvent e) 
            {
                VistaIdiomaPais vistaIdiomaPais = new VistaIdiomaPais();
                vistaIdiomaPais.setVisible(true);
            }       
        };     
         jIdioma.addActionListener(oyenteidiomapais);
  
       
    }
    
    public void setEstado(boolean estado2)
    {
        this.estado = estado2;
    }
    
    public boolean getEstado()
    {
        return estado;
    }
    
    private void pintarImagen(JLabel lbl, String ruta)
    {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }
      
   
      
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAcceso;
    private javax.swing.JMenuItem jAccesoUsuario;
    private javax.swing.JMenu jAyuda;
    private javax.swing.JMenuItem jCiudades;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JMenuItem jIdioma;
    private javax.swing.JMenu jMaestros;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jPais;
    private javax.swing.JLabel jimagen;
    // End of variables declaration//GEN-END:variables
}
