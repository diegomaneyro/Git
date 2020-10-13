package graficos;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
public class PruebaJava {

	public static void main(String[] args) {
		
		MarcoPrueba mimarco=new MarcoPrueba();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba(){
		
		setBounds(500, 300, 500, 350);
		
		LaminaPrueba milamina=new LaminaPrueba();
		
		add(milamina);
		
		
		
	}
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba(){
		
		JTextField micampo=new JTextField(20);
		
		EscuchaTexto el_evento=new EscuchaTexto();
		
		Document midoc=micampo.getDocument();//instancia de la interace Document
		
		midoc.addDocumentListener(el_evento);
		
		add(micampo);
		
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has ingresado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");

		}
		
	}
}

