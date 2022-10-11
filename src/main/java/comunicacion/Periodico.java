package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, 
			String interpretacion) {
		super();
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	// getters
	public String getOrigen() {
		return "Investigacion";
	}
	public String getTitulo() {
		return "Se encontro la solucion";
	}
	public String getAutor() {
		return "Colombiano";
	}
	public int getPaginas() {
		return 6;
	}
	public String getFecha() {
		return "20/12/2020";
	}
	public String getPrimicia() {
		return "Cura del covid";
	
	}
	// setters
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	// Methods
	public String interpretacion() {
		return interpretacion;
	}
	
	// Abstract Methods
	@Override
	public int palabrasTotales(int palabras) {
		return 8400;
	}
	@Override
	public String toString() {
		return getOrigen() + getTitulo() + getAutor() + getPaginas() + getFecha() + getPrimicia() + "\n";
	}
	
	
	
}
