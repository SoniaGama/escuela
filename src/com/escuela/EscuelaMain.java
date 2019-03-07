package com.escuela;

import java.util.HashMap;
import java.util.Map;

public class EscuelaMain extends EscuelaMetodos {

	public static void main(String[] args) {
		/*
		 * Crea una clase Escuela que almacene la nacionalidad de los alumnos. 
		 * La clase tendrá los siguientes métodos:
		 * 
		 * addAlumno(String nacionalidad) //Añade la nacionalidad de un nuevo alumno
		 * 
		 * showAll( ) //Muestra el número de alumnos por nacionalidad
		 * 
		 * showNacionalidad(String nacionalidad) //Muestra la nacionalidad y el número e alumnos de esa nacionalidad 
		 * 
		 * cuantos( ) //muestra cuantas nacionalidades diferentes hay en la escuela 
		 * 
		 * borra(String nacionalidad) //borra la nacionalidad
		 */
		
		//TreeSet<Integer> treeSet = new TreeSet<Integer>();
		//Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		Map<String, Integer> alumnosNacionalidad = new HashMap<String, Integer>();
		EscuelaMetodos metodo = new EscuelaMetodos();
		
		
		
		//init()-Metodo que inicializa valores en 0 para poder luego incrementar con addAlumno()
		metodo.init(alumnosNacionalidad);				
		//metodo.escogerMetodo(alumnosNacionalidad);
		
		System.out.println("Metodo que inicializa valores en 0: \n" + alumnosNacionalidad + "\n");
		
		//addAlumno()-Añade la nacionalidad de un nuevo alumno	
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.MEXICANA.toString());	
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.MEXICANA.toString());		
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.MEXICANA.toString());
		
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.BRASILENO.toString());
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.BRASILENO.toString());
		
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.ESTADOUNIDENSE.toString());
		metodo.addAlumno(alumnosNacionalidad, "ESTADOUNIDENSE");
		
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.PERUANO.toString());	
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.PERUANO.toString());		
		metodo.addAlumno(alumnosNacionalidad, "PERUANO");
		
		//HashMap completo
		System.out.println("Nacionalidades añadidas: \n" + alumnosNacionalidad + "\n");
		
		//showAll()-Muestra el número de alumnos por nacionalidad
		System.out.println("Muestra el número de alumnos por nacionalidad:");
		metodo.showAll(alumnosNacionalidad);
		System.out.println("\n");
		
		//showNacionalidad()-Muestra el número de alumnos por nacionalidad y alumnos de esa nacionalidad 
		System.out.println("Muestra el número de alumnos de una nacionalidad:");
		metodo.showNacionalidad(alumnosNacionalidad, Nacionalidades.MEXICANA.toString());
		System.out.println("\n");

		//cuantos()-Muestra cuantas nacionalidades diferentes hay en la escuela
		System.out.println("Muestra cuantas nacionalidades diferentes hay en la escuela:");
		metodo.cuantos(alumnosNacionalidad);
		System.out.println("\n");
		
		//borra()-Borra la nacionalidad
		System.out.println("Borra (reinicia el contador en 0) la nacionalidad:");
		metodo.borra(alumnosNacionalidad, Nacionalidades.PERUANO.toString());
		System.out.println(alumnosNacionalidad + "\n");		
		
		//addAlumno()-Añade la nacionalidad de un nuevo alumno
		System.out.println("Añadiendo de nuevo la nacionalidad");
		metodo.addAlumno(alumnosNacionalidad, Nacionalidades.PERUANO.toString());	
		System.out.println(alumnosNacionalidad + "\n");
	}

}
