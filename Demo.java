public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//declareer een nieuwe auto
		Auto auto1 = new Auto();
		auto1.merk = "Ferrari";
		auto1.maxSnelheid = 330;
		
		//declareer een nieuwe auto
		Auto auto2 = new Auto();
		auto2.merk = "Toyota";
		auto2.maxSnelheid = 210;
		
		//roep de functie toeteren aan voor het object auto1 en auto2
		auto1.Toeteren();
		auto2.Toeteren();
	}
}

//Beschrijft een Auto class
class Auto{
	String merk;
	int maxSnelheid;
	void Toeteren() {
		System.out.println("Toettoet! Ik ben een " + merk + " en ik kan maximaal "+maxSnelheid + " KM/u.");
	}
}

