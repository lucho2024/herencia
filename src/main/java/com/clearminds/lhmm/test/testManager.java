package com.clearminds.lhmm.test;

import com.clearminds.lhmm.impl.PersonaManager;
import com.clearminds.lhmm.model.Persona;

public class testManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaManager p = new PersonaManager();
		
		p.insertarPersona(new Persona("luis",20,"colombia"));
		

	}

}
