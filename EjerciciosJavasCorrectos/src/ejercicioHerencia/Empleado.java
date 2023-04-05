package ejercicioHerencia;

public class Empleado extends Persona {
	
	private String empresa ;
	private int añosTrabajados;
	
	
	public Empleado() {
		
	}
	
	
	public Empleado(String nombre, String apellidos, int edad, String empresa, int añosTrabajados) {
		
		// para que sea el padre quien use el constructor , los atributis  de persona
		
		super(nombre,apellidos,edad);
		setEmpresa(empresa);
		setAñosTrabajados(añosTrabajados);
		
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public int getAñosTrabajados() {
		return añosTrabajados;
	}


	public void setAñosTrabajados(int añosTrabajados) {
		this.añosTrabajados = añosTrabajados;
	}
	
// sobreescribir el metodo devolverNombreCompleto
//	
//	@Override
//	public String devolverNombreCompleto() {
//		return getName() + " " + getApellidos() + " " + getEmpresa() ;
//	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}
