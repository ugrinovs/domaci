package domaci.zad3;
import java.util.ArrayList;

public class Test {
	
	public static ArrayList<Igraci> igraci = new ArrayList<Igraci>();
	public static ArrayList<KosarkaskiSavez> KSavez = new ArrayList<KosarkaskiSavez>();
	public static ArrayList<Sudija> sudije = new ArrayList<Sudija>();
	public static ArrayList<Utakmica> utakmice = new ArrayList<Utakmica>();
	
	public static void ispisiKSavez(ArrayList<KosarkaskiSavez> KSavez, ArrayList<Igraci> igraci){
		for(int i = 0; i < KSavez.size(); i++){
			System.out.println("----------------------------KLUB-------------------------------");
			System.out.println(KSavez.get(i).vratiTekstualnuReprezentacijuZaIspis());
			for(int j = 0; j < igraci.size(); j++){
				if(igraci.get(j).Klub.equals(KSavez.get(i).nazivKluba))
					System.out.println(igraci.get(j).vratiTekstualnuReprezentacijuZaIspis());
			}
			System.out.println("---------------------------------------------------------------");
		}
	}
	
	public static void ispisiUtakmice(ArrayList<Utakmica> utakmice, ArrayList<KosarkaskiSavez> KSavez, 
			ArrayList<Igraci> igraci, ArrayList<Sudija> sudije){
		for(int i = 0; i < utakmice.size(); i++){
			System.out.println(utakmice.get(i).vratiTekstualnuReprezentacijuZaIspis());
			System.out.println("****************************************************************************");
			for(int j = 0; j < KSavez.size(); j++){
				if(utakmice.get(i).klub1.equals(KSavez.get(j).nazivKluba) 
						|| utakmice.get(i).klub2.equals(KSavez.get(j).nazivKluba)){
						System.out.println(KSavez.get(j).vratiTekstualnuReprezentacijuZaIspis());
						System.out.println("------------------------------------Igraci----------------------------------");
				}
				for(int k = 0; k < igraci.size(); k++){
					if(igraci.get(k).Klub.equals(KSavez.get(j).nazivKluba))
						System.out.println(igraci.get(k).vratiTekstualnuReprezentacijuZaIspis());
				}		
				System.out.println("----------------------------------------------------------------------------");
			}
			for(int j = 0; j < sudije.size(); j++){
				if(utakmice.get(i).sifraSudije.equals(sudije.get(j).sifra))
				System.out.println("Rezultat na kraju utakmice: " 
				+ utakmice.get(i).rezultat + " | Sudija: " + sudije.get(i).imeIPrezime 
				+ "| Domacin: " + (utakmice.get(i).domacin == 1 ? utakmice.get(i).klub1 : utakmice.get(i).klub2)
				);
			}
			System.out.println("****************************************************************************");
		}
	}
	
	public static void main(String[] args){
	
	//IGRACI ZVEZDE
	igraci.add(new Igraci("#01", "Tarens Kinzi", "Crvena Zvezda"));
	igraci.add(new Igraci("#51", "Vladimir Stimac", "Crvena Zvezda"));
	igraci.add(new Igraci("#19", "Marko Simonovic", "Crvena Zvezda"));
	igraci.add(new Igraci("#09", "Luka Mitrovic", "Crvena Zvezda"));
	igraci.add(new Igraci("#10", "Branko Lazic", "Crvena Zvezda"));
	
	//IGRACI PARTIZANA
	igraci.add(new Igraci("#01", "Petar Aranitovic", "Partizan"));
	igraci.add(new Igraci("#02", "Vanja Marinkovic", "Partizan"));
	igraci.add(new Igraci("#03", "Milos Glisic", "Partizan"));
	igraci.add(new Igraci("#04", "Milos Koprivica", "Partizan"));
	igraci.add(new Igraci("#05", "Aleksandar Cvetkovic", "Partizan"));
	
	//IGRACI PANATINAIKOSA
	igraci.add(new Igraci("#03", "Aleksandar Pavlovic", "Panatinaikos"));
	igraci.add(new Igraci("#06", "Antonis Koniaris", "Panatinaikos"));
	igraci.add(new Igraci("#08", "Vladimir Jankovic", "Panatinaikos"));
	igraci.add(new Igraci("#09", "Antonis Focis", "Panatinaikos"));
	igraci.add(new Igraci("#10", "Miroslav BRaduljica", "Panatinaikos"));
	
	//KLUBOVI
	KSavez.add(new KosarkaskiSavez("klub01", "Crvena Zvezda"));
	KSavez.add(new KosarkaskiSavez("klub02", "Partizan"));
	KSavez.add(new KosarkaskiSavez("klub03", "Panatinaikos"));
	
	//SUDIJE
	sudije.add(new Sudija("s01", "Predrag Zivkovic"));
	sudije.add(new Sudija("s02", "Marko Petrovic"));
	
	//Utakmica
	utakmice.add(new Utakmica("Crvena Zvezda", "Partizan", "21.05.2016", "15:30", "55:45", "s01", 1));
	utakmice.add(new Utakmica("Crvena Zvezda", "Panatinaikos", "26.05.2016", "18:15", "71:74", "s02", 2));
	System.out.println("****************************************************************************");
	ispisiUtakmice(utakmice, KSavez, igraci, sudije);
	}
}
