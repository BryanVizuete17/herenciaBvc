package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class ServicioPersonaArchivos implements ServicioPersona {

	public boolean insertar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Insertando persona en un archivo"+ persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("actualizando persona en un archivo"+ persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando persona en un archivo"+ persona);
		return true;
	}

}
