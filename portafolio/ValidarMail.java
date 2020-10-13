package portafolio;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.*;
import javax.swing.*;


public class ValidarMail {

	public static void main(String[] args) {
		// validar mail desde ventana con foco
		MarcoMail mim=new MarcoMail();
		
		mim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMail extends JFrame{
	
	public MarcoMail(){
		
		setVisible(true);
		
		setBounds(550, 50, 450, 350);
		
		LaminaMail Mail=new LaminaMail();
		
		add(Mail);
				
	}
}
class LaminaMail  extends JPanel {
	
	JTextField cuadro1;
	
	JTextField cuadro2;


		public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		cuadro1.setBounds(200, 60, 100, 20);
				
		cuadro2.setBounds(200, 90, 100, 20);		
		
		add(cuadro1);
		
		add(cuadro2);
		
		Focomail Foco=new Focomail();
		
		cuadro1.addFocusListener(Foco);
		
		}
				
		class Focomail implements FocusListener{

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
							}

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("He perdido el foco");
				
				String correo=cuadro1.getText();
			
				boolean comprobacion=false;
			
				for(int i=0;i<correo.length();i++){
				if(correo.charAt(i)=='@'){
					comprobacion=true;
						}
					}
				if(comprobacion){
					System.out.println("Valido");
				}else{System.out.println("no Valido"); 				}
		}				
	}
}





