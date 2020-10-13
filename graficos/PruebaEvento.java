package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEvento {

	public static void main(String[] args) {
		
		MarcoBotones mimarco=new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
	
	setTitle("Botones y Eventos");
	
	setBounds(800, 120, 400, 400);
	
	LaminaBotones milamina=new LaminaBotones();
	
	add(milamina);
	}
	
}
class LaminaBotones extends JPanel{
		
	JButton botonAzul=new JButton("Azul");//instancia de clase Jbutton
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones(){//constructor de la clase 
		
		add(botonAzul);
		
		add(botonAmarillo);      
		
		add(botonRojo);
		
		ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
				
		ColorFondo Azul=new ColorFondo(Color.BLUE);
		
		ColorFondo Rojo=new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(Azul);//el objeto oyente implementa la interface ActionListener
		
		botonRojo.addActionListener(Rojo);
		
		botonAmarillo.addActionListener(Amarillo);
	}		
private class ColorFondo  implements ActionListener{//Action  Listener interface para botones
		
		public ColorFondo(Color c){//constructor //parametro variable c de tipo Color
			
			colorDeFondo=c;
		}
		
		public void actionPerformed(ActionEvent e){
			
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;

		

	}

}




