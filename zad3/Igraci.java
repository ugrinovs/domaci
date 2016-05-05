package domaci.zad3;

public class Igraci {
	protected String sifra;
	protected String imeIPrezime;
	protected String Klub;
	
	
	
	
	public Igraci(String sifra, String imeIPrezime, String klub) {
		this.sifra = sifra;
		this.imeIPrezime = imeIPrezime;
		Klub = klub;
	}

	public Igraci() {

	}

	public boolean isti(Igraci igrac){
		boolean retVal = false;
		if(Klub.equals(igrac.Klub))
			retVal = true;
		return retVal;
		
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		return "\tBroj: " + sifra + " | Ime i Prezime: " + imeIPrezime + " | Klub: " + Klub; 
	}
}
