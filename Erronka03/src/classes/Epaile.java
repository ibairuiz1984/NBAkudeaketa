package classes;

import java.io.Serializable;
import java.util.Objects;

public class Epaile extends Pertsona implements Serializable {

	public Epaile(String nan, String izena, String abizena, String jaiotzeData, String jatorrizkoHerria, String sexua) {
		super(nan, izena, abizena, jaiotzeData, jatorrizkoHerria, sexua);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash();
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
		Epaile other = (Epaile) obj;
		return Objects.equals(super.getNan(), other.getNan());
	}

	@Override
	public String toString() {
		return super.getIzena() + " " + super.getAbizena();
	}

}
