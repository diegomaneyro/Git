package portafolio;
import javax.swing.*;
import java.awt.*;
public class MarcoMEmergente {

	public static void main(String[] args) {

		MarcoEmergenteM mimarco=new MarcoEmergenteM();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoEmergenteM extends JFrame{
	
	public MarcoEmergenteM(){
		
		setBounds(100,100,300,250);
		
		LaminaEmergenteM milamina=new LaminaEmergenteM();
		
		add(milamina);
		
	}
}

class LaminaEmergenteM extends JPanel{
	
	public LaminaEmergenteM(){
		
		setLayout(new BorderLayout());
		
		JPanel Laminamenu=new JPanel();
		
		JMenuBar mibarra=new JMenuBar();
		
		JMenu fuente=new JMenu("fuente");
		JMenu estilo=new JMenu("estilo");
		JMenu tamaño=new JMenu("tamaño");
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamaño);
		
		Laminamenu.add(mibarra);
		add(Laminamenu, BorderLayout.NORTH);
		
		JTextPane miarea=new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		//-------------------------------//

		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem opcion1=new JMenuItem("Opcion 1");
		
		JMenuItem opcion2=new JMenuItem("Opcion 2");

		JMenuItem opcion3=new JMenuItem("Opcion 3");

		
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
		miarea.setComponentPopupMenu(emergente);
		
		
	}
	
}








