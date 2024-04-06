package ar.edu.unju.fi.main;

import ar.edu.unju.fi.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola mundo");
		
		// creando el objeto o instanciar eun ibjeto de tipo persona
		//Persona ariel = new Persona("Ariel Martinez");
		
		Persona prueba = new Persona();
		
		prueba.asignarNombre("Ariel Martinez");
		
		prueba.mostrarDatos();
		
		
	}

}
