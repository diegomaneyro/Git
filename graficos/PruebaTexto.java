package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		
		MarcoTexto mimarco=new MarcoTexto();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto(){
		
		setBounds(600, 300, 600, 350);
		
		LaminaTexto milamina=new LaminaTexto();
		
		add(milamina);
	}
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto(){//sino se estable otro el orden de los elementos se cargan por orden de Flow Layout que es por defecto
		//desde arriva a abjo por orden de carga
		setLayout(new BorderLayout());
		
		JPanel milamina2=new JPanel();//crea una lamina dentro de la otra
		
		milamina2.setLayout(new FlowLayout());
		
		resultado=new JLabel("", JLabel.CENTER);//con JLabel.CENTER alinea en el centro el texto que se aloja en la etiqueta 
		
		JLabel texto1=new JLabel("Email: ");//agrega etiqueta
		
		milamina2.add(texto1);
		
		campo1=new JTextField(20);//cuadro de texto
		
		milamina2.add(campo1);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton miboton=new JButton("Comprovar");//crea un boton
		
		DameTexto mievento=new DameTexto();//instancia de clase
		
		miboton.addActionListener(mievento);//pone a la escucha al boton de la clase listener
		
		milamina2.add(miboton);//agrega el boton a la lamina
		
		add(milamina2, BorderLayout.NORTH);
	}
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// 
			int correcto=0;//verifica si no hay mas de un aroba
			
			String email=campo1.getText().trim();//guarda en la variable lo escrito en el cuadro de texto y trim elimina espacios si los hay
			
			for(int i=0;i<email.length();i++){
				
				if(email.charAt(i)=='@'){
					
					correcto++;
				}
			}
			if(correcto!=1){
				
				resultado.setText("Incorrecto");//le asigna un texto a la etiqueta llamada resultado
			}else{
				resultado.setText("Correcto");				
			}
			
		}
		
	}
	
	
	private JTextField campo1;
	
	private JLabel resultado;
}

