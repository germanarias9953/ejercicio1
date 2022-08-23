package ejercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Operaciones {

	
	
	
	
	
	// declaro arraylist de objeto persona
	public Persona miPersona = new Persona("santiago", 1, 50);
	 // fn arreglo arraylist persona
	  
	  
	  
 
	  
	  
	  
	
	public Operaciones() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 
	
	
	public  void crearPersona(String nombre,double peso,double estatura) {
	
		Persona persona = new Persona(nombre, peso, estatura);
	
	}// 
	
	
	
	
	
	
	
	// mostrar datos 
	
	
	public  double mostrarDatos() {
 
		
		
		
		double operacion =miPersona.getPeso()/(miPersona.getEstatura()*miPersona.getEstatura());
		
		
		return operacion;
		 

	}// fn agregar persona 
	
	
	
	
 
	
	
	
	
	
	
	
	
}
