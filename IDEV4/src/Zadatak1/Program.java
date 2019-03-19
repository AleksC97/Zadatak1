package Zadatak1;
public class Program {

	public static void main(String[] args) {
		Pravougaonik pravougaonik = new Pravougaonik(5, 2);
		Krug krug= new Krug(5);
	
	System.out.println(pravougaonik.toString());
	System.out.println("Obim pravouganika je "+ pravougaonik.getO());
	System.out.println("Povrsina pravouganika je "+ pravougaonik.getP());
	
	System.out.println(krug.toString());
	System.out.println("Obim kruga je "+ krug.getO());
	System.out.println("Povrsina kruga je "+ krug.getP());
	}

}
