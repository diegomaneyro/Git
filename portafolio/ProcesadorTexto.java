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
		 fuente=new JMenu("Fuente");
		 estilo=new JMenu("Estilo");
		 tamaño=new JMenu("Tamaño");		
		//---------------------------------------//
		configuraMenu("Arial", "fuente", "Arial", 9,10);
		configuraMenu("Courier", "fuente", "Courier", 9,10);
		configuraMenu("Verdana", "fuente", "Verdana", 9,10);
		//-----------------------------------------//
		configuraMenu("Negrita", "estilo", "",Font.BOLD,10);
		configuraMenu("Cursiva", "estilo", "",Font.ITALIC,10);
		//-----------------------------------------//
		configuraMenu("12", "tamaño", "", 9,12);
		configuraMenu("16", "tamaño", "", 9,16);
		configuraMenu("20", "tamaño", "", 9,20);
		configuraMenu("24", "tamaño", "", 9,24);
		//-----------------------------------//
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamaño);
		laminamenu.add(mibarra);
		
		
		
		add(laminamenu,BorderLayout.NORTH);
		
		miarea=new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		
		
	}
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam){
		//metodo
		JMenuItem elemMenu=new JMenuItem(rotulo);
		
		if(menu=="fuente"){
			fuente.add(elemMenu);
			
		}else if(menu=="estilo"){
			estilo.add(elemMenu);
		}else if(menu=="tamaño"){
			tamaño.add(elemMenu);
		}
		elemMenu.addActionListener(new GestionaEventos(rotulo,tipoLetra, estilos, tam));
	}
		private class GestionaEventos implements ActionListener{
		String tipoTexto, menu;
		
		GestionaEventos(String elemento, String texto2, int estilo2, int tamLetra){
			tipoTexto=texto2;
			estiloLetra=estilo2;
			tamañoLetra=tamLetra;
			menu=elemento;
		}
		
		int estiloLetra, tamañoLetra;
			
			public void actionPerformed(ActionEvent e) {
				 
				letra=miarea.getFont();
				
				if(menu=="Arial" || menu=="Courier" || menu=="Verdana"){
					estiloLetra=letra.getStyle();
					
					tamañoLetra=letra.getSize();
				}else if(menu=="Cursiva" || menu=="Negrita"){
					tipoTexto=letra.getFontName();
					tamañoLetra=letra.getSize();
				}else if(menu=="12" || menu=="16" || menu=="20" || menu=="24"){
					estiloLetra=letra.getStyle();
					tipoTexto=letra.getFontName();
				}
				
				miarea.setFont(new Font(tipoTexto, estiloLetra, tamañoLetra));
				
			}
			
		}
	
	
	
	
	
	JTextPane miarea;
	JMenu fuente,estilo, tamaño;
	Font letra;
	
	
}


