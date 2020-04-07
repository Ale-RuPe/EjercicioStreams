package ejercicio;

public class Persona {
	private int edad;
	private int numHermanos;
	private String sexo;
	private Vivienda vivienda;
	
	
	public Persona(int edad, int numHermanos, String sexo, Vivienda vivienda) {
		this.edad =edad;
		this.numHermanos= numHermanos;
		this.sexo=sexo;
		this.vivienda=vivienda;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumHermanos() {
		return numHermanos;
	}
	public void setNumHermanos(int numHermanos) {
		this.numHermanos = numHermanos;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Vivienda getVivienda() {
		return vivienda;
	}
	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", numHermanos=" + numHermanos + ", sexo=" + sexo + ", vivienda=" + vivienda
				+ "]";
	}
	
	
}
