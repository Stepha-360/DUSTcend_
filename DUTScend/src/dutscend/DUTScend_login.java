package dutscend;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author admin
 */
public class DUTScend_login extends javax.swing.JFrame {

    
    private JLabel btn_saldo = null;

    public DUTScend_login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Password2 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        iniciar_sesion = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        USUARIO2 = new javax.swing.JTextField();
        mostrar = new javax.swing.JCheckBox();

        jMenu1.setText("jMenu1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(62, 178, 100));

        jLabel1.setFont(new java.awt.Font("Javanese Text", 3, 24)); // NOI18N
        jLabel1.setText("INICIAR SESION");

        jLabel2.setFont(new java.awt.Font("Javanese Text", 2, 14)); // NOI18N
        jLabel2.setText("CORREO ELECTRONICO");

        jLabel3.setFont(new java.awt.Font("Javanese Text", 2, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");

        Password2.setFont(new java.awt.Font("Javanese Text", 2, 14)); // NOI18N
        Password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password2ActionPerformed(evt);
            }
        });

        iniciar_sesion.setBackground(new java.awt.Color(17, 26, 29));
        iniciar_sesion.setFont(new java.awt.Font("Javanese Text", 2, 14)); // NOI18N
        iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        iniciar_sesion.setText("INICIAR SESION");
        iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_sesionActionPerformed(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(17, 26, 29));
        Registro.setFont(new java.awt.Font("Javanese Text", 2, 14)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("REGITRARSE");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(17, 26, 29));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\logo .png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        USUARIO2.setFont(new java.awt.Font("Javanese Text", 2, 14)); // NOI18N
        USUARIO2.setDisabledTextColor(new java.awt.Color(63, 178, 100));
        USUARIO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIO2ActionPerformed(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Javanese Text", 2, 10)); // NOI18N
        mostrar.setText("MOSTRAR CONTRASEÑA");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Registro)
                        .addGap(31, 31, 31)
                        .addComponent(iniciar_sesion)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Password2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mostrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(USUARIO2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(USUARIO2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrar)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesionActionPerformed
String usuario = USUARIO2.getText().trim();
String contraseña = new String(Password2.getPassword()).trim();
boolean accesoConcedido = false;
moneda miMoneda = null;
String nombre = "";
String apellido = "";
double saldoRegistrado = 1000; // Saldo inicial por defecto

try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
    String linea;
    while ((linea = br.readLine()) != null) {
        String[] partes = linea.split(",");
        if (partes.length == 5) { // Verificar que hay suficientes datos
            String nombreGuardado = partes[0].trim();
            String apellidoGuardado = partes[1].trim();
            String usuarioGuardado = partes[2].trim();
            String contraseñaGuardada = partes[3].trim();

            if (usuario.equals(usuarioGuardado) && contraseña.equals(contraseñaGuardada)) {
                accesoConcedido = true;
                nombre = nombreGuardado;
                apellido = apellidoGuardado;
                saldoRegistrado = Double.parseDouble(partes[4]);
                miMoneda = new moneda(saldoRegistrado);

                // Guarda la sesión incluyendo nombre, apellido, usuario y saldo
                DUTScend_leerUsuarios.guardarUsuarioSesion(nombre, apellido, usuario, saldoRegistrado);
                break;
            }
        }
    }
} catch (IOException e) {
    JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
    return;
}

if (accesoConcedido) {
    JOptionPane.showMessageDialog(null, "¡Bienvenido, " + nombre + " " + apellido + "!");

    if (btn_saldo != null) {
        btn_saldo.setText("Saldo: " + miMoneda.getValor());
    }

    miMoneda.addPropertyChangeListener(evento -> {
        SwingUtilities.invokeLater(() -> btn_saldo.setText("Saldo: " + evento.getNewValue()));
    });

    DUTScend_Grafic abrir = new DUTScend_Grafic();
    abrir.setVisible(true);
} else {
    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Verifica tus datos.");
}

    }//GEN-LAST:event_iniciar_sesionActionPerformed

    private void USUARIO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIO2ActionPerformed
        String usuario = USUARIO2.getText();

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un usuario.");
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.txt", true))) {
            writer.println(USUARIO2);
            JOptionPane.showMessageDialog(this, "Usuario guardado correctamente.");
            USUARIO2.setText(""); // Limpia el campo después de guardar
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
    }//GEN-LAST:event_USUARIO2ActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        if (mostrar.isSelected()) {
            Password2.setEchoChar((char) 0);
        } else {
            Password2.setEchoChar('*');
        }

    }//GEN-LAST:event_mostrarActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        DUTScend_registro abrir = new DUTScend_registro();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistroActionPerformed

    private void Password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password2ActionPerformed
        String contraseña = Password2.getText();

        if (contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa la contraseña.");
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.txt", true))) {
            writer.println(Password2);
            JOptionPane.showMessageDialog(this, "contraseña guardado correctamente.");
            Password2.setText(""); // Limpia el campo después de guardar
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
    }//GEN-LAST:event_Password2ActionPerformed

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
            java.util.logging.Logger.getLogger(DUTScend_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DUTScend_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DUTScend_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DUTScend_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DUTScend_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password2;
    private javax.swing.JButton Registro;
    private javax.swing.JTextField USUARIO2;
    private javax.swing.JButton iniciar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox mostrar;
    // End of variables declaration//GEN-END:variables
}
