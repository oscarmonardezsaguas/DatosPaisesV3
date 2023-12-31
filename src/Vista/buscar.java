/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Modelo.Pais;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class buscar extends javax.swing.JFrame 
{
    private ImageIcon imagen;
    private Icon icono;
        public buscar() 
    {
        initComponents();
        this.pintarImagen(jimagen, "src/Imagenes/fondo.jpg");
    }
        
        public void mostrarDatos2(List<Pais> lista)
    {
        String matriz2[][] = new String[lista.size()][4];

        for (int i = 0; i < lista.size();i++)
        {
                matriz2[i][0] = String.valueOf(lista.get(i).getCodePais());
                matriz2[i][1] = lista.get(i).getNombre();
                matriz2[i][2] = lista.get(i).getContinente();
                matriz2[i][3] = String.valueOf(lista.get(i).getPoblacion());          
        }
        jTableBuscar.setModel(new javax.swing.table.DefaultTableModel(matriz2, new String[]{"Código", "Nombre", "Continente", "Población"}));
    }
        
            private void pintarImagen(JLabel lbl, String ruta)
    {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuscar = new javax.swing.JTable();
        jimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableBuscar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 375, 121));
        getContentPane().add(jimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuscar;
    private javax.swing.JLabel jimagen;
    // End of variables declaration//GEN-END:variables

}