package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPintado mimarco=new MarcoPintado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}
class MarcoPintado extends JFrame{
	
	public MarcoPintado(){
				
		setSize(400, 400);
		
		setTitle("Marco Pintado");
		
		setLocation(200, 200);
		
		LaminaPintada milamina=new LaminaPintada();
		
		add(milamina);
		
		milamina.setBackground(Color.green);
		
		//System color windows es el color queasigma el sistema operativo donde se ejecute el programa 
		
		milamina.setForeground(Color.blue);
	}
}
class LaminaPintada extends JPanel{
		
		protected void paintComponent(Graphics g){
			
			super.paintComponent(g);
			
			//llama almetodode la clase padre
			
			Graphics2D g2=(Graphics2D) g;
			
			//refundicion al metodo hjo
			
			
			Rectangle2D rectangulo=new Rectangle2D.Double(90, 90, 200, 200);
			
			g2.setPaint(Color.RED);
			
			//dibuja un rectangulo
			
			g2.fill(rectangulo);
			
			Ellipse2D elipse=new Ellipse2D.Double();
			
			//dibuja ellipse
			
			elipse.setFrame(rectangulo);
			
			g2.setPaint(new Color(55, 55, 55).brighter().brighter().brighter());
			
			//instancia la clase Color  usando RGB dentro del parametro del metodo. brighter aclara
			
			//dentro del rectangulo
			
			g2.fill(elipse);
			
			Font mifuente=new Font("Arial", Font.BOLD, 26);
			
			g2.setFont(mifuente);
			
			g2.drawString("Diego", 100, 100);
			
			g2.setFont(new Font("Arial", Font.ITALIC, 14));
			
			g2.setColor(new Color(128, 90, 50));
			
			g2.drawString("Curso de java", 100 , 200);
			
			
			
			
			
			
			
		}
	
}