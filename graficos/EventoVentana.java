package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventoVentana {

	public static void main(String[] args) {
		
		MarcoVentana mimarco=new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra la venta y el programa
		
		MarcoVentana mimarco2=new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//cierra solo la ventan el programa sigue activo
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300, 300, 500, 350);
		
		mimarco2.setBounds(0, 0, 500, 350);
	}

}
class MarcoVentana extends JFrame{ 
	
	public MarcoVentana(){
		
		//setTitle("Respondiendo");
		
		//setBounds(300, 300, 500, 350);
		
		setVisible(true);
		
		//M_Ventana oyente_ventana=new M_Ventana(); 
		
		//addWindowListener(oyente_ventana);
		
		addWindowListener(new M_Ventana()); 
		
	}
}
class M_Ventana extends WindowAdapter{//Ereda de window adapter para poder tener acceso a los metodos de la interfasce Action Listener

	@Override
	public void windowIconified(WindowEvent e) {
		// metodo que actua al minimiazar el MarcoVentana
		
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana Abierta");
	}
	
	
}