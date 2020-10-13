package portafolio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Expendedora {
//version login tiene este comentario
	public static void main(String[] args) {
		// Expendedora con botones
		Ventana miventana=new Ventana();
		
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		miventana.setVisible(true);//con visible desde el main se ve desde el inicio
	}

}
class Ventana extends JFrame{
	
	public Ventana(){
				
		setLocation(400, 250);
		
		setSize(600, 450);
		
		setTitle("Expendedora");
		
		LaminaExpendedora lamina1=new LaminaExpendedora();		
		
		setLayout(new BorderLayout());
		
		add(lamina1, BorderLayout.WEST);
		
		lamina1.setBackground(new Color(205, 237, 238));
		
		LaminaImagen imagen=new LaminaImagen();
		
		add(imagen);
	}
}
class LaminaExpendedora extends JPanel implements ActionListener{
	
	protected void paintComponent(Graphics g){
	
		super.paintComponent(g);
		
		g.drawString("Elija producto:", 10, 90);
		
		g.drawString("Especifique cantidad:", 10, 120);
	}
	
	JButton gaseosa=new JButton("Gaseosa");
	
	JButton caramelos=new JButton("Caramelos");
	
	JButton papas=new JButton("Papas");
	
	
	
	public LaminaExpendedora(){
		
	add(gaseosa);
	
	add(papas);
	
	gaseosa.addActionListener(this);
	
	caramelos.addActionListener(this);
	
	papas.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// que deberia hacer el oyente con este boton
		
			
		}
	}

class LaminaImagen extends JPanel{
	
	public LaminaImagen(){
		
		setVisible(true);
		
		setLayout(new BorderLayout());
		

		 
		 
		 
	}


}
	
	
	
	
