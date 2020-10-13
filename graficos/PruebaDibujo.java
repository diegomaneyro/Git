package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marcodibujo mimarco=new Marcodibujo();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marcodibujo extends JFrame{
	public Marcodibujo(){
		setTitle("Prueba de dibujo");
		setLocation(400, 400);
		setSize(400, 400);
		LaminaFigura milamina2=new LaminaFigura();
		add(milamina2);
	}
}
class LaminaFigura extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double CentroX=rectangulo.getCenterX();
		
		double CentroY=rectangulo.getCenterY();
		
		double radio=150;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroX, CentroY, CentroX+radio, CentroY+radio);
		
		g2.draw(circulo);
		

	
	
	
	}
	
	
}

