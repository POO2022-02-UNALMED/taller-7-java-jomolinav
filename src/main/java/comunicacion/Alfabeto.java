package comunicacion;

public class Alfabeto extends Pictograma{

private String letras;
private String interpretacion;

	
	public Alfabeto(String letras, String[] strings, String interpretacion) {
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
		return 26;
}
	public String interpretacion() {
		return interpretacion;
}
	public String toString() {
		return "A" + "B" + "C" + "D" + "E" + "F" + "G" +" H" + "I" + "J" + "K" + "L" + "M" + "N" + "O" +"P" +"Q" + "R" +"S" + "T" + "U" + "V" + "W" + "Y" + "Z";
		
}
}
