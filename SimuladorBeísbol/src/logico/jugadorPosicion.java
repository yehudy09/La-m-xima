package logico;

public class jugadorPosicion extends Jugador {
	private float hits; //ofensiva
	private float carrerasAnotadas;
	private float carrerasEmpujadas;
	private float basesRobadas; 
	private float turnos; //turnos al bate 
	private String posicion; //posicion a la defensiva.
	private Season miSeason;

public jugadorPosicion(String nombre, String noDorsal, float cantJuegos, float errores, String equipo,
			boolean lesionado, float altura, float peso, float hits,float carrerasAnotadas, float carrerasEmpujadas, float basesRobadas,
			float turnos, String posicion) {
		super(nombre, noDorsal, cantJuegos, errores, equipo, lesionado, altura, peso);
		this.hits = hits;
		this.carrerasAnotadas = carrerasAnotadas;
		this.carrerasEmpujadas = carrerasEmpujadas;
		this.basesRobadas = basesRobadas;
		this.turnos = turnos;
		this.posicion = posicion;
	}

public float getHits() {
	return hits;
}

public float getCarrerasEmpujadas() {
	return carrerasEmpujadas;
}

public float getBasesRobadas() {
	return basesRobadas;
}

public float getTurnos() {
	return turnos;
}

public String getPosicion() {
	return posicion;
}

public void setHits(float hits) {
	this.hits = hits;
}

public void setCarrerasEmpujadas(float carrerasEmpujadas) {
	this.carrerasEmpujadas = carrerasEmpujadas;
}

public void setBasesRobadas(float basesRobadas) {
	this.basesRobadas = basesRobadas;
}

public void setTurnos(float turnos) {
	this.turnos = turnos;
}

public void setPosicion(String posicion) {
	this.posicion = posicion;
}

public float getCarrerasAnotadas() {
	return carrerasAnotadas;
}

public void setCarrerasAnotadas(float carrerasAnotadas) {
	this.carrerasAnotadas = carrerasAnotadas;
}


public float promBateo() { 
     float avg;
	return avg = getHits()/getTurnos();
	
}




}
