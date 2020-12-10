package com.clearminds.lhmm.test;

import com.clearminds.lhmm.excepciones.InstanceException;
import com.clearminds.lhmm.impl.PersonaManager;
import com.clearminds.lhmm.model.Persona;

public class testManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			PersonaManager p = new PersonaManager("archivo");
			p.insertarPersona(new Persona("luis",20,"colombia"));
			PersonaManager p2 = new PersonaManager("BDD");
			p2.insertarPersona(new Persona("luis",20,"colombia"));
		} catch (InstanceException e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
		
		

	}

}
