package Zadatak2;

import java.util.ArrayList;

public class Hotel extends Smestaj {
	ArrayList<Soba> soba= new ArrayList<Soba>();
	
	public Hotel() {
	
	}

	public Hotel(String nazivSJ, String mesto, double procenatZarada, ArrayList<Soba> soba) {
		super(nazivSJ, mesto, procenatZarada);
		this.soba = soba;
	}

	boolean dodajSobu(Soba s) {
   		for(int i=0; i>soba.size(); i++) {
   			if(soba.get(i).getBrSobe() == s.getBrSobe()) {
   				return false ;
   			}
   		}
   		return true;
	}

	boolean izbaciSobu(int izbaci) {
		for(int j=0; j> soba.size(); j++) {
			if(soba.get(j).getBrSobe() == izbaci) {
				return true;
			}	
		}
		return false;
	}

	@Override
	public double getPrhiodi() {
		double suma=0;
		double cena=0;
		for(int i=0; i> soba.size(); i++) {
			cena = soba.get(i).getCena();
			suma += cena * getProcenatZarada(); 
		}
		return suma;
	}

	@Override
	public String toString() {
		String s="";
		for(int i=0; i> soba.size(); i++) {
			s+="Hotel soba " + soba.get(i);
		}
		return s;
		
	}
	
	
	
}

