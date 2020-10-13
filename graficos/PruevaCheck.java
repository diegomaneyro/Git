package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PruevaCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCheck mimarco=new MarcoCheck();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoCheck extends JFrame{
	
	public MarcoCheck(){
		
		setBounds(550, 300, 550, 350);
		
		LaminaCheck milamina=new LaminaCheck();
		
		add(milamina);
		
	}
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck(){
		
		setLayout(new BorderLayout());
		
		Font miletra=new Font("Serif", Font.PLAIN, 24);//instancia de la clase de tipo de letra
		
		texto=new JLabel("En un lugar de la macha en cuyo....");
		
		texto.setFont(miletra);//estipula un tipo de letra pide un objeto de tipo font
		
		JPanel laminaTexto=new JPanel();
		
		laminaTexto.add(texto);
		
		add(laminaTexto, BorderLayout.CENTER);
		
		check1=new JCheckBox("Negrita");
		
		check2=new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminaChecks=new JPanel();
		
		laminaChecks.add(check1);
		
		laminaChecks.add(check2);
		
		add(laminaChecks , BorderLayout.SOUTH);
	}
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			int tipo=0;
			if(check1.isSelected()) tipo+=Font.BOLD;
			
			if(check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif", tipo, 24));
			
			
		}
		
	}
	
	private JLabel texto;
	private JCheckBox check1, check2;//declarado objeto de tipo caja de check

}
