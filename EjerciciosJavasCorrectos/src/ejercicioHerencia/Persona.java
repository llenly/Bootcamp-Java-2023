package ejercicioHerencia;

public class Persona {
	
	// estos son los atributosl , que siempre deben ser private solo puede acceder desde persona 
	//o protected  lo  las clases que esten el mismo paquete pueeden acceder al mismo atrib
	
	private String nombre;
	private String apellidos;
    private int edad;
    
   // AQUI VA EL CONSTRUCTOR 
    // 
    public Persona() {
    	
    }
    
    public Persona ( String nombre , String apellidos, int edad) {
       //esto le asigna al los atributos el valor 
    	setName(nombre);
    	setApellidos(apellidos);
    	setEdad(edad);
    	
    }
    
    
    
   // esto son los metdos get y set
    
    //es una copia del objeto persona 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// crear una nueva persona y asignarle los mismo valores de la persona actual 
		Persona pnueva = new Persona();
		
		pnueva.setName(this.getName());
		pnueva.setApellidos(this.getApellidos());
		pnueva.setEdad(this.getEdad());
		
		
		return pnueva;
	}

	
	
	public String getName() {
		return nombre;
	}
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
    
   //esto es un metodo  
  public String devolverNombreCompleto() {
	  
	  return getName()+ " " + getApellidos();
  }
	
	

}
