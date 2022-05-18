package weights;


/**
 * This is my first personal project ever. The idea came to me when working
 * out. So many people, myself included, will work out at home gyms where you
 * need specific plates to equal specific total weights on each side of a
 * barbell. This code will take in a weight as an argument and spit
 * out the most logical plates to use for your given weight
 * 
 * @author Michael Blair
 * @version 5.18.2022
 */
public class Weight_Possibilities {
	// no fields or constructors needed for this class
	
	
	
	// methods ----------------------------------------------------------------
	
	/**
	 * this is the main method that will take in a weight and get combinations
	 * of weights that will work. Note, weights only consist of the following
	 * weights:
	 * 			2.5, 5, 10, 25, 45
	 * For this reason, if any weight input is not possible I will output the
	 * closest weight that is LOWER than that input that is possible with the
	 * given numbers
	 * 
	 * @param args			is the input weight
	 */
	public static void main(String args[]) {
		
		double weight = Double.parseDouble(args[0]);		// read in the input weight
		
		// make sure weight is possible, ie above weight of barbell
		if (weight < 45) {
			System.out.println("the weight cannot be lower than 45 lbs, the" +
					" weight of the barbell");
			return;
		}
		
		// make sure weight is possible with given plates
		if ( (weight - 45) % 5 != 0) {
			System.out.println( "the weight " + weight + " cannot be accomplished with your " +
					"plate sizes, so I rounded it down by " + (weight % 5) +
					" to " + (weight - (weight % 5)) + "\n");
			weight -= weight % 5;	// make sure the weight is possible
		}
		
		
		// get weight needed for each side
		double eachSide = (weight - 45) / 2;
		
		// add counters to each weight
		int count45 = 0;
		int count25 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2_5 = 0;
		
		// loop through each weight while possible and count biggest plates first
		while (eachSide / 45 >= 1) {
			eachSide -= 45;
			count45++;
		}
		while (eachSide / 25 >= 1) {
			eachSide -= 25;
			count25++;
		}
		while (eachSide / 10 >= 1) {
			eachSide -= 10;
			count10++;
		}
		while (eachSide / 5 >= 1) {
			eachSide -= 5;
			count5++;
		}
		while (eachSide / 2.5 >= 1) {
			eachSide -= 2.5;
			count2_5++;
		}
		
		
		// print out most logical weights to use
		System.out.println("You should use " + count45 + " 45 plates, " + count25 +
				" 25 plates, " + count10 + " 10 plates, " + count5 + " 5 lb plates, and " +
				count2_5 + " 2.5 plates on each side of the barbell");
		
	} // end of main
	
}
