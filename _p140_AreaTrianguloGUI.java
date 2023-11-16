import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class _p140_AreaTrianguloGUI extends JFrame implements ActionListener{
    JLabel lbBase, lbAltura, lbResultado;
    JTextField txtBase, txtAltura;
    JButton btCalcular, btSAlir;
    public _p140_AreaTrianguloGUI(){
        super("CAlculo integral de los");
        setLayout(null);
        lbBase = new JLabel("Base: "); lbBase.setBounds(10,10,200,30); add(lbBase);
        lbAltura = new JLabel("Altura: "); lbAltura.setBounds(10,50,200,30); add(lbAltura);
        txtBase = new JTextField(); txtBase.setBounds(80,20,200,30); add(txtBase);
        txtAltura = new JTextField(); txtAltura.setBounds(80,50,200,30); add(txtAltura);
        lbResultado = new JLabel("Resultado: "); lbResultado.setBounds(90,80,200,30); add(lbResultado);
        btCalcular = new JButton("Calcular");btCalcular.setBounds(30,110,100,40);add(btCalcular);
        btSAlir = new JButton("Salir"); btSAlir.setBounds(150,110,100,40);add(btSAlir);
        btSAlir.addActionListener(this);
        btCalcular.addActionListener(this);
    }
    public float getArea(float base, float altura){
        return (base*altura)/2;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btSAlir){
            JOptionPane.showMessageDialog(this, "gracias", "kjasdbcaksdb", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        else if(e.getSource()==btCalcular){
            float base = Float.parseFloat(txtBase.getText());
            float altura = Float.parseFloat(txtAltura.getText());
            float area = getArea(base, altura);
            lbResultado.setText(String.format("%,.2f",area));
        }
    }
    public static void main(String[] args) {
        _p140_AreaTrianguloGUI app = new _p140_AreaTrianguloGUI();
        app.setBounds(10,10,300,200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
