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
	public String getFecha() {
		return fecha;
	}
	public String getPrimicia() {
		return primicia;
	
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
		return (palabras *60);
	}
	@Override
	public String toString() {
		return getOrigen() + getTitulo() + getAutor() + getPaginas() + getFecha() + getPrimicia() + "\n";
	}
	
	
	
}
