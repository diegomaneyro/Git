package propios;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcobase mimarco=new Marcobase();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marcobase extends JFrame{
	
	public Marcobase(){
		
		setSize(400, 400);
		
		setTitle("Marco base");
		
		setLocation(150, 150);
		
		Laminabase milamina=new Laminabase();
		
		add(milamina);
	}
}
class Laminabase extends JPanel{
	
		
	
		Rectangle2D rectangulo=new Rectangle2D.Double();
		
		
		
		
		
	
}