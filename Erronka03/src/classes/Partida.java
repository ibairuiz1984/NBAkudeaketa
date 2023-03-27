package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Partida implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4244100771138071506L;
	private Map <Talde, String> partida = new HashMap <Talde, String>();
	private Epaile epailea;
	private Talde taldeA;
	private String puntuakA;
	private Talde taldeB;
	private String puntuakB;
	
	Partida (Talde taldeA, Talde taldeB, Epaile epailea){
		this.epailea = epailea;
		this.taldeA = taldeA;
		this.taldeB = taldeB;
		
		partida.put(taldeA, "");
		partida.put(taldeB, "");
	}

	public Map<Talde, String> getPartida() {
		return partida;
	}

	public void setPartida(Map<Talde, String> partida) {
		this.partida = partida;
	}

	public Talde getTaldeA() {
		return taldeA;
	}
	public String getTaldeAstring() {
		return taldeA.getKodea();
	}

	public void setTaldeA(Talde taldeA) {
		this.taldeA = taldeA;
	}

	public String getPuntuakA() {
		return puntuakA;
	}

	public void setPuntuakA(String puntuakA) {
		this.puntuakA = puntuakA;
	}

	public Talde getTaldeB() {
		return taldeB;
	}
	
	public String getTaldeBstring() {
		return taldeB.getKodea();
	}

	public void setTaldeB(Talde taldeB) {
		this.taldeB = taldeB;
	}

	public String getPuntuakB() {
		return puntuakB;
	}

	public void setPuntuakB(String puntuakB) {
		this.puntuakB = puntuakB;
	}

	public String getEpailea() {
		return epailea.toString();
	}

	public void setEpailea(Epaile epailea) {
		this.epailea = epailea;
	}

	@Override
	public String toString() {
		return taldeA + " VS " + taldeB;
	}
	
	

	
	
	
}
