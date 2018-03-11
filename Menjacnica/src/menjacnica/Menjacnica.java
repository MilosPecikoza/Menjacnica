package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import intefejs.interfejsZaMenjacnicu;

public class Menjacnica implements interfejsZaMenjacnicu{
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursa(Valuta v) {
		if(valute.contains(v))
				throw new RuntimeException("Valuta vec postoji");
		
		valute.add(v);
	}

	@Override
	public void brisanjeKursa(Valuta v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Valuta vracanjeKursa(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
