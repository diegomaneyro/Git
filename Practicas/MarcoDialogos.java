package Practicas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class MarcoDialogos extends JFrame {

	public MarcoDialogos(){
		
		setTitle("Prueba de diálogos");
		setBounds(350,150,650,450);
		//=========parametros iniciales========================//
		
		JPanel LaminaCuadricula=new JPanel();
		
		LaminaCuadricula.setLayout(new GridLayout(2,3));
		
		String primero[]={"Mensaje","Confirmar","Opcion","Entrada"};
		
		LaminaTipo=new LaminaBotones("Tipo", primero);
		
		LaminaConfirmar=new LaminaBotones("Confirmar",new String[]{
		"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"	
		});
		LaminaTipoMensaje=new LaminaBotones("Tipo de Mensaje",new String[]{//instancia del array de String dentro del parametro 
		"ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"						
		});
		LaminaOpcion=new LaminaBotones("Opcion",new String[]{
		"String[]","Icon[]","Object[]"		
		});
		LaminaMensaje=new LaminaBotones("Mensaje",new String[]{
		"Cadena","Icono","Componente","Otros","Object[]"		
		});
		LaminaEntrada=new LaminaBotones("Entrada",new String[]{
		"Campo de texto","Combo"		
		});
		
		LaminaCuadricula.add(LaminaTipo);
		LaminaCuadricula.add(LaminaTipoMensaje);
		LaminaCuadricula.add(LaminaMensaje);
		LaminaCuadricula.add(LaminaConfirmar);
		LaminaCuadricula.add(LaminaOpcion);
		LaminaCuadricula.add(LaminaEntrada);
		setLayout(new BorderLayout());
		add(LaminaCuadricula, BorderLayout.CENTER);
		//construimosla laminainferrio
		
		JPanel LaminaMostrar=new JPanel();
		JButton BotonMostrar=new JButton("Mostrar");
		BotonMostrar.addActionListener(new AccionMostrar());
		LaminaMostrar.add(BotonMostrar);
		add(LaminaMostrar,BorderLayout.SOUTH);
		
	}
	//======================proporciona el mensaje============================//
	public Object dameMensaje(){
		String s=LaminaMensaje.dameSeleccion();//devuelve el string de la opcion selecionada
		if(s.equals("Cadena")){
			return cadenaMensaje;
		
		}else if(s.equals("Icono")){
			return iconoMensaje; 
		
		}else if(s.equals("Componente")){
			return componenteMensaje;
		
		}else if(s.equals("Otros")){
			return objetoMensaje;
		
		}else if(s.equals("Object[]")){
			return new Object[]{cadenaMensaje,iconoMensaje,componenteMensaje,objetoMensaje};
		}else{
			return null;
		}
	
	}	
	//======================devuleve tipo icono y tambien numero de botones en confirmar===================================================//
	public int dameTipo(LaminaBotones lamina){
		
		String s=lamina.dameSeleccion();//almacena en s la opcion selecionada por ele usuario
		if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")){
			return 0;
		}else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")){
			return 1;
		}else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")){
			return 2;
		}else if(s.equals("QUESTION_MESSAGE")){
			return 3;
		}else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")){
			return -1;
		}else{
			return 0;
		}
	
	}
	//===================DA OPCIONES A LA LAMINA OPCIONES===========//
	
	public Object[] dameOpciones(LaminaBotones lamina){
		String s=lamina.dameSeleccion();
		if (s.equals("String[]")){
			return new String[]{"Amarillo","Azul","Rojo"};
		
		}else if(s.equals("Icon[]")){
			return new Object[]{new ImageIcon("src/imagenes/bolaAmarillo.gif"),new ImageIcon("src/imagenes/bolaAzul.gif"),new ImageIcon("src/imagenes/bolaRoja.gif")};
		}
		else if(s.equals("Object[]")){
			return new Object[]{cadenaMensaje,iconoMensaje,componenteMensaje,objetoMensaje};
		}
		
		else{
			return null;
		}
	
	}
	
	
	
	
	
	
	//clas interna quegestiona el metodo 
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//System.out.println(LaminaTipo.dameSeleccion());
		if(LaminaTipo.dameSeleccion().equals("Mensaje")){
			JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(), "Titulo", dameTipo(LaminaTipoMensaje));
		}
		else if(LaminaTipo.dameSeleccion().equals("Confirmar")){
			JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(), "Titulo", dameTipo(LaminaConfirmar),dameTipo(LaminaTipoMensaje));
		}	
		else if(LaminaTipo.dameSeleccion().equals("Entrada")){
			if(LaminaEntrada.dameSeleccion().equals("Campo de texto")){
			JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Titulo",dameTipo(LaminaTipoMensaje));
		}else{
			JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(),"Titulo", dameTipo(LaminaTipo), null, new String[]{"Amarillo","Azul","Rojo"}, "Azul");
			}
		}
		else if(LaminaTipo.dameSeleccion().equals("Opcion")){
			JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(), "Titulo", 1, dameTipo(LaminaTipoMensaje), null, dameOpciones(LaminaOpcion), null);
			}
		}		
	}
	//===============================================================================//
	
	private LaminaBotones LaminaTipo, LaminaConfirmar, LaminaTipoMensaje, LaminaOpcion, LaminaMensaje, LaminaEntrada;
	
	private String cadenaMensaje="Cadena String";
	private Icon iconoMensaje=new ImageIcon("src/imagenes/bolaAmarillo.GIF");
	private Object objetoMensaje=new Date();//almacena la fecahas de hoy
	private Component componenteMensaje=new LaminaEjemplo();
	
	
	}
	class LaminaEjemplo extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponents(g);
			Graphics2D g2=(Graphics2D) g;
			Rectangle2D rectangulo=new Rectangle2D.Double(0,0,getWidth(),getHeight());
			g2.setPaint(Color.blue);
			g2.fill(rectangulo);//rellenar figuras geometricas 
		
		}
	}






