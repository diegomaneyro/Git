package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaConImagen {

	public static void main(String[] args) {
		
		MarcoConImagen mimarco=new MarcoConImagen();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
class MarcoConImagen extends JFrame{
	
	public MarcoConImagen(){
		
		setVisible(true);
		
		setBounds(800, 120, 400, 400);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
				
	}
}
class LaminaConImagen extends JPanel{
	
	public LaminaConImagen(){
		try {
			imagen=ImageIO.read(new File("src/graficos/bola.gif"));
		} catch (IOException e) {
			// Exception devuelve un print si no funciona
			System.out.println("No encuentra la imagen");
		}
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//File miimagen=new File("src/graficos/auto.png");
		
		
		int anchuraimagen=imagen.getWidth(this);
		
		int alturaimagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0; i<300; i++){
			
			for(int j=0; j<200;j++){
				
				if(i+j>0){// parq eu no copie encima de la primera imgen se saltea cuando i=0 e j=0
				
				g.copyArea(0, 0, anchuraimagen, alturaimagen, anchuraimagen*i, alturaimagen*j);}
				
				}
			}
		
		}
	private Image imagen;

}