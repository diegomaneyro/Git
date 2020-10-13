package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PruebaArea {

	public static void main(String[] args) {
		
		MarcoPruebaArea mimarco=new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea(){
		
		setTitle("Provando Area de texto");
		
		setBounds(500, 300, 500, 350); 
		
		setLayout(new BorderLayout());
		
		laminaBotones=new JPanel();
		
		botonInsertar=new JButton("insertar");
		
		botonInsertar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar ");
			}	
			});
		
		laminaBotones.add(botonInsertar);
	
		botonSaltoLinea=new JButton("SaltoLinea");
		
		botonSaltoLinea.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		
		});
	
	}
	
	private JTextArea areaTexto;
	
	private JButton botonInsertar, botonSaltoLinea;
	
	private JPanel laminaBotones;

	
}