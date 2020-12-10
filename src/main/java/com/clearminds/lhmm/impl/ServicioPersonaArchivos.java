package com.clearminds.lhmm.impl;

import com.clearminds.lhmm.interfaces.ServicioPersona;
import com.clearminds.lhmm.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona{

	public boolean insertar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Insertando persona En un archivo : \n"+persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando persona En un archivo : \n"+persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("eliminando persona En un archivo : \n"+persona);
		return true;
	}

}
