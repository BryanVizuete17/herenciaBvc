package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class ServicioPersonaBDD implements ServicioPersona {

	public boolean insertar(Persona persona) {
		
		System.out.println("insertado persona en la bdd"+ persona);
		return true;
	}

	public boolean actualizar(Persona persona) {

		System.out.println("actualizando la persona en la bdd"+ persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		
		System.out.println("eliminando la persona de la bdd "+ persona);
		return true;
	}


}
