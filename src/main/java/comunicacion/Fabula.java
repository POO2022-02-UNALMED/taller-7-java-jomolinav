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
		return "La tortuga y la liebre";
	}
	public String getAutor() {
		return "Esopo";
	}
	public int getPaginas() {
		return 2;
	}
	public String getEnsenanza() {
		return "no se debe uno burlar de los demas, ni presumir o ser vanidoso";
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
