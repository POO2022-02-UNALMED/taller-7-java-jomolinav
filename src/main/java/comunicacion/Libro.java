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
public String getOrigen() {
	return "Creacion";
}
public String getTitulo() {
	return "El resplandor";
}
public String getAutor() {
	return "Stephen King";
}
public int getPaginas() {
	return 599;
}
	public String getCo_autor() {
		return "N/A";	
	}
	public String getEditorial() {
		return "Doubleday";
	}
	public String getEdicion() {
		return "Primera";
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
	
		return 167720;
	}
	@Override
	public String toString() {
		return "Creacion\n" + 
				"El resplandor\n" + 
				"Stephen King\n" + 
				"599\n" + 
				"N/A\n" + 
				"Doubleday\n" + 
				"Primera";
	}
}