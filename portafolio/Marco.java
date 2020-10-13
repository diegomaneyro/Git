package portafolio;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco {

	public static void main(String[] args) {
		
		MarcoBase marco=new MarcoBase();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}

}
class MarcoBase extends JFrame{
	
	public MarcoBase(){
						
		setVisible(true);
		
		setSize(300, 300);
		
		setLocation(300, 300);
		
		setTitle("Ventana");
		
		LaminaBase lamina3=new LaminaBase();
		
		add(lamina3);

	}
}
class LaminaBase extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.drawString("texto", 50, 50);
		
		Graphics2D g2=(Graphics2D) g;//refundicion
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 150, 150);
		
		g2.draw(rectangulo);
		
		
	}
}
	
