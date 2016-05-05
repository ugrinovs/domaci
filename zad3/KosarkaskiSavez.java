package domaci.zad3;

public class KosarkaskiSavez {
	protected String sifraKluba;
	protected String nazivKluba;
	public KosarkaskiSavez(String sifraKluba, String nazivKluba) {
		this.sifraKluba = sifraKluba;
		this.nazivKluba = nazivKluba;
	}

	public KosarkaskiSavez() {
	}
	
	public KosarkaskiSavez(KosarkaskiSavez KSavez) {
		sifraKluba = KSavez.sifraKluba;
		nazivKluba = KSavez.nazivKluba;
	}
	
	
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		String ispis = "\t\t\tKlub: " + sifraKluba + " | Naziv: " + nazivKluba;
			return ispis;
		
	}

	
	
}
