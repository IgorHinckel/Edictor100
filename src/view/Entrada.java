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


/**
 * @author igor.souza
 */
public class Entrada {

    private JFrame jFrameTelaEntrada;
    private JButton jButtonCriarArquivo, jBtuttonAbrirArquivo;
    public JMenuBar jMenuBar;
    public JMenu jMenuArquivo, jMenuFormatar, jMenuOpcoes, jMenuAjuda, jMenuSobre;
    public String caracteres;
    public FileWriter arquivo;

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
                TelaCriarArquivo chamaCriacaoArquivo = new TelaCriarArquivo();
                chamaCriacaoArquivo.setVisible(true);
                jFrameTelaEntrada.dispose();
            }
        });
    }

    private void tentativaCriarArquivo() {

        try {
            arquivo = new FileWriter(new File("Arquivo.txt"));

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);

        }
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
