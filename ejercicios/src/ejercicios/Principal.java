package ejercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {


	
	
	
	// instancio clase
	public static  Operaciones misOperaciones = new Operaciones();
	// fn istancion clase
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int opcion=1;
		
		
		
	
		
		
		 
		 
		 
		 
		 while (opcion != 0) {
			 
			 
			 
				
			  opcion =Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opcion:"));
			
			
			 
			 switch(opcion) {
			 
			 
			 
			 
			 
			 case 1:
				 
				 
			
				 
				 String nombre="aaljajo";
				 double altura=20;
				 double peso=10;
				 
				 
				 
				 
				 
				 
				 
				 
				 misOperaciones.crearPersona(nombre,altura,peso);
				 
				 JOptionPane.showMessageDialog(null,"agrego datos");

		 
				 break;
				 
			 
			 
				 
				 
		 case 2:
				 


			 misOperaciones.mostrarDatos();
			 
			 JOptionPane.showMessageDialog(null,"muestro datos"+misOperaciones.mostrarDatos());

				 
				 break;
				 
				 
				 
		 case 3:
			 
			 
			 
			 
			 
 			 
			 break;
			 
			 
			 }// fin case 
			 
			 
			 
			 
		 }
		 
		 
		 
		
		

		
		
		
		

	}// fn main 

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}// fin clase
