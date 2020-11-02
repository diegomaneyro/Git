package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion mimarco=new MarcoAccion();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}

class MarcoAccion extends JFrame{
	
	public MarcoAccion(){
		
		
		
		setBounds(250, 110, 600, 300);
		
		PanelAccion mipanel=new PanelAccion();
		
		add(mipanel);
	}

}

class PanelAccion extends JPanel{
	
	private Icon accionAmarillo;
	
	public PanelAccion(){
		
		AccionColor accionAmari=new AccionColor("Amarillo", new ImageIcon("src/graficos/imagenes/bolaAmarillo.gif"), Color.YELLOW );
		
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/imagenes/bolaAzul.gif"), Color.BLUE);
		
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/imagenes/bolaRoja.gif"), Color.RED);
		
		add(new JButton(accionAmari));
		
		add(new JButton(accionAzul));
		
		add(new JButton(accionRojo));
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
//		KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");// otra manera de hacerlo
	
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"),"Fondo_Amarillo");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"),"Fondo_azul");
			
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"Fondo_rojo");
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("Fondo_Amarillo", accionAmari);
		
		mapaAccion.put("Fondo_azul", accionAzul);
		
		mapaAccion.put("Fondo_rojo", accionRojo);
		
	}

class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color color_boton){//constructor del boton
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			
			putValue("color_de_fondo", color_boton);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color)getValue("color_de_fondo");
		
			setBackground(c);
			
			System.out.println("Nombre " + getValue(Action.NAME)+ " " + getValue(Action.SHORT_DESCRIPTION));
			
		}
	}
}
	
	
 





