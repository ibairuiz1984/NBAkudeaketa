package classes;

import java.io.Serializable;
import java.util.Objects;

public class Taldekide extends Pertsona implements Serializable{
	private String rola;
	private String kolegiatuZnb;
	
	public Taldekide (String nan, String izena, String abizena, String jaiotzeData, 
			String jatorrizkoHerria, String sexua, String rola){
		super(nan, izena, abizena, jaiotzeData, jatorrizkoHerria, sexua);
		this.rola = rola;
	}
	
	public Taldekide (String nan, String izena, String abizena, String jaiotzeData, 
			String jatorrizkoHerria, String sexua, Boolean fisio, String kolegiatuZnb){
		super(nan, izena, abizena, jaiotzeData, jatorrizkoHerria, sexua);
		this.kolegiatuZnb = kolegiatuZnb;
	}

	public String getRola() {
		return rola;
	}

	public void setRola(String rola) {
		this.rola = rola;
	}

	public String getKolegiatuZnb() {
		return kolegiatuZnb;
	}

	public void setKolegiatuZnb(String kolegiatuZnb) {
		this.kolegiatuZnb = kolegiatuZnb;
	}
	
	

	@Override
	public String toString() {
		return super.getIzena() + " " + super.getAbizena();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(kolegiatuZnb, rola);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taldekide other = (Taldekide) obj;
		return Objects.equals(super.getNan(), other.getNan());
	}
	
	public int compareTo(Taldekide A) {
		if(this.getIzena().compareTo(A.getIzena())==0) {
			return this.getAbizena().compareTo(A.getAbizena());
		} else {
			return this.getIzena().compareTo(A.getAbizena());
		}
	}

}
