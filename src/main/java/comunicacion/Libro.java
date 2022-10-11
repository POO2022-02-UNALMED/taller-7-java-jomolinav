package comunicacion;

public class Libro extends Escrito{

protected  String co_autor;
protected String editorial;
protected String edicion;
protected  String interpretacion;

public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
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
	public String interpretacion() {
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
	
	// Methods
	public int palabrasTotales() {
		return 0;
	}
// Abstract Methods
	
	@Override
	public int palabrasTotales(int palabras) {
	
		return palabras *11980;
	}
	@Override
	public String toString() {
		return getOrigen() + getTitulo() + getAutor() + getPaginas() + getCo_autor() + getEditorial() +getEdicion() + "\n";
	}
}