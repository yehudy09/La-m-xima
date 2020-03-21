package logico;

import java.util.ArrayList;

public class Equipo {
	private ArrayList <Jugador> misJugadores;
	public String nombreEquipo; 
	public String id; // Boston el id seria "BOS", Yankees "NYY"
    public String estadio; //Nombre del estadio 
    public String trainer;
    private float cantJuegos; 
    private float ganados; 
    private Season miSeason;

	private float perdidos;
    
	public Equipo(String nombreEquipo, String id, String estadio, String trainer, float cantJuegos,float ganados,float perdidos) {
		misJugadores = new ArrayList <Jugador>();
		this.nombreEquipo = nombreEquipo;
		this.id = id;
		this.estadio = estadio;
		this.trainer = trainer;
		this.cantJuegos = 0; 
		this.ganados = 0; 
		this.perdidos = 0;
		
	}
	public ArrayList<Jugador> getJugadores() {
		return misJugadores;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public String getId() {
		return id;
	}
	public String getEstadio() {
		return estadio;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.misJugadores = jugadores;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public float getCantJuegos() {
		return cantJuegos;
	}
	public void setCantJuegos(float cantJuegos) {
		this.cantJuegos = cantJuegos;
	} 
    public float getGanados() {
		return ganados;
	}
	public float getPerdidos() {
		return perdidos;
	}
	public void setGanados(float ganados) {
		this.ganados = ganados;
	}
	public void setPerdidos(float perdidos) {
		this.perdidos = perdidos;
	}
	public  void insertarJugador(Jugador aux) {  
		misJugadores.add(aux);  
	}
	//Calcular total Hits del equipo
    public float totalHits() { 
    	float cantHits = 0;
	for (Jugador auxJugador : misJugadores) {
		if(auxJugador instanceof jugadorPosicion) { 
			cantHits += ((jugadorPosicion) auxJugador).getHits();
		}
	}
	return cantHits;
} 
    //Calcular total de turnos del equipo
    public float totalTurnos() { 
    	float cantTurnos = 0;
	for (Jugador auxJugador : misJugadores) {
		if(auxJugador instanceof jugadorPosicion) { 
			cantTurnos += ((jugadorPosicion) auxJugador).getTurnos();
		}
	}
	return cantTurnos;
} 
//Calcular total Carreras del equipo
    public float totalCarreras() { 
    	float cantCarreras = 0;
	for (Jugador auxJugador : misJugadores) {
		if(auxJugador instanceof jugadorPosicion) { 
			cantCarreras += ((jugadorPosicion) auxJugador).getCarrerasAnotadas();
		}
	}
	return cantCarreras;
} 
    //Calcular efectividad individual de un jugador del equipo.
    public float efectividad (String noJugador) {
 	   float era=0;
Jugador auxJugador = buscarJugadorByDorsal(noJugador);
 if(auxJugador instanceof Pitcher) { 
 era = ( (((Pitcher) auxJugador).getCarrerasLimpias() *9 ) / (((Pitcher) auxJugador).getInningsLanzados())  );
 } return era;  }
 
//Total innings lanzados del equipo    
    public float totalInnings() { 
    	float cantInnings = 0;
	for (Jugador auxJugador : misJugadores) {
		if(auxJugador instanceof Pitcher) { 
			cantInnings += ((Pitcher) auxJugador).getInningsLanzados();
		}
	}
	return cantInnings;
} 
       
 //BuscarJugador por # de chaqueta del equipo
	 public Jugador buscarJugadorByDorsal (String noDorsal) { 
    	 boolean encontrado = false; 
    	Jugador auxJugador =null;
    	 int i=0;
    	 while(i<misJugadores.size() && !encontrado) {
    		 if(misJugadores.get(i).getNoDorsal().equalsIgnoreCase(noDorsal)) {
    			 auxJugador = misJugadores.get(i);
    			 encontrado = true;  } 
    		 i++; }	return  auxJugador;
	 }
 //Cantidad Juegos Ganados equipo 
	 public float totalGanados() {
	    	float cantGanados = 0;
	    	for (Jugador auxJugador : misJugadores) {
	    		if(auxJugador instanceof Pitcher) { 
	    			cantGanados += ((Pitcher) auxJugador).getJuegoGanado();
	    		}
	    	}
	    	return cantGanados;
	 }
 // Cantidad Juegos perdidos equipo 
	 public float totalPerdidos() {
	    	float cantPerdidos = 0;
	    	for (Jugador auxJugador : misJugadores) {
	    		if(auxJugador instanceof Pitcher) { 
	    			cantPerdidos += ((Pitcher) auxJugador).getJuegoPerdido();
	    		}	}   
	    	return cantPerdidos;   }
	 // Cantidad Ponches por equipo 
	 public float totalPonches() {
	    	float cantPonches = 0;
	    	for (Jugador auxJugador : misJugadores) {
	    		if(auxJugador instanceof Pitcher) { 
	    			cantPonches += ((Pitcher) auxJugador).getPonches();
	    		}	}   
	    	return cantPonches;   }
	 
	 // Cantidad Ponches por equipo 
	 public float totalBasePorBolas() {
	    	float cantBB = 0;
	    	for (Jugador auxJugador : misJugadores) {
	    		if(auxJugador instanceof Pitcher) { 
	    			cantBB += ((Pitcher) auxJugador).getBB();
	    		}	}   
	    	return cantBB;   }
}



