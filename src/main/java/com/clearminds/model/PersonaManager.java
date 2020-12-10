package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() {
		serv = new ServicioPersonaArchivos();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	
}
