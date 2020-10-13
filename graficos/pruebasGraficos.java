package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class pruebasGraficos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente=false;
		
		String[] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		//arrays quese vaa llenarcon el nombre del as fuentes dque estan en la pc
		
		for(String nombredelafuente: nombresDeFuentes){
			
			System.out.println(nombredelafuente);
			
			if(nombredelafuente.equals(fuente)){
				
				estalafuente=true;
			}
		}
			if(estalafuente){
				
				System.out.println("Fuente instalada");
			}
			
			else{
				
				System.out.println("No esta  instalada la fuente");
			}
	
	}

}
