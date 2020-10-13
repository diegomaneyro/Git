package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
		
	}

}
 class MarcoCentrado extends JFrame{
	 public MarcoCentrado(){
		 Toolkit mipantalla=Toolkit.getDefaultToolkit();
		 
		 Dimension tamañopantalla=mipantalla.getScreenSize();
		 
		 int alturapantalla=tamañopantalla.height;
		 
		 int anchopantalla=tamañopantalla.width;
		 
		 setSize(anchopantalla/2, alturapantalla/2);
		 
		 setLocation(anchopantalla/4, alturapantalla/4);
		 
		 setTitle("Marco centrado");
		 
		 Image miicono=mipantalla.getImage("src/graficos/icono.gif");
		 
		 setIconImage(miicono); 
	 }
 }