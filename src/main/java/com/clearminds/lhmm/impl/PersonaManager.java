package com.clearminds.lhmm.impl;

import com.clearminds.lhmm.interfaces.ServicioPersona;
import com.clearminds.lhmm.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager() {
		
		serv = new ServicioPersonaBDD();
		
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
