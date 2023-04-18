package ejercicioHerencia;

public class Principal {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// creas a una persona sin datos 
		Persona p1 = new Persona();
		
		
		// se usa el set para ponerle el nombre , aopellidos y edad , que seria los atributos en la clase persona 
		 p1.setName("Pedro");
		 p1.setApellidos("Garre");
		 p1.setEdad(37);
		 
		 
	
		// un objeto persona con datos 
	    Persona p2 = new Persona("llenly", "lisaso", 37);
	    
	    //objeto empleado 
	    Empleado  e1 = new Empleado(p2.getName(), p2.getApellidos(),  p2.getEdad(),  " Neoris" , 10);
	    
	    System.out.println(p2.toString());
	    
	    System.out.println("persona " + p2.devolverNombreCompleto());
		
	    System.out.println(" empleado " + e1.devolverNombreCompleto());
	    
	    
	    // esto es un casteo , pasamos un empleado para que sea persona 
	    Persona p3 = (Persona) e1.clone();
	    
	    // llamar el metodo creado en el mai devuelve nombre completo 
	    
	    System.out.println(" copia de empleado "+ p3.devolverNombreCompleto());
	    
	}

}
