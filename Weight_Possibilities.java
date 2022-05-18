package weights;


/**
 * This is my first personal project ever. The idea came to me when working
 * out. So many people, myself included, will work out at home gyms where you
 * need specific plates to equal specific total weights on each side of a
 * barbell. At home gyms though, plates and certain weights may be limited.
 * This code will hopefully take in a weight as an argument and spit out every
 * combination/possibility of weights for each side of a barbell.
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
			System.out.println( "the weight " + weight + "cannot be accomplished with your " +
					"plate sizes, so I rounded it down by " + (weight % 5) +
					" to " + (weight - (weight % 5)) );
			weight -= weight % 5;	// make sure the weight is possible
		}
		
		
		// get weight needed for each side
		double eachSide = (weight - 45) / 2;
		
	} // end of main
	
}
