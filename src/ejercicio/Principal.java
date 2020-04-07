package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		Vivienda v1= new Vivienda("Casa",5);
		Vivienda v2= new Vivienda("Departamento",2);
		Vivienda v3= new Vivienda("Departamento",1);		
		
		Persona p1 = new Persona( 5, 2, "Masculino",v1);
		Persona p2 = new Persona(12, 1, "Femenino" ,v2);
		Persona p3 = new Persona(18, 3, "Femenino" ,v3);
		Persona p4 = new Persona(25, 2, "Femenino" ,v1);
		Persona p5 = new Persona(45, 1, "Masculino",v2);
		
		List<Persona> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		System.out.println("Desplegar un listado de todas las personas que tengan 2 hermanos.\n");
		lista.stream()
			.filter( p -> p.getNumHermanos() == 2 )
			.forEach(System.out::println);
		
		System.out.println("\nDesplegar un listado con todas las mujeres de la población.\n");
		lista.stream()
			.filter(p -> p.getSexo().equals("Femenino"))
			.forEach( System.out::println);
		
		System.out.println("\nMostar cuantos niños hay con edades de entre 3 y 12 años.\n");
		lista.stream()
			.filter(p -> p.getEdad()>=3 && p.getEdad()<=12)
			.forEach( System.out::println );
		
		System.out.println("\nDesplegar un listado con las personas que viven en un departamento y tienen 2 TVs.\n");
		lista.stream()
			.filter( p-> p.getVivienda().getTipoVivienda().equals("Departamento") )
			.filter( p-> p.getVivienda().getNumTvs() == 2 )
			.forEach(System.out::println);;
	}
	
	
}
