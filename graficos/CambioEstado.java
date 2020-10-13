package graficos;
import javax.swing.*;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.Frame.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco=new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado(){
		
		setVisible(true);
		
		setBounds(300, 300, 500, 300);
		
		CambiaEstado nuevoestado=new CambiaEstado();
		
		addWindowStateListener(nuevoestado);
	}
}

class CambiaEstado implements WindowStateListener{
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana cambioa de estado");
		
		System.out.println(e.getNewState());
	}
}