/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * @author igor.souza
 */
public class TelaCriarArquivo {

    private JFrame jFrameTelaCriarArquivo;
    private JMenuBar jMenuBar;
    private JTextArea jTextAreaEdicao;
    private JScrollPane scroll;
    private JMenu jMenuArquivo, jMenuFormatar, jMenuOpcoes, jMenuAjuda, jMenuSobre;
    private JMenu jMenuSubMenuArquivoSalvar;
    private Dimension tamanhoTela;
    private Toolkit tk = Toolkit.getDefaultToolkit();

    public TelaCriarArquivo() {
        criarTelaCriarArquivo();
        criarAreaEdicao();
        criarMenuBar();
        acaoSubMenus();
    }

    private void criarTelaCriarArquivo() {

        jFrameTelaCriarArquivo = new JFrame();
        jFrameTelaCriarArquivo.setSize(600, 400);
        jFrameTelaCriarArquivo.setTitle("Edictor1000");
        jFrameTelaCriarArquivo.setLayout(null);
        jFrameTelaCriarArquivo.setLocationRelativeTo(null);
        jFrameTelaCriarArquivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameTelaCriarArquivo.setVisible(true);
        criarMenuBar();
        jFrameTelaCriarArquivo.add(jMenuBar);
    }

    private void criarAreaEdicao() {

        tamanhoTela = tk.getScreenSize();

        jTextAreaEdicao = new JTextArea();
        jTextAreaEdicao.setLineWrap(true);

        scroll = new JScrollPane(jTextAreaEdicao);
        scroll.setBounds(1, 31, tamanhoTela.width, tamanhoTela.height);

        scroll.setBorder(null);
        jFrameTelaCriarArquivo.getContentPane().add(scroll);
    }

    private void criarMenuBar() {

        tamanhoTela = tk.getScreenSize();

        /*Criando a Barra de Menu */
        jMenuBar = new JMenuBar();
        jMenuBar.setBounds(0, 0, tamanhoTela.width, 30);

        /*Criando as opções do da Barra do Menu */
        jMenuArquivo = new JMenu("Arquivo");
        jMenuBar.add(jMenuArquivo);

        jMenuFormatar = new JMenu("Formatar");
        jMenuBar.add(jMenuFormatar);

        jMenuOpcoes = new JMenu("Opções");
        jMenuBar.add(jMenuOpcoes);

        jMenuAjuda = new JMenu("Ajuda");
        jMenuBar.add(jMenuAjuda);

        jMenuSobre = new JMenu("Sobre");
        jMenuBar.add(jMenuSobre);

        /*Criar SubMenus*/
        jMenuSubMenuArquivoSalvar = new JMenu("Salvar");
        jMenuArquivo.add(jMenuSubMenuArquivoSalvar);

        /*Adicionando A barra de menu ao JFrame*/
        jFrameTelaCriarArquivo.add(jMenuBar);
    }

    private void acaoSubMenus() {
    }

    private void salvarArquivoCriado() {
        
        File diretorio = new File("C:\\Users\\igor.souza\\Desktop\\arquivos");
        boolean status = diretorio.mkdir();
        File arquivo = new File(diretorio, "Arquivos");

        try {
            boolean statusArq = arquivo.createNewFile();
            JOptionPane.showMessageDialog(null, "Arquivo Salvo com sucesso!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        JOptionPane.showMessageDialog(null, "Arquivo Salvo com sucesso!");
    }
}
