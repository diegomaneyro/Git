package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class Prueba_Temporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente=new DameLaHora();
		
		Timer mitemporizador=new Timer(5000, oyente);
		
		mitemporizador.start();	
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
	}

}
class DameLaHora implements ActionListener{
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		System.out.println("Pongo la hora cada 5 seg." + ahora);
	
			Toolkit.getDefaultToolkit().beep();
		
	}
	
}