package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameSpinner mimarco=new FrameSpinner();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner(){
		
		setBounds(250, 150, 550, 350);
		
		LaminaSpinner milamina=new LaminaSpinner();
		
		add(milamina);
	}
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner(){
		
		//String Lista[]={"enero","febrero","marzo"};//array que otorga datos al Spinner
		
		//String Fuentes[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();//aloja las clases ede fuentes que estan en la pc local
		
		//JSpinner control=new JSpinner(new SpinnerListModel(Fuentes));//new SpinnerListModel inserta los datos del array 
		JSpinner control=new JSpinner(new MiModeloJspinner());
		Dimension d=new Dimension(200, 20);//objeto de tipo dimension para cambiar el tamaño del JSpinner
		
		control.setPreferredSize(d);
		
		add(control);
		
		
	}
	private class MiModeloJspinner extends SpinnerNumberModel{
		
		public MiModeloJspinner(){
		
			super(5,0,10,1);
		}
		public Object getNextValue(){
			return super.getPreviousValue();
		}
		public Object getPreviousValue(){
			return super.getNextValue();
		}
	}
	
	
	
}


