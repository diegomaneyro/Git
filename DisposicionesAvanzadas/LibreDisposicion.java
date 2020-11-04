package DisposicionesAvanzadas;
import javax.swing.*;
import java.awt.*;
public class LibreDisposicion {

	public static void main(String[] args) {

	MarcoLibre mimarco=new MarcoLibre();
	
	mimarco.setVisible(true);
	
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLibre extends JFrame{
	
	public MarcoLibre(){
		
		setTitle("Disposiciones libres");
		
		setBounds(350,250,600,400);
		
		LaminaLibre milamina=new LaminaLibre();
		
		add(milamina);
	}
}

class LaminaLibre extends JPanel{
	
	public LaminaLibre(){

		setLayout(new EnColumnas());
		
		JLabel nombre=new JLabel("Nombre: ");
		JLabel apellido=new JLabel("Apellido: ");	
		JLabel edad=new JLabel("Edad: ");
		JLabel telefono=new JLabel("Telefono: ");
		
		JTextField c_nombre=new JTextField();
		JTextField c_apellido=new JTextField();        		
		JTextField c_edad=new JTextField();
		JTextField c_telefono=new JTextField();
		
		/*nombre.setBounds(20, 20, 80, 15);
		c_nombre.setBounds(100, 20, 100, 20);
		
		apellido.setBounds(20, 60, 80, 15);
		c_apellido.setBounds(100, 55, 100, 20);
		*/
		
		
		add(nombre);
		
		add(c_nombre);
		
		add(apellido);
		
		add(c_apellido);
		
		add(edad);
		
		add(c_edad);
		
		add(telefono);
		
		add(c_telefono);
	}
	
	
}

class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		//nos permite especificar un contenedor donde vallamos ubicando los elementos 
		int d=micontenedor.getWidth();
		
		x=d/2;//gyardael punto medio del contenedor
		
		int contador=0;
		
		int n=micontenedor.getComponentCount();
		
		for(int i=0;i<n;i++){		//recorre el valor de elementos que agregamos 
			
			contador++;//incrementa 1 mas cada vez que agregamos un elemento
			
			Component c=micontenedor.getComponent(i);	//
			
			c.setBounds(x-100, y, 100, 20);//al comonete que agregemos le estable estaespecificacion de tamaño y ubicacion
			//x menos 100 para que lo ubique antes del centro de la pantalla
			x+=100;
			
			if(contador%2==0){//divide el valor del elemento agregado y si de la division da cero es par entonces incrementa y en 40
								//despues agrega otro
				x=d/2;
				y+=40;
			}
		}
		
	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}
	private int x;
	private int y=20;
	
}

















