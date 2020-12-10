package com.clearminds.lhmm.model;

public class Persona {
	
	private String nombre;
	private int edad;
	private String pais;
	
	public Persona(String nombre, int edad, String pais) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", pais=" + pais + "]";
	}
	
	
	
	
	
	
	
	

}
