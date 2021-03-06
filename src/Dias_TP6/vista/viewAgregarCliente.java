/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dias_TP6.vista;

import Diaz_TP6.entidad.Cliente;
import Diaz_TP6.entidad.Directorio;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author long_
 */
public class viewAgregarCliente extends javax.swing.JInternalFrame {
    Directorio directorio;
    /**
     * Creates new form viewAgCl
     * @param directorio
     */
    public viewAgregarCliente(Directorio directorio) {
        initComponents();
        this.directorio = directorio;
        this.requestFocus();
        jtfNombre.requestFocus();
    }

    public void mensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto);
    }
    
    public void agregarCliente(){
            String nombre = jtfNombre.getText();
            String apellido = jtfApellido.getText();
            String DNI = jtfDNI.getText();
            String ciudad = jtfCiudad.getText();
            String direccion = jtfDireccion.getText();
            String telefono = jtfTelefono.getText();
            Cliente cliente = new Cliente(nombre, apellido, DNI, direccion, ciudad);
        if(directorio.buscarCliente(telefono)!=null){
            mensaje("Este cliente ya se encuentra agregado.");
        } else {
            directorio.agregarCliente(telefono, cliente);
            mensaje("Cliente agregado existosamente.");
            jtfNombre.setText("");
            jtfApellido.setText("");
            jtfDNI.setText("");
            jtfCiudad.setText("");
            jtfDireccion.setText("");
            jtfTelefono.setText("");
            jtfNombre.requestFocus();
        }
    }
    
    public void limpiar(){
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDNI.setText("");
        jtfCiudad.setText("");
        jtfDireccion.setText("");
        jtfTelefono.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCiudad = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jlTelefono = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jlAgregarCliente = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();

        setTitle("Agregar cliente");
        setMaximumSize(getMaximumSize());
        setMinimumSize(new java.awt.Dimension(450, 360));
        setNextFocusableComponent(jtfNombre);
        setVisible(true);

        jlCiudad.setText("Ciudad:");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jbLimpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimpiarKeyPressed(evt);
            }
        });

        jlTelefono.setText("Telefono:");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jbSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSalirKeyPressed(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyPressed(evt);
            }
        });

        jtfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDNIFocusLost(evt);
            }
        });
        jtfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDNIKeyTyped(evt);
            }
        });

        jtfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDireccionActionPerformed(evt);
            }
        });
        jtfDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfDireccionKeyPressed(evt);
            }
        });

        jtfCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCiudadKeyPressed(evt);
            }
        });

        jlAgregarCliente.setText("Agregar cliente");

        jlNombre.setText("Nombre:");

        jlApellido.setText("Apellido:");

        jlDNI.setText("DNI:");

        jtfTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfTelefonoFocusLost(evt);
            }
        });
        jtfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefonoKeyTyped(evt);
            }
        });

        jlDireccion.setText("Direcci??n:");

        jbAgregar.setText("Agregar");
        jbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAgregarMouseClicked(evt);
            }
        });
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jbAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAgregarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlTelefono)
                        .addContainerGap(390, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDireccion)
                            .addComponent(jlCiudad)
                            .addComponent(jlApellido)
                            .addComponent(jlDNI)
                            .addComponent(jlNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCiudad)
                            .addComponent(jtfDireccion)
                            .addComponent(jtfDNI)
                            .addComponent(jtfApellido)
                            .addComponent(jtfNombre)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimpiar)
                        .addGap(110, 110, 110)
                        .addComponent(jbSalir)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlAgregarCliente)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNI)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCiudad)
                    .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setBounds(100, 50, 450, 385);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed

    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDireccionActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
    }//GEN-LAST:event_jbAgregarActionPerformed
   
    private void jtfDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDNIFocusLost
        
    }//GEN-LAST:event_jtfDNIFocusLost

    private void jbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseClicked
        
    }//GEN-LAST:event_jbAgregarMouseClicked

    private void jtfTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfTelefonoFocusLost
        
    }//GEN-LAST:event_jtfTelefonoFocusLost

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
        }
    }//GEN-LAST:event_jtfNombreKeyPressed

    private void jtfApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
        }
    }//GEN-LAST:event_jtfApellidoKeyPressed

    private void jtfDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDNIKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
        }
    }//GEN-LAST:event_jtfDNIKeyPressed

    private void jtfDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDireccionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
        }
    }//GEN-LAST:event_jtfDireccionKeyPressed

    private void jtfCiudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCiudadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
        }
    }//GEN-LAST:event_jtfCiudadKeyPressed

    private void jtfTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
        }
    }//GEN-LAST:event_jtfTelefonoKeyPressed

    private void jbAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAgregarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jtfNombre.getText().trim().length() == 0 || jtfApellido.getText().trim().length() == 0 || jtfDNI.getText().trim().length() == 0 || jtfDireccion.getText().trim().length() == 0 || jtfCiudad.getText().trim().length() == 0 || jtfTelefono.getText().trim().length() == 0) {
                mensaje("Faltan rellenar campos.");
            } else {
                agregarCliente();
            }
        }
    }//GEN-LAST:event_jbAgregarKeyPressed

    private void jtfDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDNIKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfDNIKeyTyped

    private void jtfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfTelefonoKeyTyped

    private void jbLimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimpiarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpiar();
        }
    }//GEN-LAST:event_jbLimpiarKeyPressed

    private void jbSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSalirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispose();
        }
    }//GEN-LAST:event_jbSalirKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAgregarCliente;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
