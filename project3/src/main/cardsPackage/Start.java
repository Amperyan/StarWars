package cardsPackage;


// public static void main
public class Start {

	public static void main(String[] args) {
		final double fom3notLessThan = 7.5;
		final double fom8notLessThan = 7.5;

		
		String fileName = "quickstart.dat";
		PeaksReader readFile = new PeaksReader(fileName);
		
		System.out.println("Listing of " + fileName);
		System.out.println("---------------------------");
		readFile.printList();
		System.out.println("Total number of input peaks " + readFile.listOfPeaks.size());
		System.out.println();
		
		readFile.sortMax();
		System.out.println("Listing of sorted list" + fileName);
		System.out.println("---------------------------");
		readFile.printList();

	}

}
