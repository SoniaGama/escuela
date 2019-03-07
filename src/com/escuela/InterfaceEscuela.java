package com.escuela;

import java.util.Map;

public interface InterfaceEscuela {
	void addAlumno(Map<String, Integer> hash, String nacionalidad);
	void showAll(Map<String, Integer> hash);
	void showNacionalidad(Map<String, Integer> hash, String nacionalidad);
	void cuantos(Map<String, Integer> hash);
	void borra(Map<String, Integer> hash, String nacionalidad);	

}
