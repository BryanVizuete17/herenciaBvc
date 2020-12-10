package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager pm;
		try {
			pm = new PersonaManager();
			pm.insertarPersona(new Persona("Bryan", "Vizuete", "Cedula"));
		} catch (InstanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
