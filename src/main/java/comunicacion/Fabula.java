package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
		
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super();
		this.ensenanza =ensenanza;
		this.interpretacion = interpretacion;
	}
	public String interpretacion() {
		return interpretacion;
	
	}
	// Getters
	public String getOrigen() {
		return "pensamiento";
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public String getEnsenanza() {
		return ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public String toString() {
		return getOrigen() + getTitulo() + getAutor() + getPaginas() + getEnsenanza() + "\n";
	}
	// Setters
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	// Abstract Methods
	public int palabrasTotales(int palabras) {
		
		return palabras * 2;
	}
	
}
