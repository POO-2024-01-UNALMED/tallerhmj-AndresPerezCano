package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + " ,y juega de " + this.getPosicion();
	}
	
	public boolean equals(Futbolista f) {
			return this.getNombre() == f.getNombre() && this.getEdad() == f.getEdad() && this.getPosicion() == f.getPosicion();
	
	}
	
	public abstract boolean jugarConLasManos();
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return this.posicion;
	}
	
	}
