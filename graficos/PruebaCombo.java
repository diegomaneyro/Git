package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PruebaCombo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCombo mimarco=new MarcoCombo();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo(){
		
		setBounds(550, 300, 550, 400);
		
		LaminaCombo milamina=new LaminaCombo();
		
		add(milamina);
				
	}
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo(){
	
		setLayout(new BorderLayout());
		
		texto=new JLabel("Texto cualquiera para probar Combo");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		JPanel LaminaNorte=new JPanel();
		
		micombo=new JComboBox();
		
		
		micombo.addItem("Serif");		
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		
		EventoCombo mievento=new EventoCombo();
		
		micombo.addActionListener(mievento);
		
		LaminaNorte.add(micombo);
		
		add(LaminaNorte, BorderLayout.NORTH);
	}
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN,18));//casting
		}
		
	}
	
	
	private JLabel texto;
	
	private JComboBox micombo;
}



