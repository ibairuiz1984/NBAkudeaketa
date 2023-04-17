package classes;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Erabiltzailea implements Serializable {
	private static final long serialVersionUID = 3516386181612309905L;
	@Id
	@GeneratedValue
	private long idErabiltzaile;
	private String erabiltzaile;
	public boolean profila;
	private String pasahitza;
	private String taldea;

	public Erabiltzailea(String erabiltzailea, String pasahitza) {
		this.erabiltzaile = erabiltzailea;
		this.pasahitza = pasahitza;
		this.profila = true;
	}

	public Erabiltzailea(String erabiltzailea, String pasahitza, String taldea) {
		this.erabiltzaile = erabiltzailea;
		this.pasahitza = pasahitza;
		this.profila = false;
		this.taldea = taldea;
	}

	public String getErabiltzaile() {
		return erabiltzaile;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public boolean getProfila() {
		return profila;
	}

	public boolean isProfila() {
		return profila;
	}

	public boolean setProfila(boolean profila) {
		return this.profila = profila;
	}

	public String getTaldea() {
		return taldea;
	}

	public void setTaldea(String taldea) {
		this.taldea = taldea;
	}

	@Override
	public int hashCode() {
		return Objects.hash(erabiltzaile, pasahitza, profila, taldea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erabiltzailea other = (Erabiltzailea) obj;
		return Objects.equals(erabiltzaile, other.erabiltzaile);
	}

	@Override
	public String toString() {
		return "Erabiltzailea [idErabiltzaile=" + idErabiltzaile + ", erabiltzaile=" + erabiltzaile + ", profila="
				+ profila + ", pasahitza=" + pasahitza + ", taldea=" + taldea + "]";
	}

	

}
