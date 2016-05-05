package domaci.zad3;


public class Utakmica {
	protected String klub1;
	protected String klub2;
	protected String datum;
	protected String vreme;
	protected String rezultat;
	protected String sifraSudije;
	protected int domacin;
	
	public Utakmica(String klub1, String klub2, String datum, String vreme, String rezultat, String sifraSudije, int domacin) {
		this.klub1 = klub1;
		this.klub2 = klub2;
		this.datum = datum;
		this.vreme = vreme;
		this.rezultat = rezultat;
		this.sifraSudije = sifraSudije;
		this.domacin = domacin;
	}
	
	public Utakmica(){
		
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		return "\t" + datum + " u " + vreme + " casova. Igrace " + klub1 + " protiv " + klub2;
	}
	
	
}
