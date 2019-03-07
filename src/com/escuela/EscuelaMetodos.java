package com.escuela;

import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;

public class EscuelaMetodos implements InterfaceEscuela {
	
	//Metodo que inicializa valores en 0 para poder luego incrementar con addAlumno()
	public void init(Map<String, Integer> hash) {
		for(Nacionalidades nacionalidades: Nacionalidades.values()) {
			hash.put(nacionalidades.toString(), 0);
		}
	}
		
	
	@Override
	public void addAlumno(Map<String, Integer> hash, String nacionalidad) {
		//no se puede inicializar en 1 o 0 por que en cada add reinicia el contador	
		//Añade la nacionalidad de un nuevo alumno
		Integer value = hash.get(nacionalidad); 
		if(hash.containsKey(nacionalidad)) {
			value++;
			hash.put(nacionalidad, value);				
		} else {
			System.out.println("Nacionalidad no encontrada");
		}
	}
	

	@Override
	public void showAll(Map<String, Integer> hash) {
		//Muestra el número de alumnos por nacionalidad
		Iterator iterator = hash.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();			
			System.out.println(alumnos.getKey() + ": " + alumnos.getValue());
		}	
	}

	@Override
	public void showNacionalidad(Map<String, Integer> hash, String nacionalidad) {
		//Muestra el número de alumnos por nacionalidad y alumnos de esa nacionalidad 
		if(hash.containsKey(nacionalidad)) {
			System.out.println(nacionalidad + ": " + hash.get(nacionalidad));
		}else {
			System.out.println("Nacionalidad no encontrada");
		}
	}

	@Override
	public void cuantos(Map<String, Integer> hash) {		
		//Muestra cuantas nacionalidades diferentes hay en la escuela
		Iterator iterator = hash.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();
			System.out.println(alumnos.getKey());
		}
		
	}

	@Override
	public void borra(Map<String, Integer> hash, String nacionalidad) {
		//Borra la nacionalidad
		if(hash.containsKey(nacionalidad)) {
			//hash.remove(nacionalidad);
			//Si se borra despues no puede ser aññadida a no ser encontrada como key
			hash.put(nacionalidad, 0);
		}else {
			System.out.println("Nacionalidad no encontrada");
		}		
	}
	
	public void texto() {
		System.out.println("Que desea hacer: \n"
				+ " 1: Añade la nacionalidad de un nuevo alumno \n "
				+ "2: Ver el número de alumnos por nacionalidad \n "
				+ "3: Ver el numero de alumnos de una nacionalidad \n "
				+ "4: Ver las nacionalidades de la escuela \n "
				+ "5: Borra una nacionalidad");
	}
	
	public void queNacionalidad() {
		System.out.println("Que nacionalidad: \n"
				+ " 1: Mexicana \n "
				+ "2: Estadounidense \n "
				+ "3: Brasileno \n "
				+ "4: Peruano");
	}
	
	
	public void escogerMetodo(Map<String, Integer> hash) {
		texto();
		Scanner sc = new Scanner(System.in); 
		switch(sc.nextInt()){
			case(1):
				queNacionalidad();
				Scanner sc1 = new Scanner(System.in);
				switch(sc1.nextInt()){
					case(1):
						addAlumno(hash, Nacionalidades.MEXICANA.toString());
						break;
					case(2):
						addAlumno(hash, Nacionalidades.ESTADOUNIDENSE.toString());
						break;
					case(3):
						addAlumno(hash, Nacionalidades.BRASILENO.toString());
						break;
					case(4):
						addAlumno(hash, Nacionalidades.PERUANO.toString());
						break;	
					default:
						System.out.println("Opción no encontrada");
						break;
				}	
				sc1.close();
				break;
			
			case(2):
				showAll(hash);
				break;
			
			case(3):
				queNacionalidad();
				Scanner sc2 = new Scanner(System.in);
				switch(sc2.nextInt()){
					case(1):
						showNacionalidad(hash, Nacionalidades.MEXICANA.toString());					
						break;
					case(2):
						showNacionalidad(hash, Nacionalidades.ESTADOUNIDENSE.toString());	
						break;
					case(3):
						showNacionalidad(hash, Nacionalidades.BRASILENO.toString());	
						break;
					case(4):
						showNacionalidad(hash, Nacionalidades.PERUANO.toString());	
						break;	
					default:
						System.out.println("Opción no encontrada");
						break;
				}
				sc2.close();
				break;
			
			case(4):
				cuantos(hash);
				break;
				
			case(5):
				queNacionalidad();
				Scanner sc3 = new Scanner(System.in);
				switch(sc3.nextInt()){
					case(1):
						borra(hash, Nacionalidades.MEXICANA.toString());				
						break;
					case(2):
						borra(hash, Nacionalidades.ESTADOUNIDENSE.toString());	
						break;
					case(3):
						borra(hash, Nacionalidades.BRASILENO.toString());	
						break;
					case(4):
						borra(hash, Nacionalidades.PERUANO.toString());	
						break;
					default:
						System.out.println("Opción no encontrada");
						break;
				}
				sc3.close();
				break;
			default:
				System.out.println("Opción no encontrada");
				break;				
		}
     sc.close();   
	}
	
}
