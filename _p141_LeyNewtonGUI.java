import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

public class _p141_LeyNewtonGUI extends JFrame implements ActionListener, ChangeListener {
    JPanel p1;
    JLabel lbFuerza, lbMasa, lbAceleraccion;
    JTextField txtFuerza, txtMasa, txtAceleracion;
    ButtonGroup grpOpciones;
    JRadioButton rbtFuerza, rbtMasa, rbtAceleracion;
    JButton btCalcular, btSalir;
    public _p141_LeyNewtonGUI(){
        super("ksdsbdsd");
        setLayout(new FlowLayout());
        p1=new JPanel();
        p1.setLayout(new GridLayout(5,2));
        lbFuerza=new JLabel("Fuerza: ");p1.add(lbFuerza);txtFuerza=new JTextField();p1.add(txtFuerza);
        lbMasa=new JLabel("Masa: ");p1.add(lbMasa);txtMasa=new JTextField();p1.add(txtMasa);
        lbAceleraccion=new JLabel("Aceleracion: ");p1.add(lbAceleraccion);txtAceleracion=new JTextField();p1.add(txtAceleracion);
        grpOpciones=new ButtonGroup();
        rbtFuerza=new JRadioButton("Fuerza");rbtMasa=new JRadioButton("Masa");rbtAceleracion=new JRadioButton("Aceleracion");
        grpOpciones.add(rbtFuerza);grpOpciones.add(rbtMasa);grpOpciones.add(rbtAceleracion);
        p1.add(rbtFuerza);p1.add(rbtMasa);p1.add(rbtAceleracion);
        add(p1);
        btCalcular=new JButton("CAlculo");add(btCalcular);
        btSalir=new JButton("Salir");add(btSalir);

        rbtFuerza.addChangeListener(this); rbtMasa.addChangeListener(this); rbtAceleracion.addChangeListener(this);
    } 
    public static void main(String[] args) {
        _p141_LeyNewtonGUI app = new _p141_LeyNewtonGUI();
        
    }
}
