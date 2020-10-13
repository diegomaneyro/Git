package portafolio;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class VentanaEventos extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
	
		VentanaEventos mim=new VentanaEventos();
		
		mim.inicio();
	
	}
	public void inicio(){
		marco1=new VentanaEventos();
		
		marco2=new VentanaEventos();
		
		marco1.setVisible(true);
		
		marco2.setVisible(true);
		
		marco1.setBounds(350, 100, 400, 250);
		
		marco2.setBounds(850, 100, 400, 250);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		
		marco2.addWindowFocusListener(this);
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1){
			marco1.setTitle("Tengo el foro");
		}else{
			marco2.setTitle("Tengo el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1){
			marco1.setTitle("");
		}else{
			marco2.setTitle("");
		}
	}

	VentanaEventos marco1;// TODO variable de la clase VentanaEventos
	
	VentanaEventos marco2;// TODOvariable de la clase VentanaEventos 
	
}