package domaci.zad3;

public class Sudija {
	String sifra;
	String imeIPrezime;
	
	public Sudija(String sifra, String imeIPrezime){
		this.sifra = sifra;
		this.imeIPrezime = imeIPrezime;
	}
	
	public Sudija(){
		
	}
	
	public Sudija(Sudija sudija){
		sifra = sudija.sifra;
		imeIPrezime = sudija.imeIPrezime;
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		String ispis = "Broj: " + sifra + " | Ime i Prezime: " + imeIPrezime;
			return ispis;
		
	}
}
