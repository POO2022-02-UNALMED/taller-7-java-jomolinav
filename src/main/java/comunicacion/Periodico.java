package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String fecha, String primicia, 
			String interpretacion, int i, String string, String string2, String string3) {
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
	public String getInterpretacion() {
		return interpretacion;
	}
	// setters
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
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

		return palabras *10;
	}
	@Override
	public String toString() {
		return getOrigen() + getTitulo() + getAutor() + getPaginas() + getFecha() + getPrimicia() + "\n";
	}
	
	
	
}
