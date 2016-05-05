package domaci.zad2;

public class Artikal {
		//	Modelovati entitet Artikal. Napraviti test klasu za rad sa artiklima. Lista artikla se kreira i ispisuje.  
		//	Napraviti test klasu. Test podaci su:
		//	s01|Coko plazma|Bambi|85.30|akcija
		//	s02|Smoki|Stark|55.00|nije na akciji
		//	s03|Cipsi|Marbo|115.20|nije na akciji
		//	s04|Krem Bananica|Stark|11.00|akcija
	protected String sifraProizvoda;
	protected String imeProizvoda;
	protected String proizvodjac;
	protected double cena;
	protected boolean akcija = false;
	
	public Artikal(String sifraProizvoda, String imeProizvoda, String proizvodjac, double cena, boolean akcija) {
		super();
		this.sifraProizvoda = sifraProizvoda;
		this.imeProizvoda = imeProizvoda;
		this.proizvodjac = proizvodjac;
		this.cena = cena;
		this.akcija = akcija;
	}

	public Artikal() {

	}
	
	public Artikal(Artikal artikal) {
		sifraProizvoda = artikal.sifraProizvoda;
		imeProizvoda = artikal.imeProizvoda;
		proizvodjac = artikal.proizvodjac;
		cena = artikal.cena;
		akcija = artikal.akcija;
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		if(akcija == true)
			return sifraProizvoda + "|" + imeProizvoda + "|" + proizvodjac + "|" + cena + "|na akciji";
		else
			return sifraProizvoda + "|" + imeProizvoda + "|" + proizvodjac + "|" + cena + "|nije na akciji";
		
	}
	
}
