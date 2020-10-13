package graficos;
import javax.swing.*;
public class SyntaxisRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRadio mimarco=new MarcoRadio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoRadio extends JFrame{
	
	public MarcoRadio(){
		
		setBounds(550, 300, 500, 300);
		
		LaminaRadio milamina=new LaminaRadio();
		
		add(milamina);
	}
}

class LaminaRadio extends JPanel{
	
	public LaminaRadio(){
		
		ButtonGroup migrupo1=new ButtonGroup();//crea un grupo de botones
		
		ButtonGroup migrupo2=new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("Azul", false);//crea boton de radio check incorpora por constructor nombre y boolena
		
		JRadioButton boton2=new JRadioButton("Rojo", true);
		
		JRadioButton boton3=new JRadioButton("Verde", false);
		
		JRadioButton boton4=new JRadioButton("Masculino", false);
		
		JRadioButton boton5=new JRadioButton("Femenino", false);
		
		migrupo1.add(boton1);//agrega los botones al objeto grupo para que trabajen como una unidad
		migrupo1.add(boton2);
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		migrupo2.add(boton5);
		add(boton1);
		add(boton2);
		add(boton3);
		
		add(boton4);
		add(boton5);
	}
	
}