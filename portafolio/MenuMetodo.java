package portafolio;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		MarcoMetodo mimarco=new MarcoMetodo();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);
		}

	}

class MarcoMetodo extends JFrame {

public MarcoMetodo(){

setBounds(450,250,550,400);

LaminaProcesador milamina=new LaminaProcesador();

add(milamina);
}
}
  

class LaminaMenuMetodo extends JPanel{

 public LaminaMenuMetodo(){
 		
	 
	 
	 
 			}
 
 
 
	}