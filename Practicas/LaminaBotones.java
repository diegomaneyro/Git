package Practicas;
import javax.swing.*;
public class LaminaBotones extends JPanel{
	
	public LaminaBotones(String titulo, String [] opciones ){
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		//crear borde con titulo===clase border factory + metodo-clase +parametro
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));//vaa tner una disposicione d tipo caja cuayos elementos
					//disposicion de las cajas. clase+ this(le dice al metodo que esta dicposicion esta pra esta lamina)+boxlayout.+de arriva a bajo en vertical)									//vn a estar de arriva a bajp
		grupo=new ButtonGroup();//crea un grupo de radio button
		
		for (int i=0; i<opciones.length; i++){
			JRadioButton bot=new JRadioButton(opciones[i]);//el paramero don va el nombre del jradio button es el alojado en el array opciones en la posicion de i//
			bot.setActionCommand(opciones[i]);//metodo asigna nombre a la accion de comando													
			
			add(bot);											//agrega el jradiobutton a la lamina
			grupo.add(bot);										//agrega funcionalidad grupal 
			bot.setSelected(i==0);								//aparece los radiobutton seleccionados inicialmente
																//en el paraetro deberia ir un boolean si i es igual a cero en true lo seleciona
		}
	}
	//evento//
	public String dameSeleccion(){
		/*ButtonModel miboton=grupo.getSelection();//almacena el radiobutton seleccionado en un objeto ButtonModel
		String s=miboton.getActionCommand();//almacena el texto que se aloja en el objeto ButtonModel
		return s;*/
		return grupo.getSelection().getActionCommand();
		//devuelve el string relacionado a la acciondel comando de grupo 
	}
	
	
	ButtonGroup grupo;
	
}
