/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Attack.Perguntas1x1;


import br.com.Attack.formularios.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */
public class PerguntaFilo1 extends javax.swing.JFrame {
    public static int XP1 = 0;
    private Timer timer;
    private int atualSegundo = 60;
    private int diferencaSegundos=0;
    private int atualMinuto = 0;
    private int velocidade = 1000;
    private int aumentoSeg1 = 10;
    private int aumento = 0;
    private int limite = 0;
    
    
    private MenuPrincipal ch = new MenuPrincipal();
    private int Tentativas = ch.chances;
    
    private MenuPrincipal es = new MenuPrincipal();
    private int EscolhaCategoria = es.escolhaCategoriaTotal;
    

   
     
     private void TelaMenuPrincipal(){
        
         MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
    }
     
     private void TelaAtaques(){
        
         Ataques ataques = new Ataques();
            ataques.setVisible(true);
    }
     
     private void TelaMatematica(){
        
         PerguntaMat1 mat = new PerguntaMat1();
            mat.setVisible(true);
    }
     private void TelaFisica(){
        
         PerguntaFisi1 fis = new PerguntaFisi1();
            fis.setVisible(true);
    }
     private void TelaPortugues(){
        
         PerguntaPortugues1 port = new PerguntaPortugues1();
            port.setVisible(true);
    }

    /**
     * Creates new form PerguntaSocio1
     */
    public PerguntaFilo1() {
        initComponents();
        iniciarContagem();
        aumentarSeg();//eliminar Seg e iniciar a contagem.
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Alternativas = new javax.swing.ButtonGroup();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        E = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnPausar = new javax.swing.JLabel();
        btnPularQuestao = new javax.swing.JLabel();
        btnChance = new javax.swing.JLabel();
        btnAtaques = new javax.swing.JLabel();
        btn10seg = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Alternativas.add(A);
        A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 30));

        Alternativas.add(B);
        B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, 30));

        Alternativas.add(C);
        C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 283, -1, 30));

        Alternativas.add(D);
        D.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 323, -1, 30));

        Alternativas.add(E);
        E.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 170, 60));

        btnPausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnParar5Sec.png"))); // NOI18N
        btnPausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPausarMouseReleased(evt);
            }
        });
        getContentPane().add(btnPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btnPularQuestao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnPularQuestao.png"))); // NOI18N
        btnPularQuestao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPularQuestaoMouseReleased(evt);
            }
        });
        getContentPane().add(btnPularQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        btnChance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnChance.png"))); // NOI18N
        btnChance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnChanceMouseReleased(evt);
            }
        });
        getContentPane().add(btnChance, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        btnAtaques.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnAtaque.png"))); // NOI18N
        btnAtaques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAtaquesMouseReleased(evt);
            }
        });
        getContentPane().add(btnAtaques, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        btn10seg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btn10Sec.png"))); // NOI18N
        btn10seg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn10segMouseReleased(evt);
            }
        });
        getContentPane().add(btn10seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/PergFilo-1.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        if(A.isSelected()){
            if(EscolhaCategoria == 6){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
            }
            if(EscolhaCategoria == 7){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaFisica();
                 dispose();
            }
            if(EscolhaCategoria == 8){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaPortugues();
                 dispose();
            }
            if(EscolhaCategoria == 9){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
            }
            if(EscolhaCategoria == 10){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
            }
            
            
            
            
                }
    }//GEN-LAST:event_AActionPerformed
        
    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
         if(B.isSelected()){
             if(EscolhaCategoria == 6){
                  JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                  timer.stop();
                  TelaMatematica();
                  dispose();
             }
             if(EscolhaCategoria == 7){
                  JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                  timer.stop();
                  TelaFisica();
                  dispose();
             }
             if(EscolhaCategoria == 8){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaPortugues();
                 dispose();
            }
            if(EscolhaCategoria == 9){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
            } 
            if(EscolhaCategoria == 10){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
            } 
             
             
             
                }
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
         if(C.isSelected()){
             if(EscolhaCategoria == 6){
                  JOptionPane.showMessageDialog(null, "Resposta Correta");
                  XP1++;
                  timer.stop();
                  TelaMatematica();
                  dispose();
             } 
             if(EscolhaCategoria == 7){
                  JOptionPane.showMessageDialog(null, "Resposta Correta");
                 XP1++;
                 timer.stop();
                  TelaFisica();
                  dispose();
             }  
             if(EscolhaCategoria == 8){
                 JOptionPane.showMessageDialog(null, "Resposta Correta");
                 XP1++;
                 timer.stop();
                 TelaPortugues();
                 dispose();
            }
             if(EscolhaCategoria == 9){
                 JOptionPane.showMessageDialog(null, "Resposta Correta");
                 XP1++;
                 timer.stop();
                 TelaMatematica();
                 dispose();
            }
             if(EscolhaCategoria == 10){
                 JOptionPane.showMessageDialog(null, "Resposta Correta");
                 XP1++;
                 timer.stop();
                 TelaMatematica();
                 dispose();
            }
            }
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
         if(D.isSelected()){
             if(EscolhaCategoria == 6){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
             }
             if(EscolhaCategoria == 7){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaFisica();
                 dispose();
             }
             if(EscolhaCategoria == 8){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaPortugues();
                 dispose();
            }
             if(EscolhaCategoria == 9){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
            }
             if(EscolhaCategoria == 10){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaMatematica();
                 dispose();
            }
        }
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
         if(E.isSelected()){
             if(EscolhaCategoria == 6){
                  JOptionPane.showMessageDialog(null, "Resposta Incorreta");  
                  timer.stop();
                  TelaMatematica();
                  dispose();
             } 
             if(EscolhaCategoria == 7){
                  JOptionPane.showMessageDialog(null, "Resposta Incorreta");  
                  timer.stop();
                  TelaFisica();
                  dispose();
             }  
             if(EscolhaCategoria == 8){
                 JOptionPane.showMessageDialog(null, "Resposta Incorreta");
                 timer.stop();
                 TelaPortugues();
                 dispose();
            }
             if(EscolhaCategoria == 9){
                  JOptionPane.showMessageDialog(null, "Resposta Incorreta"); 
                  timer.stop();
                  TelaMatematica();
                  dispose();
             } 
             if(EscolhaCategoria == 10){
                  JOptionPane.showMessageDialog(null, "Resposta Incorreta"); 
                  timer.stop();
                  TelaMatematica();
                  dispose();
             } 
             
             
             
             }
    }//GEN-LAST:event_EActionPerformed

    private void btnPausarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPausarMouseReleased
        try {
            pausarTempo();
        } catch (InterruptedException ex) {
            Logger.getLogger(PerguntaSocio1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPausarMouseReleased

    private void btnChanceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChanceMouseReleased
        Tentativas--;
        if(Tentativas==0 && atualSegundo==0){
            pararTempo();
        }
        else if(atualSegundo==0 && Tentativas <0){
                JOptionPane.showMessageDialog(null,"Infelizmente você não "
                        + "tem mais chances, mais sorte na proxima");
                timer.stop();
                TelaMenuPrincipal();
                dispose();
            }
    }//GEN-LAST:event_btnChanceMouseReleased

    private void btnAtaquesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtaquesMouseReleased
        TelaAtaques();
    }//GEN-LAST:event_btnAtaquesMouseReleased

    private void btnPularQuestaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPularQuestaoMouseReleased
        if(EscolhaCategoria == 6){
            timer.stop();
        TelaMatematica();
        dispose();
        }
        if(EscolhaCategoria == 7){
        timer.stop();
        TelaFisica();
        dispose();
        }
        if(EscolhaCategoria == 8){
        timer.stop();
        TelaPortugues();
        dispose();
        }
        if(EscolhaCategoria == 9){
        timer.stop();
        TelaMatematica();
        dispose();
        }
        if(EscolhaCategoria == 10){
        timer.stop();
        TelaMatematica();
        dispose();
        }
        
    }//GEN-LAST:event_btnPularQuestaoMouseReleased

    private void btn10segMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10segMouseReleased
        aumentarSeg();
        btn10seg.setVisible(false);
    }//GEN-LAST:event_btn10segMouseReleased

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
            java.util.logging.Logger.getLogger(PerguntaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerguntaFilo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.ButtonGroup Alternativas;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JRadioButton E;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel btn10seg;
    private javax.swing.JLabel btnAtaques;
    private javax.swing.JLabel btnChance;
    private javax.swing.JLabel btnPausar;
    private javax.swing.JLabel btnPularQuestao;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
private void iniciarContagem() {
        ActionListener acao = new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                atualSegundo--;
                if(atualSegundo==0){
                    timer.stop();
                    switch(JOptionPane.showConfirmDialog(null,"Que Pena, Você "
                        + "perdeu, Mas você pode usar sua chance!, deseja "
                        + "usa-lá?","Tudo Tem uma segunda chance",JOptionPane.YES_NO_OPTION)){
                
                    case 0:
                        JOptionPane.showMessageDialog(null, "Clique no botão "
                        + "'CHANCE', mas lembre-se, você só tem uma");
                        break;
                
                    case 1:
                        TelaMenuPrincipal();
                        break;
                }
                    
                }else if(atualSegundo==50){
                    JOptionPane.showMessageDialog(null,"Você tomou um ataque");
                   atualSegundo =30;
                  
                }
                    
                String seg = atualSegundo <= 9? "0"+atualSegundo:atualSegundo+"";
                
                jLabel1.setText(seg);  
            }  
        };  
        this.timer = new Timer(velocidade, acao);  
        this.timer.start();
    }
    private void pausarTempo() throws InterruptedException {  
             Thread.sleep(5000);       

    } 
    
    private void pararTempo() {
        timer.stop();
        atualMinuto = 0;
        atualSegundo = 60;
        jLabel1.setText("00:60");
        this.timer.start();
        
            
    }
     private void aumentarSeg() {
         if(limite==1){
           aumento= atualSegundo +aumentoSeg1;        
                   atualSegundo=aumento;
              }else{
             
         } 
         limite++;
        String seg = atualSegundo <= 9? "0"+atualSegundo:atualSegundo+"";
        
        jLabel1.setText(seg);
    }
}


