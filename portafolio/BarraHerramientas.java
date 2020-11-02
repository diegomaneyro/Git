package portafolio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.Event.*;

public class BarraHerramientas {

	public static void main(String[] args) {

		MarcoBarra mimarco=new MarcoBarra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoBarra extends JFrame{
	
	public MarcoBarra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
			
		lamina=new JPanel();
		
		add(lamina);
		//==================================================================================================//
		
		AbstractAction accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/imagenes/bolaAzul.GIF"), Color.BLUE);
		AbstractAction accionAmarilo=new AccionColor("Amarillo", new ImageIcon("src/graficos/imagenes/bolaAmarillo.GIF"), Color.YELLOW);
		AbstractAction accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/imagenes/bolaRoja.GIF"), Color.RED);
		AbstractAction accionSalir=new AbstractAction("Salir", new ImageIcon("src/graficos/imagenes/botonSalir.GIF")){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);//sale de la aplicacion
			}
			
		};
		
		JMenu menu=new JMenu("color");
		
		menu.add(accionAzul);
		menu.add(accionAmarilo);
		menu.add(accionRojo);
		
		
		JMenuBar barra_menus=new JMenuBar(); 
		barra_menus.add(menu);	
		setJMenuBar(barra_menus);
		
		//==Costruccion de la barra de herramientas==//
		
		JToolBar barra=new JToolBar();
		barra.add(accionAzul);
		barra.add(accionAmarilo);
		barra.add(accionRojo);
		barra.addSeparator();
		barra.add(accionSalir);
		add(barra,BorderLayout.NORTH);
		
	}
private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	private JPanel lamina;
}



	
	