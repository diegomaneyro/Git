package graficos;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Marco_Layout {

	public static void main(String[] args) {
		
		MarcoLayout mimarco=new MarcoLayout();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout(){
		
		
		
		setTitle("Prueba Acciones");
		
		setBounds(600, 150, 600, 300);

		PanelLayout lamina=new PanelLayout();
		
		PanelLayout2 lamina2=new PanelLayout2();
		
		add(lamina, BorderLayout.NORTH);//componnete , posicion
		
		add(lamina2, BorderLayout.SOUTH);
	}
}

class PanelLayout extends JPanel{
	
	public PanelLayout(){

		setLayout(new FlowLayout(FlowLayout.LEFT));//10, 10 es la separacion entre los componentes
		
		add(new JButton("Amarillo"));//aparece enla parte superior
		
		add(new JButton("Rojo"));//zona sur
		

	}
}

class PanelLayout2 extends JPanel{
	
	public PanelLayout2(){
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"), BorderLayout.WEST);//zona oeste
		
		add(new JButton("Verde"), BorderLayout.EAST);//zona este
		
		add(new JButton("Negro"), BorderLayout.CENTER);//centrado
	}
}