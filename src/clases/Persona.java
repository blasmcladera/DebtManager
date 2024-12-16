package clases;

public class Persona {
	private String nombre;
	private String alias;
	
	public Persona(String nombre, String alias) {
		this.nombre = nombre;
		this.alias = alias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
}
