package graficos;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		// 
		miMarco10 marco1=new miMarco10();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setTitle("Diego");//nombre de la ventana
	}

}
class miMarco10 extends JFrame{
	
	public miMarco10(){
		
		setBounds(450, 300, 400, 450);//setbonus referecncia valor de x ene le eje valor de y en ele eje y tamaño ancho y alto;
		
		Lamina10 milamina1=new Lamina10();
		
		add(milamina1);
		//setResizable(false);//no permite redimencionar
		
	}
}
class Lamina10 extends JPanel{
	
	public void paintComponnet(Graphics g){
	
	super.paintComponent(g);

	File miimagen=new File("src/graficos/auto.png");
	
	try{
	imagen=ImageIO.read(miimagen);
	}
	catch(IOException e){
		
		System.out.println("la imagen no se encuentra");
		}
	
	g.drawImage(imagen, 5, 5, null);
	
	
	}
	private Image imagen;



}
