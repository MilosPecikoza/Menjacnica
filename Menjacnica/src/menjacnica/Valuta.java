package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private double prodajni;
	private double kupovni;
	private double srednji;
	private GregorianCalendar datum;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null) throw new RuntimeException("Unesena vrijednost u naziv je null");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null) throw new RuntimeException("Unesena vrijednost u skraceniNaziv je null");
		this.skraceniNaziv = skraceniNaziv;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni <= 0) throw new RuntimeException("Unijeta je negativna vrijednost za prodajni kurs");
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni <= 0) throw new RuntimeException("Unijeta je negativna vrijednost za kupovni kurs");
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji <= 0) throw new RuntimeException("Unijeta je negativna vrijednost za srednji kurs");
		this.srednji = srednji;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum == null) throw new RuntimeException("Vrijednost datuma ne smije biti null");
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", prodajni=" + prodajni + ", kupovni="
				+ kupovni + ", srednji=" + srednji + ", datum=" + datum + "]";
	}
	
	
}
