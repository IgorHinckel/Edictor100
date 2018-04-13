package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author igor.souza
 */
public class Entrada {

    private JFrame jFrameTelaEntrada, jFrameTelaCriarArquivo;
    private JButton jButtonCriarArquivo, jBtuttonAbrirArquivo;
    public JMenuBar jMenuBar;
    public JMenu jMenuArquivo, jMenuFormatar, jMenuOpcoes, jMenuAjuda, jMenuSobre;
    public String caracteres;
    public FileWriter arquivo;
    private JTextArea jTextAreaEdicao;
    private JScrollPane scroll;

    public Entrada() {
        criaTelaEntrada();
        criarComponentes();
        acaoJButtonCriarArquivo();
        criarMenuBar();

    }

    private void criaTelaEntrada() {
        jFrameTelaEntrada = new JFrame();
        jFrameTelaEntrada.setSize(600, 400);
        jFrameTelaEntrada.setLayout(null);
        jFrameTelaEntrada.setLocationRelativeTo(null);
        jFrameTelaEntrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameTelaEntrada.setVisible(true);
    }

    private void criarComponentes() {
        jButtonCriarArquivo = new JButton("Criar arquivo");
        jButtonCriarArquivo.setBounds(10, 150, 120, 50);
        jFrameTelaEntrada.add(jButtonCriarArquivo);

        jBtuttonAbrirArquivo = new JButton("Abrir Arquivo");
        jBtuttonAbrirArquivo.setBounds(200, 150, 120, 50);
        jFrameTelaEntrada.add(jBtuttonAbrirArquivo);

    }

    private void acaoJButtonCriarArquivo() {

        jButtonCriarArquivo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                criarArquivo();
            }
        });
    }

    private void criarArquivo() {

        jFrameTelaCriarArquivo = new JFrame();
        jFrameTelaCriarArquivo.setSize(600, 400);
        jFrameTelaCriarArquivo.setLayout(null);
        jFrameTelaCriarArquivo.setLocationRelativeTo(null);
        jFrameTelaCriarArquivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameTelaCriarArquivo.setVisible(true);

        
        criarMenuBar();
        jFrameTelaCriarArquivo.add(jMenuBar);
        
        criarAreaEdicao();
        

    }

    private void tentativaCriarArquivo() {

        try {
            arquivo = new FileWriter(new File("Arquivo.txt"));

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
    
    private void criarAreaEdicao() {
        
        jTextAreaEdicao = new JTextArea();
        scroll = new JScrollPane(jTextAreaEdicao);
        jFrameTelaCriarArquivo.getContentPane().add(scroll);
       
        
        
        jTextAreaEdicao.setBounds(15, 35, 545, 320);
        jTextAreaEdicao.setLineWrap(true);
        
         }
    

    private void criarMenuBar() {

        jMenuBar = new JMenuBar();
        jMenuBar.setBounds(0, 0, 600, 30);

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

        jFrameTelaEntrada.add(jMenuBar);
    }

}
