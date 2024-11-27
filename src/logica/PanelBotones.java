package logica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelBotones extends JPanel implements ActionListener{

	private static final String CIRCULO = "circulo";
	private static final String CUADRADO = "cuadrado";
	
	private JLabel r;
	private JLabel g;
	private JLabel b;
	
	private JTextField rtxt;
	private JTextField gtxt;
	private JTextField btxt;
	
	private JButton botCuadrado;
	private JButton botCirculo;
	
	private VentanaPrincipal vPrincipal;
	
	public PanelBotones(VentanaPrincipal vPrincipal) {
		this.vPrincipal = vPrincipal;
		
		setLayout(new GridLayout(4,2));
		
		r = new JLabel("R");
		rtxt = new JTextField(10);
		
		g = new JLabel("G");
		gtxt = new JTextField(10);
		
		b = new JLabel("B");
		btxt = new JTextField(10);
		
		botCuadrado = new JButton("Cuadrado");
        botCuadrado.setActionCommand(CUADRADO);
        botCuadrado.addActionListener(this);
        
        botCirculo = new JButton("Circulo");
        botCirculo.setActionCommand(CIRCULO);
        botCirculo.addActionListener(this);
        
        this.add(r);
        this.add(rtxt);
        this.add(g);
        this.add(gtxt);
        this.add(b);
        this.add(btxt);
        this.add(botCuadrado);
        this.add(botCirculo);
        
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int red =  Integer.parseInt(rtxt.getText());
		int green =  Integer.parseInt(gtxt.getText());
		int blue =  Integer.parseInt(btxt.getText());
		
		String figura = e.getActionCommand();
		if(figura.equals(CIRCULO)) {
			this.vPrincipal.pintarFigura(red, green, blue, 0);
		} else if(figura.equals(CUADRADO)) {
			this.vPrincipal.pintarFigura(red, green, blue, 1);
		}
	}
	
}
