package Zadatak1;
public class Krug implements Figura{
	private double poluprecnik;
	final double PI=3.14;
	public double getPoluprecnik() {
		return poluprecnik;
	}
	

	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}


	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	@Override
	public double getO() {
		// TODO Auto-generated method stub
		return 2*poluprecnik*PI;
	}

	@Override
	public double getP() {
		// TODO Auto-generated method stub
		return Math.pow(poluprecnik, 2)*PI;
	}

	@Override
	public String toString() {
		return "Krug je poluprecnika " + poluprecnik ;
	}

}
