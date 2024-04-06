package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private Float peso;
	private String dni;
	private Float altura;
	
	public Persona() {
		// TODO Auto-generated constructor stub
		System.out.println("se ha creado el objeto de tipo Persona");
	}
	
	public Persona(String xNombre) {
		
		nombre = xNombre;
		
		//System.out.println("El nombre del objeto es "+nombre);
		
	}
	
	public void mostrarDatos() {
		
		System.out.println("el nombre del objeto es: "+nombre);
		
	}
	
	public void asignarNombre(String xnombre) {
		
		nombre = xnombre;
		
	}

}
