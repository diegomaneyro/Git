package portafolio;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
public class ProcesadorTexto {
//======Procesador de texto=========//
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
		configuraMenu("Arial","fuente","Arial",9,10);
		configuraMenu("Courier","fuente","Courier",9,10);
		configuraMenu("Verdana","fuente","Verdana",9,10);
		//-----------------------------------------//i
		configuraMenu("Negrita", "estilo", "",Font.BOLD,10);
		configuraMenu("Cursiva", "estilo", "",Font.ITALIC,10);
		
		ButtonGroup tamaño_letra=new ButtonGroup();
		JRadioButtonMenuItem doce=new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis=new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro=new JRadioButtonMenuItem("24");
		
		veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK ));
		 
		tamaño_letra.add(doce);
		tamaño_letra.add(dieciseis);
		tamaño_letra.add(veinte);
		tamaño_letra.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",12));

		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",16));

		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",20));

		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",24));
		
		tamaño.add(doce);
		tamaño.add(dieciseis);
		tamaño.add(veinte);
		tamaño.add(veinticuatro);
		//-----------------------------------//
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamaño);
		laminamenu.add(mibarra);
		
		
		
		add(laminamenu,BorderLayout.NORTH);
		
		miarea=new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		//===========================//
		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem negritaE=new JMenuItem("Negrita");
		
		JMenuItem cursivaE=new JMenuItem("Cursiva");

		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());

		
		emergente.add(negritaE);
		emergente.add(cursivaE);
		
		miarea.setComponentPopupMenu(emergente);
		//============================================================================================
		
		barra=new JToolBar();
		configura_barra("src/graficos/imagenes/Negrita.Gif").addActionListener(new StyledEditorKit.BoldAction());
		configura_barra("src/graficos/imagenes/Cursiva.Gif").addActionListener(new StyledEditorKit.ItalicAction());
		configura_barra("src/graficos/imagenes/Subrayado.Gif").addActionListener(new StyledEditorKit.UnderlineAction());
		barra.addSeparator();
		configura_barra("src/graficos/imagenes/rojoBarra.Gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_rojo", Color.RED));
		configura_barra("src/graficos/imagenes/azulBarra.Gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_azul", Color.BLUE));
		configura_barra("src/graficos/imagenes/amarilloBarra.Gif").addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.YELLOW));
		barra.addSeparator();
		configura_barra("src/graficos/imagenes/izquierdaBarra.Gif").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
		configura_barra("src/graficos/imagenes/derechaBarra.Gif").addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
		configura_barra("src/graficos/imagenes/centradoBarra.Gif").addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
		configura_barra("src/graficos/imagenes/justificadoBarra.Gif").addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
		
		barra.setOrientation(1);//orienta la barra de herramientas
		add(barra, BorderLayout.WEST);
		
	}
	
	public JButton configura_barra(String ruta){
		
		JButton boton=new JButton(new ImageIcon(ruta));
		
		barra.add(boton);
		return boton;
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
			}else if(tipoLetra == "Verdana"){
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Verdana"));
			}
			
		}
		else if(menu=="estilo"){
			
			estilo.add(elemMenu);
			if(estilos==Font.BOLD){

				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));//evento atajo de teclado
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
					
			}else if(estilos==Font.ITALIC){
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));//evento atajo de teclado 
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
	JButton negritaBarra, CursivaBarra, SubraBarra,azulBarra, rojoBarra, amarilloBarra, izquierdaBarra, centradoBarra, derechaBarra, justificadoBarra;
	JToolBar barra;
}


