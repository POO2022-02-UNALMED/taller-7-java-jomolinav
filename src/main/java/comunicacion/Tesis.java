package comunicacion;

import java.util.ArrayList;

public class Tesis extends Escrito{
	private String idea;
	private ArrayList<String> argumento = new ArrayList<>();
	private String conclusion;
	private String referencias;
	private String interpretacion;
	private int argole = argumento.size();
	
	public Tesis(String idea,  ArrayList argumento, String conclusion, String referencias, String interpretacion) {
		super();
		this.idea = idea;
		this.argumento = argumento;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
		
	}
	
	public Tesis(String string, String string2, String string3, int i, String string4, String[] strings, String string5,
			String string6, String string7) {
		// TODO Auto-generated constructor stub
	}

	// Getters
	public String getIdea() {
		return idea;
	}
	public int getArgumento(ArrayList argumento) {
		return argole;
	}
	public String getConclusion() {
		return conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	// setters
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public void setArgumento(ArrayList argumento) {
		this.argumento = argumento;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
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
	public int palabrasTotales(int palabras) {

		return palabras * 5;
	}
	@Override
	public String toString() {
		return getOrigen() + getTitulo() + getAutor() + getPaginas() + getIdea() + getConclusion() + getReferencias() + "\n";
	}
}
