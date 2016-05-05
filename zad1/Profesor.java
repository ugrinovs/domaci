package domaci.zad1;

public class Profesor {
		//	Modelovati entitet Profesor. Podaci za profesora su JMBG, ime i prezime, grad, zvanje, plata, 
		//	predmet na kome je angazovan.
		//	Obezbediti da su svi atributi zaštićeni, da postoje više konstuktora 
		//	(bez parametara, parametri koji su atributi klase, referenca na objekat), 
		//	metode vratiTekstualnuReprezentacijuZaIspis(), isti(Predmet pred) i set/get metode za atibute klase. 
		//	Identifikator (jedinstvena vrednost) profesora je JMBG.
		//	Napraviti test klasu. Test podatke preuzeti (prekopirati) iz fajla profesori.csv.
	
	protected int JMBG;
	protected String imeIPrezime;
	protected String grad;
	protected String zvanje;
	protected int plata;
	protected String predmet;
	
	public Profesor(){
		
	}
	
	public Profesor(int JMBG, String imeIPrezime, String grad, String zvanje, int plata, String predmet){
		this.JMBG = JMBG;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
		this.zvanje = zvanje;
		this.plata = plata;
		this.predmet = predmet;
	}
	
	public Profesor(Profesor prof){
		JMBG = prof.JMBG;
		imeIPrezime = prof.imeIPrezime;
		grad = prof.grad;
		zvanje = prof.zvanje;
		plata = prof.plata;
		predmet = prof.predmet;
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		return "JMBG: " + JMBG + ", Ime i Prezime: " + imeIPrezime + ", Mesto stanovanja: " + grad + ", Zvanje: " + zvanje +
				", Plata: " + plata + ", Predmet: " + predmet;
	}
	
	public boolean isti(Profesor prof){
		boolean vratiVrednost = false;
		if(JMBG == prof.JMBG)
			vratiVrednost = true;
		return vratiVrednost;
	}

	
	public int getJMBG() {
		return JMBG;
	}

	public void setJMBG(int jMBG) {
		JMBG = jMBG;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	
	
}
