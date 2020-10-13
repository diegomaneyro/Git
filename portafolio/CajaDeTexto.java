package portafolio;
import javax.swing.*;
import java.awt.FlowLayout;

public class CajaDeTexto {
	
	public CajaDeTexto(){
		
		JTextField texto;
		
		JFrame ventana=new JFrame("Caja de texto");
		
		texto =new JTextField(10);
		
		ventana.setLayout(new FlowLayout());
		
		ventana.setSize(450, 400);
		
		ventana.setVisible(true);
		
		ventana.add(texto);
	}
	
	public static void main(String[] args) {
		
		CajaDeTexto t=new CajaDeTexto();
	}
	
}
