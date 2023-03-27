package classes;

import java.io.Serializable;
import java.util.Objects;

public class Pertsona implements Serializable{
	private String nan;
	private String izena;
	private String abizena;
	private String jaiotzeData;
	private String jatorrizkoHerria;
	private String sexua;

	Pertsona(String nan, String izena, String abizena, String jaiotzeData, String jatorrizkoHerria, String sexua) {
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
		this.jaiotzeData = jaiotzeData;
		this.jatorrizkoHerria = jatorrizkoHerria;
		this.sexua = sexua;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getJaiotzeData() {
		return jaiotzeData;
	}

	public void setJaiotzeData(String jaiotzeData) {
		this.jaiotzeData = jaiotzeData;
	}

	public String getJatorrizkoHerria() {
		return jatorrizkoHerria;
	}

	public void setJatorrizkoHerria(String jatorrizkoHerria) {
		this.jatorrizkoHerria = jatorrizkoHerria;
	}

	public String getSexua() {
		return sexua;
	}

	public void setSexua(String sexua) {
		this.sexua = sexua;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizena, izena, jaiotzeData, jatorrizkoHerria, nan, sexua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertsona other = (Pertsona) obj;
		return Objects.equals(nan, other.nan);
	}
	
	public int compareTo(Pertsona A) {
		if (this.izena.compareTo(A.izena)==0) {
			return this.abizena.compareTo(A.abizena);
		} else {
			return this.izena.compareTo(A.izena);
		}
	}
	
	

}
