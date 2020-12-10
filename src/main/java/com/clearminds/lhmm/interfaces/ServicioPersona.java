package com.clearminds.lhmm.interfaces;

import com.clearminds.lhmm.model.Persona;

public interface ServicioPersona {
	
	public boolean insertar(Persona persona);
	public boolean actualizar(Persona persona);
	public boolean eliminar(Persona persona);

}
