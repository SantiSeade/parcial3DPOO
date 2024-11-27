package logica;
import javax.swing.*;
import java.awt.*;

public class Lienzo extends JPanel {

	int r;
	int g;
	int b;
	int figura;
	
	public Lienzo() {
		this.r = 0;
		this.g = 0;
		this.b = 0;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void setFigura(int f) {
		this.figura = f;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Color nuevoColor = new Color(this.r,this.g,this.b);
		Graphics2D g2d = ( Graphics2D )g;
		g2d.setColor(nuevoColor);
		
		if(this.figura == 0) {
			g2d.fillOval(150, 150, 300, 300 );
		} else if (this.figura == 1){
			g2d.fillRect(150, 150, 300, 300);
		}
	}
	
	public void pintarFigura(int r, int g, int b, int figura) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.figura = figura;
		System.out.println(r);
		System.out.println(g);
		System.out.println(b);
		repaint();
	}
	
}
