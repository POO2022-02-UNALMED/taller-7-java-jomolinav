package comunicacion;


public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super();
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	
	}

	// Getters
	public String getOrigen() {
		return "Pensamiento expansivo";
	}
	public String getTitulo() {
		return "Recomendador";
	}
	public String getAutor() {
		return "Alejandro";
	}
	public int getPaginas() {
		return 20;
	}
	public String getIdea() {
		return "Recomendar asignaturas";
	}
	public String[] getArgumentos() {
		return argumentos ;
	}
	public String getConclusion() {
		return "Se hace trabajo futuro";
	}
	public String getReferencias() {
		return "[1] Maquinaria";
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	// setters
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	// Methods
	public String interpretacion() {
		 return interpretacion;
	}
	// Abstract Methods
	@Override
	public int palabrasTotales(int palabras) {

		return palabras * 100;
	}
	@Override
	public String toString() {
		return "Pensamiento expansivo\n" + 
				"Recomendador\n" + 
				"Alejandro\n" + 
				"20\n" + 
				"Recomendar asignaturas\n" + 
				"2\n" + 
				"Se hace trabajo futuro\n" + 
				"[1] Maquinaria";
	}
}
