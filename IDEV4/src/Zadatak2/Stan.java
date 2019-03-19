package Zadatak2;

public class Stan extends Smestaj{
	private Soba soba;
	private int brSprata;
	
	public Stan() {
		soba=null;
		brSprata=0;
	}

	public Stan(String nazivSJ, String mesto, double procenatZarada, Soba soba, int brSprata) {
		super(nazivSJ, mesto, procenatZarada);
		this.soba = soba;
		this.brSprata = brSprata;
	}
	
	void setSoba(Soba s) {
		
	}
	
	@Override
	public double getPrhiodi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Stan soba " + soba + ", brSprata " + brSprata;
	}
	
}
