package pruebas;

public class MiClase{
		
	private String nombre;
	private double monto;
			
	public MiClase(String nombre, double monto) {
		this.nombre=nombre;
		this.monto=monto;
	}
			
	public String getNombre() {
		return nombre;
	}
			
	public double getMonto() {
		return monto;
	}
			
	public void setMonto(double monto) {
		this.monto=monto;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", monto=" + monto + "]";
	}
}
