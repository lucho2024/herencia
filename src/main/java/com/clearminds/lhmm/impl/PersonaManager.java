package com.clearminds.lhmm.impl;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.clearminds.lhmm.excepciones.InstanceException;
import com.clearminds.lhmm.interfaces.ServicioPersona;
import com.clearminds.lhmm.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager(String tipo) throws InstanceException {
		
		try {
			String propiedad =leerPropiedad(tipo);
			if(propiedad!=null){
				Class<?> clase =Class.forName("com.clearminds.lhmm.impl."+propiedad);
				serv=(ServicioPersona)clase.newInstance();
			}else{
				//si la property viene vacia se conecta por defecto a la BDD
				Class<?> clase =Class.forName("com.clearminds.lhmm.impl.ServicioPersonaBDD");
				serv=(ServicioPersona)clase.newInstance();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		
		
		
	}
	
	public String leerPropiedad(String tipo){
		try {
			Properties p = new Properties();
			File f = new File("config.properties");
			p.load(new FileReader(f.getAbsolutePath()));
			System.out.println(p.getProperty(tipo));
			if(p.getProperty(tipo)!=null){
				return p.getProperty(tipo);	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
		
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
