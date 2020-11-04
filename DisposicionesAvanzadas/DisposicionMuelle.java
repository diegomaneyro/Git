package DisposicionesAvanzadas;
import javax.swing.*;
import java.awt.*;
public class DisposicionMuelle {

	public static void main(String[] args) {
		
		MarcoMuelle mimarco=new MarcoMuelle();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMuelle extends JFrame{
	
	public MarcoMuelle(){
		
		setTitle("Disposicin en muelle");
		
		setBounds(300,300,1000,350);
	
		LaminaMuelle milamina=new LaminaMuelle();
		
		add(milamina);
	}
}

class LaminaMuelle extends JPanel{
	
	public LaminaMuelle(){
		
		JButton boton1 =new JButton("boton1");
		
		JButton boton2 =new JButton("boton2");

		JButton boton3 =new JButton("boton3");
		
		SpringLayout miLayout=new SpringLayout();//instanciar la clase Spring Layout
		
		setLayout(miLayout);//con set le decimos que Layout debe usar
		
		add(boton1);

		add(boton2);

		add(boton3);
		
		Spring mimuelle=Spring.constant(0,0,10);//coportamiento de el muelle
		
		Spring muelleRigido=Spring.constant(10);
		
		miLayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
							//lado oeste del boton1, colocar un muelle o resorte, hasta el ladooeste de la lamina//
		miLayout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);
							//ladooeste del boton2, colocar un muelle hasta la parte este del boton1
		miLayout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);
		
		miLayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
		
	
	}
}





