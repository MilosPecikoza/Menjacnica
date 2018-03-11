package intefejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface interfejsZaMenjacnicu {
	public void dodavanjeKursa(Valuta v);
	public void brisanjeKursa(Valuta v);
	public Valuta vracanjeKursa(String naziv, GregorianCalendar datum);
}
