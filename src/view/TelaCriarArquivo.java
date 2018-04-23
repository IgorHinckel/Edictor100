package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author igorh
 */
public class TelaCriarArquivo extends javax.swing.JFrame {
    
    private Dimension tamanhoTela;
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private JTextArea jTextAreaEdicao;
    private JScrollPane scroll;
    private String textoEscrito;
    
    
    public TelaCriarArquivo() {
        initComponents();
        criarAreaEdicao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSalvar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edictor1000 - Criar Arquivo");

        jMenuArquivo.setText("Arquivo");

        jMenuItemSalvar.setText("Salvar");
        jMenuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalvarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSalvar);

        jMenuBar1.add(jMenuArquivo);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalvarActionPerformed
        salvarArquivoCriado();
    }//GEN-LAST:event_jMenuItemSalvarActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaCriarArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarArquivo().setVisible(true);
            }
        });
    }
    
   private void criarAreaEdicao() {

        tamanhoTela = tk.getScreenSize();

        jTextAreaEdicao = new JTextArea();
        jTextAreaEdicao.setLineWrap(true);

        scroll = new JScrollPane(jTextAreaEdicao);
        scroll.setBounds(1, 1, tamanhoTela.width, tamanhoTela.height);

        scroll.setBorder(null);
        getContentPane().add(scroll);
    }
   
   
   /*Salvar (gravar )dados do aqruivo */
   private void salvarArquivoCriado() {

        File diretorio = new File("C:\\Users\\igor.souza\\Desktop\\Arquivo");
        boolean status = diretorio.mkdir();
        
       
        String nomeArquivo = JOptionPane.showInputDialog("Salvar como");
        File arquivo = new File(diretorio,nomeArquivo + ".txt");
                   
        try {
            boolean statusArq = arquivo.createNewFile();
            FileReader fw = new FileReader(arquivo);
            BufferedReader bw = new BufferedReader(fw);
            String escritas = "";
            
            JOptionPane.showMessageDialog(null, "Arquivo Salvo com sucesso!");
            

        } catch (IOException e) {
            e.printStackTrace();
        }
        
       

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSalvar;
    // End of variables declaration//GEN-END:variables
}
