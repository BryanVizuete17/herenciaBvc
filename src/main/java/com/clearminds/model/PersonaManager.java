package com.clearminds.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		//serv = new ServicioPersonaArchivos();
		try {
			String path = lecturaConfig("urlclase");
			Class<?> clase =Class.forName(path);
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
	
	public String lecturaConfig(String propiedad){
		String resultado = null;
		Properties p = new Properties();
		try {
			p.load(new FileReader("config.properties"));
			if(p.getProperty(propiedad) != null) {
				resultado = p.getProperty(propiedad);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
	
	
}
