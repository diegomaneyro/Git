package portafolio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ProcesadorTexto {

	public static void main(String[] args) {
		
		MenuProcesador mimarco=new MenuProcesador();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MenuProcesador extends JFrame {
	
	public MenuProcesador(){
		
		setBounds(450,250,550,400);
		
		LaminaProcesador milamina=new LaminaProcesador();
		
		add(milamina);
	}
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador(){
		
		setLayout(new BorderLayout());
		JPanel laminamenu=new JPanel();
		JMenuBar mibarra=new JMenuBar();
		//--------------------------------
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamaño=new JMenu("Tamaño");		
		//--------------------------------
		JMenuItem arial=new JMenuItem("Arial");
		
		JMenuItem courier=new JMenuItem("Courier");
		
		courier.addActionListener(new gestionaMenus());
		JMenuItem verdana=new JMenuItem("Verdana");
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		//------------------------------------
		JMenuItem negrita=new JMenuItem("Negrita");
		
		JMenuItem cursiva=new JMenuItem("Cursiva");
		
		estilo.add(negrita);
		estilo.add(cursiva);
		//--------------------------------------
		JMenuItem tam12=new JMenuItem("12");
		JMenuItem tam16=new JMenuItem("16");
		JMenuItem tam20=new JMenuItem("20");
		JMenuItem tam24=new JMenuItem("24");
		
		tamaño.add(tam12);
		tamaño.add(tam16);
		tamaño.add(tam20);
		tamaño.add(tam24);
		//--------------------------------------
		mibarra.add(fuente);			
		mibarra.add(estilo);
		mibarra.add(tamaño);
		
		laminamenu.add(mibarra);
		
		add(laminamenu,BorderLayout.NORTH);
		
		miarea=new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		
		
	}
	
	private class gestionaMenus implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			miarea.setFont(new Font("Courier", Font.PLAIN, 12));
		}
		
	}
	
	JTextPane miarea;
}


