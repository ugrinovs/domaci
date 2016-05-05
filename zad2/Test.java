package domaci.zad2;
import java.util.ArrayList;

public class Test {

	public static void ispisiArtikle(ArrayList<Artikal> artikli){
		for(int i = 0; i < artikli.size(); i++){
			System.out.println(artikli.get(i).vratiTekstualnuReprezentacijuZaIspis());
		}
	}
	public static void main(String[] args) {
			//	s01|Coko plazma|Bambi|85.30|akcija
			//	s02|Smoki|Stark|55.00|nije na akciji
			//	s03|Cipsi|Marbo|115.20|nije na akciji
			//	s04|Krem Bananica|Stark|11.00|akcija
		ArrayList<Artikal> artikli = new ArrayList<Artikal>();
		
		artikli.add(new Artikal("s01", "Coko plazma", "Bambi", 85.30, true));
		artikli.add(new Artikal("s02", "Smoki", "Stark", 55, false));
		artikli.add(new Artikal("s03", "Cipsi", "Marbo", 115.20, false));
		artikli.add(new Artikal("s04", "Krem Bananica", "Stark", 11, true));
		
		ispisiArtikle(artikli);
	}

}
