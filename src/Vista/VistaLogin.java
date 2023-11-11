package Vista;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author teckoo
 */
public class VistaLogin extends javax.swing.JFrame 
{
    Menu menu = new Menu();
    public boolean estado;
    private ImageIcon imagen;
    private Icon icono;
    
    public VistaLogin() 
    {
        initComponents();
        eventosLogin();
        this.pintarImagen(jimagen, "src/Imagenes/fondo.jpg");
        this.pintarImagen(jlogin, "src/Imagenes/login2.png");
    }
    
    private void eventosLogin ()
    {
        ActionListener oyenteAceptarLogin = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                boolean resultado;
                String clave = txtContrasena.getText();
                resultado= validarContrasenia(clave);
                
                if(resultado)
                {
                    menu.setVisible(true);
                    VistaLogin.super.setVisible(false);
                }
                else
                {
                    JOptionPane.showConfirmDialog(null, "La contraseña no cumple con los requisitos minimos","Sistema",JOptionPane.WARNING_MESSAGE);
                }
            }
        };
        jButtonAceptar.addActionListener(oyenteAceptarLogin);


        ActionListener oyenteCancelarLogin = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(null, "Se canceló el inicio de sesión");
                System.exit(0);
            }
        };
        jButtonCancelar.addActionListener(oyenteCancelarLogin);
    }
    
    
    public boolean   validarContrasenia(String contrasena)
    {
        boolean esValida = true;
        if(contrasena.length() < 8)
        {
            esValida = false;
        }
        else
        {
            int caracteresEspeciales = 0;
            for(char caracter:contrasena.toCharArray())
            {
                if(!Character.isLetterOrDigit(caracter))
                {
                    caracteresEspeciales++;
                }
            }
            if(caracteresEspeciales < 2)
            {  
                esValida = false;
            }
        }
        return esValida;
    }
    
    
    public void cerrar()
    {
        int opcion = 0;
        opcion = JOptionPane.showConfirmDialog(this,
                "¿seguro que desea cerrar el programa?", "AVISO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        switch(opcion)
        {
            case JOptionPane.YES_OPTION:
                System.exit(0);
                break;
            case JOptionPane.NO_OPTION:
                break ;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        jimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Iniciar Sesión");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlogin.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        getContentPane().add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, -1));

        jButtonAceptar.setText("Aceptar");
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jButtonCancelar.setText("Cancelar");
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, -1));
        getContentPane().add(jimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        cerrar();
    }//GEN-LAST:event_formWindowClosing

        private void pintarImagen(JLabel lbl, String ruta)
    {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jimagen;
    private javax.swing.JLabel jlogin;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
