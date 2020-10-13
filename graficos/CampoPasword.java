package graficos;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
public class CampoPasword {

	public static void main(String[] args) {
		
		MarcoPasword mimarco=new MarcoPasword();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoPasword extends JFrame{
	
	public MarcoPasword(){
		
		setBounds(400, 300, 550, 400);
		
		LaminaPasword milamina=new LaminaPasword();
		
		add(milamina);
	}
}

class LaminaPasword extends JPanel{
	
	public LaminaPasword(){
		
		setLayout(new BorderLayout());//a la lamina principal le asigna un Border layout
		
		JPanel LaminaSuperior=new JPanel();//crea una lamina nueva dentro de la otra
		
		LaminaSuperior.setLayout(new GridLayout(2,2));// llama a la lamina secundaria y le asigna un grid layout
		
		add(LaminaSuperior, BorderLayout.NORTH);//agrega la lamina con layout norte
		
		JLabel etiqueta1=new JLabel("Usuario");
		
		JLabel etiqueta2=new JLabel("Contraseña");
		
		JTextField c_usuario=new JTextField(15);
		
		c_contra=new JPasswordField(15);
		
		CompruebaPass mievento=new CompruebaPass(); 
		
		c_contra.getDocument().addDocumentListener(mievento);
		
		LaminaSuperior.add(etiqueta1);
		
		LaminaSuperior.add(c_usuario);
		
		LaminaSuperior.add(etiqueta2);
		
		LaminaSuperior.add(c_contra);
		
		JButton enviar=new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
	}
	
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
		
			char [] contraseña;
			
			contraseña=c_contra.getPassword();//captura lo ingresado en c_contra y lo iguala a contraseña
		
			if(contraseña.length<8 || contraseña.length>12){
				
				c_contra.setBackground(Color.RED);
			}else{
				c_contra.setBackground(Color.WHITE);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
char [] contraseña;
			
			contraseña=c_contra.getPassword();//captura lo ingresado en c_contra y lo iguala a contraseña
		
			if(contraseña.length<8 || contraseña.length>12){
				
				c_contra.setBackground(Color.RED);
			}else{
				c_contra.setBackground(Color.WHITE);
			}
		}
		
	}
	
	JPasswordField c_contra;
}

