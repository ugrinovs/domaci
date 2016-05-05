package domaci.zad1;

public class Test {

	public static void ispisiProfesore(Profesor[] profesori){
		for(int i = 0; i < profesori.length; i++){
			System.out.println(profesori[i].vratiTekstualnuReprezentacijuZaIspis());
		}
	}
	
	public static void main(String[] args) {
		Profesor[] profesori = new Profesor[4];
		
		profesori[0] = new Profesor(10, "Ivan Ivanović", "Novi Sad", "docent", 75000, "Matematika");
		profesori[1] = new Profesor(11, "Janko Janković", "Loznica", "asistent", 50000, "Fizika");
		profesori[2] = new Profesor(12, "Danilo Danilović", "Vršac", "docent", 72000, "Elektronika");
		profesori[3] = new Profesor(13, "Luka Lukić", "Novi Sad", "redovni profesor", 85000, "Infromatika");
		
		ispisiProfesore(profesori);
	}


}
