package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EjemploArea {

	public static void main(String[] args) {
		
		MarcoArea mimarco=new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}
}
class MarcoArea extends JFrame{
	
	public MarcoArea(){
		
		setBounds(500, 300, 500, 350);
		
		LaminaArea milamina=new LaminaArea();
		
		add(milamina);
	}
}

class LaminaArea extends JPanel{
	
	public LaminaArea(){
		
		 miarea=new JTextArea(8, 20);//instancia la clase JTextArea y le asigna un tamaño
		
		JScrollPane laminaBarras=new JScrollPane(miarea);
		
		miarea.setLineWrap(true);//agrega un salto de linea asi no se expoanse en ancho
		
		add(miarea);
		
		JButton miboton=new JButton("DaLe");
		
		add(miboton);
		
		miboton.addActionListener(new GestionaArea());
	}
	 private class GestionaArea implements ActionListener{
		 public GestionaArea(){
			 
		 }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
		}
	 }
	 private JTextArea miarea; 
}

