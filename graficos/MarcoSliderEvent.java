package graficos;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
public class MarcoSliderEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSlider2 mimarco=new MarcoSlider2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoSlider2 extends JFrame{
	
	public MarcoSlider2(){
		
		setBounds(350, 150, 550, 450);
		
		LaminaSlider2 milamina=new LaminaSlider2();
		
		add(milamina);
	}
}

class LaminaSlider2 extends JPanel{
	
	public LaminaSlider2(){
	
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("La noche está estrellada y tiritan, azules, los astros, a lo lejos");
		
		add(rotulo, BorderLayout.CENTER);
		
		control=new JSlider(8,50,12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif",Font.ITALIC,10));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel LaminaSlider3=new JPanel();
		
		LaminaSlider3.add(control);
		
		add(LaminaSlider3, BorderLayout.NORTH);
	}
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			rotulo.setFont(new Font("Serif",Font.ITALIC,control.getValue()));
		}
		
	}
	
	private JLabel rotulo;
	private JSlider control;
}





