package ejercicio;

public class Vivienda {
	private String tipoVivienda;
	private int numTvs;
	
	public Vivienda(String tipoVivienda, int numTvs){
		this.tipoVivienda = tipoVivienda;
		this.numTvs = numTvs;
	}
	
	public String getTipoVivienda() {
		return tipoVivienda;
	}
	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}
	public int getNumTvs() {
		return numTvs;
	}
	public void setNumTvs(int numTvs) {
		this.numTvs = numTvs;
	}

	@Override
	public String toString() {
		return "Vivienda [tipoVivienda=" + tipoVivienda + ", numTvs=" + numTvs + "]";
	}
}
