package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.*;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class ProcesadorTexto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 JMenu fuente = new JMenu("Fuente");
		 JMenu estilo = new JMenu("Estilo");
		 JMenu tamaño = new JMenu("Tamaño");		
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
			if(tipoLetra=="Arial"){
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Arial"));
			}else if (tipoLetra=="Courier"){
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Courier"));
			}else if(tipoLetra == "Verdadada"){
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Verdana"));
			}
			
		}else if(menu=="estilo"){
			
			estilo.add(elemMenu);
			if(estilos==Font.BOLD){
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
					
			}else if(estilos==Font.ITALIC){
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
				
			}
			
		}else if(menu=="tamaño"){
			tamaño.add(elemMenu);
			
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",tam));
			
		}
		
	}
		
				
	


		JTextPane miarea;
		JMenu fuente,estilo, tamaño;
		Font letra;
		
		
	}


