package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.DefaultListModel;

public class Kanporaketa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1437484329969682130L;
	private ArrayList<Talde> denboraldiTalde = new ArrayList<Talde>();
	private ArrayList<Partida> finalLaurdenak = new ArrayList<Partida>();
	private ArrayList<Partida> semifinalak = new ArrayList<Partida>();
	private Partida pos34;
	private Partida finala;
	private String izena;
	private String hasieraData;
	private String amaieraData;
	private boolean isLaurdenfinished = false;
	private boolean isSemifinished = false;
	private boolean is34finished = false;
	private boolean isFinalfinished = false;

	public Kanporaketa(DefaultListModel<Talde> taldeak, String hasieraData, String amaieraData) {
		izena = hasieraData + " - " + amaieraData + " Kanporaketa";
		ArrayList<Integer> randomNumber = new ArrayList<Integer>();
		ArrayList<Integer> existingNumbers = new ArrayList<Integer>();
		int num;
		existingNumbers.add(0);
		existingNumbers.add(1);
		existingNumbers.add(2);
		existingNumbers.add(3);
		existingNumbers.add(4);
		existingNumbers.add(5);
		existingNumbers.add(6);
		existingNumbers.add(7);
		Random rand = new Random();

		for (int i = 7; i >= 0; i--) {
			num = rand.nextInt(i + 1);
			randomNumber.add(existingNumbers.get(num));
			existingNumbers.remove(num);
		}
		
		ArrayList<Epaile> epaileak = gordeIrakurri.irakurriEpaile("epaile.txt");
		num = epaileak.size();

		Partida partida1 = new Partida(taldeak.get(randomNumber.get(0)), taldeak.get(randomNumber.get(1)), epaileak.get(rand.nextInt(num)));
		Partida partida2 = new Partida(taldeak.get(randomNumber.get(2)), taldeak.get(randomNumber.get(3)), epaileak.get(rand.nextInt(num)));
		Partida partida3 = new Partida(taldeak.get(randomNumber.get(4)), taldeak.get(randomNumber.get(5)), epaileak.get(rand.nextInt(num)));
		Partida partida4 = new Partida(taldeak.get(randomNumber.get(6)), taldeak.get(randomNumber.get(7)), epaileak.get(rand.nextInt(num)));

		finalLaurdenak.add(partida1);
		finalLaurdenak.add(partida2);
		finalLaurdenak.add(partida3);
		finalLaurdenak.add(partida4);

	}

	public void sartuLaurdenak (String emaitza1, String emaitza2, String emaitza3, String emaitza4, String emaitza5, 
			String emaitza6, String emaitza7, String emaitza8) {
		finalLaurdenak.get(0).setPuntuakA(emaitza1);
		finalLaurdenak.get(0).setPuntuakB(emaitza2);
		finalLaurdenak.get(1).setPuntuakA(emaitza3);
		finalLaurdenak.get(1).setPuntuakB(emaitza4);
		finalLaurdenak.get(2).setPuntuakA(emaitza5);
		finalLaurdenak.get(2).setPuntuakB(emaitza6);
		finalLaurdenak.get(3).setPuntuakA(emaitza7);
		finalLaurdenak.get(3).setPuntuakB(emaitza8);
		
		ArrayList<Talde> aukeratuak1 = new ArrayList<Talde>();
		if (Integer.parseInt(finalLaurdenak.get(0).getPuntuakA()) > Integer.parseInt(finalLaurdenak.get(0).getPuntuakB())) {
			aukeratuak1.add(finalLaurdenak.get(0).getTaldeA());
		} else {
			aukeratuak1.add(finalLaurdenak.get(0).getTaldeB());
		}
		if (Integer.parseInt(finalLaurdenak.get(1).getPuntuakA()) > Integer.parseInt(finalLaurdenak.get(1).getPuntuakB())) {
			aukeratuak1.add(finalLaurdenak.get(1).getTaldeA());
		} else {
			aukeratuak1.add(finalLaurdenak.get(1).getTaldeB());
		}
		
		ArrayList<Talde> aukeratuak2 = new ArrayList<Talde>();
		
		if (Integer.parseInt(finalLaurdenak.get(2).getPuntuakA()) > Integer.parseInt(finalLaurdenak.get(2).getPuntuakB())) {
			aukeratuak2.add(finalLaurdenak.get(2).getTaldeA());
		} else {
			aukeratuak2.add(finalLaurdenak.get(2).getTaldeB());
		}
		
		if (Integer.parseInt(finalLaurdenak.get(3).getPuntuakA()) > Integer.parseInt(finalLaurdenak.get(3).getPuntuakB())) {
			aukeratuak2.add(finalLaurdenak.get(3).getTaldeA());
		} else {
			aukeratuak2.add(finalLaurdenak.get(3).getTaldeB());
		}
		ArrayList<Epaile> epaileak = gordeIrakurri.irakurriEpaile("epaile.txt");
		Random rand = new Random();
		int num = epaileak.size();
		
		Partida partida5 = new Partida(aukeratuak1.get(0), aukeratuak1.get(1), epaileak.get(rand.nextInt(num)));
		Partida partida6 = new Partida(aukeratuak2.get(0), aukeratuak2.get(1), epaileak.get(rand.nextInt(num)));
		
		semifinalak.add(partida5);
		semifinalak.add(partida6);
		
		isLaurdenfinished = true;
	}

	public void sartuSemi(String emaitza1, String emaitza2, String emaitza3, String emaitza4) {
		semifinalak.get(0).setPuntuakA(emaitza1);
		semifinalak.get(0).setPuntuakB(emaitza2);
		semifinalak.get(1).setPuntuakA(emaitza3);
		semifinalak.get(1).setPuntuakB(emaitza4);

		ArrayList<Talde> aukeratuak1 = new ArrayList<Talde>();
		ArrayList<Talde> aukeratuak2 = new ArrayList<Talde>();
		if (Integer.parseInt(semifinalak.get(0).getPuntuakA()) > Integer.parseInt(semifinalak.get(0).getPuntuakB())) {
			aukeratuak1.add(semifinalak.get(0).getTaldeA());
			aukeratuak2.add(semifinalak.get(0).getTaldeB());
		} else {
			aukeratuak1.add(semifinalak.get(0).getTaldeB());
			aukeratuak2.add(semifinalak.get(0).getTaldeA());
		}

		if (Integer.parseInt(semifinalak.get(1).getPuntuakA()) > Integer.parseInt(semifinalak.get(1).getPuntuakB())) {
			aukeratuak1.add(semifinalak.get(1).getTaldeA());
			aukeratuak2.add(semifinalak.get(1).getTaldeB());
		} else {
			aukeratuak1.add(semifinalak.get(1).getTaldeB());
			aukeratuak2.add(semifinalak.get(1).getTaldeA());
		}
		ArrayList<Epaile> epaileak = gordeIrakurri.irakurriEpaile("epaile.txt");
		Random rand = new Random();
		int num = epaileak.size();

		finala = new Partida(aukeratuak1.get(0), aukeratuak1.get(1), epaileak.get(rand.nextInt(num)));
		pos34 = new Partida(aukeratuak2.get(0), aukeratuak2.get(1), epaileak.get(rand.nextInt(num)));

		isSemifinished = true;
	}

	public void sartu34(String emaitza1, String emaitza2) {
		pos34.setPuntuakA(emaitza1);
		pos34.setPuntuakB(emaitza2);

		is34finished = true;
	}

	public void sartuFinal(String emaitza1, String emaitza2) {
		finala.setPuntuakA(emaitza1);
		finala.setPuntuakB(emaitza2);

		isFinalfinished = true;
	}

	public ArrayList<Talde> getDenboraldiTalde() {
		return denboraldiTalde;
	}

	public void setDenboraldiTalde(ArrayList<Talde> denboraldiTalde) {
		this.denboraldiTalde = denboraldiTalde;
	}

	public ArrayList<Partida> getFinalLaurdenak() {
		return finalLaurdenak;
	}

	public void setFinalLaurdenak(ArrayList<Partida> finalLaurdenak) {
		this.finalLaurdenak = finalLaurdenak;
	}

	public ArrayList<Partida> getSemifinalak() {
		return semifinalak;
	}

	public void setSemifinalak(ArrayList<Partida> semifinalak) {
		this.semifinalak = semifinalak;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getHasieraData() {
		return hasieraData;
	}

	public void setHasieraData(String hasieraData) {
		this.hasieraData = hasieraData;
	}

	public String getAmaieraData() {
		return amaieraData;
	}

	public void setAmaieraData(String amaieraData) {
		this.amaieraData = amaieraData;
	}

	public Partida getPos34() {
		return pos34;
	}

	public void setPos34(Partida pos34) {
		this.pos34 = pos34;
	}

	public Partida getFinala() {
		return finala;
	}

	public void setFinala(Partida finala) {
		this.finala = finala;
	}

	public boolean isLaurdenfinished() {
		return isLaurdenfinished;
	}

	public void setLaurdenfinished(boolean isLaurdenfinished) {
		this.isLaurdenfinished = isLaurdenfinished;
	}

	public boolean isSemifinished() {
		return isSemifinished;
	}

	public void setSemifinished(boolean isSemifinished) {
		this.isSemifinished = isSemifinished;
	}

	public boolean is34finished() {
		return is34finished;
	}

	public void setIs34finished(boolean is34finished) {
		this.is34finished = is34finished;
	}

	public boolean isFinalfinished() {
		return isFinalfinished;
	}

	public void setFinalfinished(boolean isFinalfinished) {
		this.isFinalfinished = isFinalfinished;
	}

	@Override
	public String toString() {
		return "Kanporaketa [denboraldiTalde=" + denboraldiTalde + ", finalLaurdenak=" + finalLaurdenak
				+ ", semifinalak=" + semifinalak + ", izena=" + izena + ", hasieraData=" + hasieraData
				+ ", amaieraData=" + amaieraData + "]";
	}

}
