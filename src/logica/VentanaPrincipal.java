package logica;

import java.awt.BorderLayout;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
	
	private PanelBotones pBotones;
	
	private Lienzo pLienzo;
	
	public VentanaPrincipal() {
		setLayout(new BorderLayout());
		
		pLienzo = new Lienzo();
		this.add(pLienzo, BorderLayout.CENTER);
		
		pBotones = new PanelBotones(this);
		this.add(pBotones, BorderLayout.WEST);
		
		setTitle( "Parcial de Santiago Seade" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize( 900, 600 );
        setLocationRelativeTo( null );
        setVisible( true );
	}
	
	public void pintarFigura(int r,  int g, int b, int f) {
		pLienzo.pintarFigura(r, g, b, f);
	}
	
	public static void main( String[] args ) {
		new VentanaPrincipal();
	}
	
}
