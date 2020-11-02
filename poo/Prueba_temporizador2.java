package poo;

import javax.swing.*;
import java.awt.Event;
import javax.swing.Timer;
import java. awt .Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Prueba_temporizador2 {

	public static void main(String[] args) {
		
	Reloj mireloj=new Reloj();	
		mireloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulse para cancelar");
	
	}

}

class Reloj{
	
		public void enMarcha(int intervalo, final boolean sonido){

		 class DameLahora2 implements ActionListener{// clase interna con modificador de acceso private
			
			 public void actionPerformed(ActionEvent evento){
				Date ahora=new Date();
				
				System.out.println("Muestra la hora cada 3 segundos " + ahora);
				
				if(sonido){
					Toolkit.getDefaultToolkit().beep();
				}
			}
		 }
		
		ActionListener oyente=new DameLahora2();
		Timer mitemporizador=new Timer(intervalo, oyente);
		mitemporizador.start();
	}
}
	

