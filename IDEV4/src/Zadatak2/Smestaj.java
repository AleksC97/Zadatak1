package Zadatak2;

public abstract class Smestaj {
	private String nazivSJ;
	private String mesto;
	private double procenatZarada;
	
	public Smestaj() {
		nazivSJ="";
		mesto="";
		procenatZarada=0.1;
	}

	public Smestaj(String nazivSJ, String mesto, double procenatZarada) {
		super();
		this.nazivSJ = nazivSJ;
		this.mesto = mesto;
		this.procenatZarada = procenatZarada;
	}

	public String getNazivSJ() {
		return nazivSJ;
	}

	public String getMesto() {
		return mesto;
	}

	public double getProcenatZarada() {
		return procenatZarada;
	}

	public void setNazivSJ(String nazivSJ) {
		this.nazivSJ = nazivSJ;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public void setProcenatZarada(double procenatZarada) {
		this.procenatZarada = procenatZarada;
	}
	
	// abstraktna klasa
	public abstract double getPrhiodi();
			
}
