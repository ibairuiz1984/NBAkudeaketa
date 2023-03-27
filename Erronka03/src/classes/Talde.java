package classes;

import java.io.Serializable;

import javax.swing.DefaultListModel;

public class Talde implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6903505630410120499L;
	private String izena;
	private String kodea;
	private String taldearenSedea;
	private DefaultListModel<Taldekide> jokalariak;
	private DefaultListModel<Taldekide> koordinatzaileak;
	private DefaultListModel<Taldekide> entrenatzaileak;
	private DefaultListModel<Taldekide> fisioak;

	public Talde(String izena, String kodea, String taldearenSedea, DefaultListModel<Taldekide> jokalariak,
			DefaultListModel<Taldekide> koordinatzaileak, DefaultListModel<Taldekide> entrenatzaileak,
			DefaultListModel<Taldekide> fisioak) {
		this.izena = izena;
		this.kodea = kodea;
		this.taldearenSedea = taldearenSedea;

		this.jokalariak = new DefaultListModel<Taldekide>();
		this.koordinatzaileak = new DefaultListModel<Taldekide>();
		this.entrenatzaileak = new DefaultListModel<Taldekide>();
		this.fisioak = new DefaultListModel<Taldekide>();

		this.jokalariak = jokalariak;
		this.entrenatzaileak = entrenatzaileak;
		this.fisioak = fisioak;
		this.koordinatzaileak = koordinatzaileak;
	}

	// Metodo honek jokalari bat taldeko jokalarien zerrendatik kentzen du.
	public void rmvJokalariak(Taldekide jokalaria) {
		this.jokalariak.removeElement(jokalaria);
	}

	// Metodo honekJokalari bat gehitu dio taldeari.
	public void addJokalariak(Taldekide jokalaria) {
		this.jokalariak.addElement(jokalaria);
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getKodea() {
		return kodea;
	}

	public void setKodea(String kodea) {
		this.kodea = kodea;
	}

	public String getTaldearenSedea() {
		return taldearenSedea;
	}

	public void setTaldearenSedea(String taldearenSedea) {
		this.taldearenSedea = taldearenSedea;
	}

	public DefaultListModel<Taldekide> getJokalariak() {
		return jokalariak;
	}

	public void setJokalariak(DefaultListModel<Taldekide> jokalariak) {
		this.jokalariak = jokalariak;
	}

	public DefaultListModel<Taldekide> getKoordinatzaileak() {
		return koordinatzaileak;
	}

	public void setKoordinatzaileak(DefaultListModel<Taldekide> koordinatzaileak) {
		this.koordinatzaileak = koordinatzaileak;
	}

	public DefaultListModel<Taldekide> getEntrenatzaileak() {
		return entrenatzaileak;
	}

	public void setEntrenatzaileak(DefaultListModel<Taldekide> entrenatzaileak) {
		this.entrenatzaileak = entrenatzaileak;
	}

	public DefaultListModel<Taldekide> getFisioak() {
		return fisioak;
	}

	public void setFisioak(DefaultListModel<Taldekide> fisioak) {
		this.fisioak = fisioak;
	}

	@Override
	public String toString() {
		return izena;
	}

}
