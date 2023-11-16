import java.awt.Font;

import javax.swing.*;

public class _p139_HolaMundoGUI extends JFrame {
    private JLabel lbSaludo;
    public _p139_HolaMundoGUI(){
        super("hola shinji");
        setLayout(null);
        lbSaludo = new JLabel("Felizidades Shinji lo hiciste bien");
        lbSaludo.setFont(new Font("Arial",Font.BOLD,20));
        lbSaludo.setBounds(10,20,340,300);
        add(lbSaludo);

    }

    public static void main(String[] args) {
        _p139_HolaMundoGUI app = new _p139_HolaMundoGUI();
        app.setBounds(10,10,400,300);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}