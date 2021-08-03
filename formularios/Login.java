/*
 * A tela de Login é uma parte visual, é a tela inicial, da nossa apresentação
 * pois nela simulamos a primeira vez que um jogador acessa o jogo. Tendo vista
 * que não fizemos um banco de dados, por não sabermos ainda. 
 */

package br.com.Attack.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */

public class Login extends javax.swing.JFrame {
    
    private void TelaMenuPrincipal(){
        
	MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();		
    }
    
    
    
   private void TelaCadastro(){
        
	Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        dispose();		
    }
   
        private void TelaPacote1(){
        
	Pacote1 pacote1 = new Pacote1();
        pacote1.setVisible(true);
        dispose();		
    }
   
    /**
     * Creates new form Login
     */
    public Login() {
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

        jTextField2 = new javax.swing.JTextField();
        TextEmail = new javax.swing.JLabel();
        CampoEmail = new javax.swing.JTextField();
        TextSenha = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        TextNaoTemConta = new javax.swing.JLabel();
        ButtonCadastrar = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setText("E-Mail:");
        getContentPane().add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(CampoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 240, 30));

        TextSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextSenha.setForeground(new java.awt.Color(255, 255, 255));
        TextSenha.setText("Senha:");
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 240, 30));

        TextNaoTemConta.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TextNaoTemConta.setForeground(new java.awt.Color(255, 255, 255));
        TextNaoTemConta.setText("Não tem uma conta Attack? Crie agora mesmo!");
        getContentPane().add(TextNaoTemConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        ButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnCadastrar.png"))); // NOI18N
        ButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonCadastrarMouseReleased(evt);
            }
        });
        getContentPane().add(ButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnEntrar.png"))); // NOI18N
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEntrarMouseReleased(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/TelaLogin.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        String campoemail = (CampoEmail.getText());
        if(campoemail.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor Preencha todos os Campos","Importante!", JOptionPane.WARNING_MESSAGE);
            
    }
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        String camposenha = (CampoSenha.getText());
        if(camposenha.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor Preencha os Campos", null,WIDTH);
        }
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void ButtonCadastrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCadastrarMouseReleased
        TelaCadastro();
    }//GEN-LAST:event_ButtonCadastrarMouseReleased

    private void btnEntrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseReleased
        String campoemail = (CampoEmail.getText());
        String camposenha = (CampoSenha.getText());
                            
        if(camposenha.equals("") || campoemail.equals("") ){
            JOptionPane.showMessageDialog(null, "Por favor Preencha todos os Campos","Importante!", JOptionPane.WARNING_MESSAGE);
            }else{
            TelaMenuPrincipal();
            }
    }//GEN-LAST:event_btnEntrarMouseReleased
    

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonCadastrar;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel TextEmail;
    private javax.swing.JLabel TextNaoTemConta;
    private javax.swing.JLabel TextSenha;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}