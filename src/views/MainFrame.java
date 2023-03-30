package views;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel JMainPanel;

    public MainFrame(){
        //define o conteudo do jframe
        setContentPane(JMainPanel);
        //define a operacao padrao p fechar o programa
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //define o tamanho do frame
        setSize(300, 400);
        //define o form visivel
        setVisible(true);
    }
}
