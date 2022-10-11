package comunicacion;

public class Alfabeto{

private String letras;
private String interpretacion;

	
	public Alfabeto(String letras, String interpretacion) {
	this.letras = letras;
	this.interpretacion = interpretacion;
	setLetras(letras);
	setInterpretacion(interpretacion);
}
	// Setters
	public void setLetras(String letras) {
		this.letras = letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	// Getters 
	public String getletras() { 
		return letras;
		}
	public String getInterpretacion() {
		return interpretacion;
	}
	// Methods
	
	public int cantidadletras(String letras) {
		return letras.length();
}
	public String interpretacion() {
		return interpretacion;
}
	public String toString() {
		return "a" + "b" + "c" + "d" + "e" + "f" + "g" +" h" + "i" + "j" + "k" + "l" + "m" + "n" + "ñ" + "o" +"p" +"q" + "r" +"s" + "t" + "u" + "v" + "w" + "y" + "z";
		
}
}
