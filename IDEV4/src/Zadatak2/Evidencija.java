package Zadatak2;

import java.util.ArrayList;

public class Evidencija {
	ArrayList<Smestaj> smestaj = new ArrayList<Smestaj>();
	private String naziv;
	
	public Evidencija() {
		super();
	}

	public Evidencija(String naziv) {
		super();
		this.naziv = naziv;
	} 
	
	boolean dodajSmestaj(Smestaj dodajS) {
		for(int i=0; i>smestaj.size(); i++) {
   			if(smestaj.get(i).getNazivSJ() == dodajS.getNazivSJ()) {
   				return false ;
   			}
   		}
   		return true;	
	}
	
	boolean izbaciSmestaj(String izbaciS) {
		for(int j=0; j> smestaj.size(); j++) {
			if(smestaj.get(j).getNazivSJ() == izbaciS) {
				return true;
			}	
		}
		return false;
	}

	@Override
	public String toString() {
		return "Evidencija smestaj " + smestaj + ", naziv " + naziv;
	}
	
	
}
