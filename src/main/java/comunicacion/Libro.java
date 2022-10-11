package comunicacion;

public class Libro extends Escrito{

private String co_autor;
private String editorial;
private String edicion;
private String interpretacion;

public Libro(String co_autor, String editorial,
		String edicion, String interpretacion) {
	this.co_autor = co_autor;
	this.editorial = editorial;
	this.edicion = edicion;
	this.interpretacion = interpretacion;
}
	// Getters
	public String getCo_autor() {
		return co_autor;	
	}
	public String getEditorial() {
		return editorial;
	}
	public String getEdicion() {
		return edicion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	// Setters
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	// Methods
	public int palabrasTotales() {
		return 0;
	}
	public String interpretacion() {
		return "Prueba";
	}
// Abstract Methods
	
	@Override
	int palabrasTotales(int palabras) {
	
		return palabras *2;
	}
	@Override
	public String toString() {
		return getOrigen() + getTitulo() + getAutor() + getPaginas() + getCo_autor() + getEditorial() +getEdicion() + "\n";
	}
}