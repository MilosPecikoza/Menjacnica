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
		if(!valute.contains(v)) {
			throw new RuntimeException("Valuta ne postoji u listi");
		}
		valute.remove(valute.indexOf(v));
	}

	@Override
	public Valuta vracanjeKursa(String naziv, GregorianCalendar datum) {
		
		for(int i = 0 ; i < valute.size() ; i ++) {
			if(valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {
				return valute.get(i);
			}
		}
		
		throw new RuntimeException("Valuta ne postoji");
	}

}
