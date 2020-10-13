package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MarcoSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameSlider mimarco=new FrameSlider();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class FrameSlider extends JFrame{
	
	public FrameSlider(){
		
		setBounds(400, 200, 550, 350);
		
		LaminaSlider milamina=new LaminaSlider();
		
		add(milamina);
	}
}

class LaminaSlider extends JPanel{
	
	public LaminaSlider(){
	
		JSlider control=new JSlider(0,100,50);//valot inicial valor maximo. donde inicia el cursor
		
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);			
		control.setFont(new Font("Serif", Font.ITALIC, 12));
		control.setPaintLabels(true);
		control.setPaintTicks(true);	
		control.setSnapToTicks(true);//salta a la siguiente marca no en un intermedio
		
		add(control);
		
	}
	
	
	
}





