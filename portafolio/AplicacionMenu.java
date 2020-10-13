package portafolio;
import javax.swing.*;
import java.awt.*;
public class AplicacionMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameMenu mimarco=new FrameMenu();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class FrameMenu extends JFrame{
	
	public FrameMenu(){
		
		setBounds(200,150,350,250);
		
		setTitle("Menu");
		
		LaminaMenu milamina=new LaminaMenu();
		
		add(milamina);
	}
}

class LaminaMenu extends JPanel{
	
	public LaminaMenu(){
		
		JMenuBar mimenu=new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		JMenu edicion=new JMenu("Edicion");
		JMenu herramientas=new JMenu("Herramientas");
		JMenu ayuda=new JMenu("Ayuda");				
		JMenu compartirCon=new JMenu("Compartir con");
		JMenu nuevo=new JMenu("Nuevo");
				
		JMenuItem gitGui=new JMenuItem("Git GUI Here");
		JMenuItem gitBash=new JMenuItem("Git Bash Here");					
	    //---------------------------------------------------------
		JMenuItem nadie=new JMenuItem("Nadie");		
		JMenuItem grupoLectura=new JMenuItem("Grupo en el hogar (lectura)");
		JMenuItem grupoLectoEscritura=new JMenuItem("Grupo en el hogar (lectura y escritura)");
		JMenuItem usuariosEspecificos=new JMenuItem("Usuarios especificos...");		
		//--------------------------------------------------------
		JMenuItem carpeta=new JMenuItem("Carpeta");
		JMenuItem accesoDirecto=new JMenuItem("Acceso directo");
		JMenuItem microsoftAccess=new JMenuItem("Microsoft Access Base de datos");
		JMenuItem imagen=new JMenuItem("Imagen de mapa de bits");
		JMenuItem contacto=new JMenuItem("Contacto");	
		//----------------------------------------------------------
		JMenuItem crearAcceso=new JMenuItem("Crear acceso directo");
		JMenuItem eliminar=new JMenuItem("Eliminar");
		JMenuItem cambiarNombre=new JMenuItem("Cambiar nombre");
		JMenuItem propiedades=new JMenuItem("Propiedades");
		JMenuItem cerrar=new JMenuItem("Cerrar");				
		//---------------------------------------------------------
		JMenuItem deshacer=new JMenuItem("Deshacer  Ctrl+Z");
		JMenuItem rehacer=new JMenuItem ("Rehacer    Ctrl+Y");
		JMenuItem cortar=new JMenuItem  ("Cortar        Ctrl+X");
		JMenuItem copiar=new JMenuItem  ("Copiar        Ctrl+C");
		JMenuItem pegar=new JMenuItem   ("Pegar         Ctrl+V");
		//-----------------------------------------------------------
		JMenuItem conectarUnidad=new JMenuItem("Conectar a unidad de red...");
		JMenuItem desconectarUnidad=new JMenuItem("Desconectar unidad de red...");
		JMenuItem abrirCentro=new JMenuItem("Abrir Centro de sincronizacion...");
		JMenuItem opcionesCarpeta=new JMenuItem("Opciones de carpeta");				
		
		JMenuItem verAyuda=new JMenuItem("Ver ayuda");
		
		
		
		mimenu.add(archivo);
		mimenu.add(edicion);
		mimenu.add(herramientas);
		mimenu.add(ayuda);	
		
		archivo.add(gitGui);
		archivo.add(gitBash);
		archivo.addSeparator();
		archivo.add(compartirCon);
		archivo.addSeparator();
		archivo.add(nuevo);
		archivo.addSeparator();
		archivo.add(crearAcceso);
		archivo.add(eliminar);
		archivo.add(cambiarNombre);
		archivo.add(propiedades);
		archivo.add(cerrar);

		compartirCon.add(nadie);
		compartirCon.add(grupoLectura);
		compartirCon.add(grupoLectoEscritura);
		compartirCon.add(usuariosEspecificos);
		
		nuevo.add(carpeta);
		nuevo.add(accesoDirecto);
		nuevo.add(microsoftAccess);
		nuevo.add(imagen);
		nuevo.add(contacto);		
		
		edicion.add(deshacer);
		edicion.add(rehacer);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		herramientas.add(conectarUnidad);
		herramientas.add(desconectarUnidad);
		herramientas.add(abrirCentro);
		herramientas.addSeparator();
		herramientas.add(opcionesCarpeta);
		
		ayuda.add(verAyuda);
		
		add(mimenu);
		
	}
	
	
}