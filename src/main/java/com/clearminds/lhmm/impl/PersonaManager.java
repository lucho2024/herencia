package com.clearminds.lhmm.impl;

import com.clearminds.lhmm.excepciones.InstanceException;
import com.clearminds.lhmm.interfaces.ServicioPersona;
import com.clearminds.lhmm.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException {
		
		try {
			Class<?> clase =Class.forName("com.clearminds.lhmm.impl.ServicioPersonaBDD");
			serv=(ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		
		
		
	}

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	

}
