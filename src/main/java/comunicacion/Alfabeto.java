package comunicacion;

public class Alfabeto extends Pictograma{

private String[] letras;
private String interpretacion;

	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
	this.letras = letras;
	this.interpretacion = interpretacion;
}
	// Setters
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	// Getters 
	public String getOrigen() {
		return "alfabeto griego, occidente";
	}
	public String[] getletras() { 
		return letras;
		}
	public String getInterpretacion() {
		return interpretacion;
	}
	// Methods
	
	public int cantidadLetras() {
		return 26;
}
	public String interpretacion() {
		return interpretacion;
}
<<<<<<< HEAD
	public String toString() {
		return ("A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z");		
=======
		public String toString() {
		return ("A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z");	
		
>>>>>>> 0dfe1306fe336d7527e6da64655eaeebe0b1ad92
}
}
