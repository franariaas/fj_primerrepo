package empleado;

public class Empleado {
	String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
}
