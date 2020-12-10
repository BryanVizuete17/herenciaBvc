package com.clearminds.model;

import java.io.FileReader;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		//serv = new ServicioPersonaArchivos();
		try {
			Properties p = new Properties();
			p.load(new FileReader("C:\\Users\\bvizuete\\Desktop\\tallersemillero\\herenciaBvc\\config.properties"));
			Class<?> clase =Class.forName(p.getProperty("urlclase"));
			serv=(ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	
}
