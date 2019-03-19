package Zadatak2;

public class Program {

	public static void main(String[] args) {
		Hotel sobaH = new Hotel();
		sobaH.dodajSobu(new Soba(5, 2, 300, true));
		sobaH.dodajSobu(new Soba(5, 3, 400, false));
		sobaH.dodajSobu(new Soba(5, 4, 500, false));
		
		System.out.println(sobaH.toString());
	}

}
