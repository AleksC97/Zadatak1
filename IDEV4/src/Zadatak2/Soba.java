package Zadatak2;

public class Soba {
	private int brKreveta;
	private int brSobe;
	private double cena;
	private boolean zazeta;
		
	public Soba() {
			super();
			brKreveta=0;
			brSobe=0;
			cena=0;
			zazeta= false;
		}
	
	public Soba(int brKreveta, int brSobe, double cena, boolean zazeta) {
		super();
		this.brKreveta = brKreveta;
		this.brSobe = brSobe;
		this.cena = cena;
		this.zazeta = zazeta;
	}
	
	public int getBrKreveta() {
		return brKreveta;
	}
	
	public int getBrSobe() {
		return brSobe;
	}
	
	public double getCena() {
		return cena;
	}
	
	public boolean isZazeta() {
		return zazeta;
	}
	
	public void setBrKreveta(int brKreveta) {
		this.brKreveta = brKreveta;
	}
	
	public void setBrSobe(int brSobe) {
		this.brSobe = brSobe;
	}
	
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public void setZazeta(boolean zazeta) {
		this.zazeta = zazeta;
	}
	
	@Override
	public String toString() {
		return "Soba brKreveta " + brKreveta + ", brSobe " + brSobe + ", cena " + cena + ", zazeta " + zazeta;
	}
}
