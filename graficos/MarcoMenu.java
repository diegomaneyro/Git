package graficos;
import javax.swing.*;
import java.awt.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuFrame mimarco=new MenuFrame();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame(){
		
		setBounds(300,150,550,400);
		
		MenuLamina milamina=new MenuLamina();
		
		add(milamina);
	}
}

class MenuLamina extends JPanel{
	
	public MenuLamina(){
		
		JMenuBar mibarra=new JMenuBar();//crea una barra de herramientas
		
		JMenu archivo=new JMenu("Archivo");
		JMenu Edicion=new JMenu("Edicion");
		JMenu Herramientas=new JMenu("Herramientas");
		
		JMenu opciones=new JMenu("Opciones"); 
		
		JMenuItem guardar=new JMenuItem("Guardar"); 
		JMenuItem guardarComo=new JMenuItem("Guardar Como"); 
		
		JMenuItem cortar=new JMenuItem("Cortar", new ImageIcon("src/graficos/imagenes/cut.GIF")); 
		JMenuItem copiar=new JMenuItem("Copiar", new ImageIcon("src/graficos/imagenes/copy.GIF"));
		JMenuItem pegar=new JMenuItem("Pegar", new ImageIcon("src/graficos/imagenes/paste.GIF"));
		
		JMenuItem generales=new JMenuItem("Generales"); 
		
		JMenuItem opcion1=new JMenuItem("Opcion 1");
		JMenuItem opcion2=new JMenuItem("Opcion 2");
		JMenuItem opcion3=new JMenuItem("Opcion 3");
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		Edicion.add(cortar);
		Edicion.add(copiar);
		Edicion.add(pegar);
		Edicion.addSeparator();
		
		Edicion.add(opciones);
		
		Herramientas.add(generales);
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		opciones.add(opcion3);
		
		mibarra.add(archivo);//agraga las opciones a la barra
		mibarra.add(Edicion);
		mibarra.add(Herramientas);
		
		add(mibarra);//agregar la barra a la lamina
		
		
	}

	
		
	}
	
	
	







