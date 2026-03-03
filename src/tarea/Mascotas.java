package tarea;

public abstract class Mascotas {

	// Atributos de la clase abstracta
	protected String nombrel;
	protected int edad;
	protected String estado;
	protected String fechanacimiento;

	// Constructor que usaremos despues para crear los animales
	public Mascotas(String nombrel, int edad, String estado, String fechanacimiento) {
		this.nombrel = nombrel;
		this.edad = edad;
		this.estado = estado;
		this.fechanacimiento = fechanacimiento;
	}

	// Getters y setters
	public String getNombrel() {
		return nombrel;
	}

	public void setNombrel(String nombrel) {
		this.nombrel = nombrel;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

}
