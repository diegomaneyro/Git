package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class EventoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton mimarco=new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton(){
		
		setVisible(true);
		
		setBounds(500, 200, 600, 450);
		
		EventosDeRaton EventoRaton=new EventosDeRaton();
		
		addMouseMotionListener(EventoRaton);
	}
	
	
}

class EventosDeRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
	}
	
}