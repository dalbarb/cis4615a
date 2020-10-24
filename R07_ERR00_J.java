public class R07_ERR00_J {

	// ERR00-J. Do not suppress or ignore checked exceptions 
	// Given the non-compliant code below:
	try {
	  //...
	} catch (IOException ioe) {
	  ioe.printStackTrace();
	}

	// Correct the code as shown in the Compliant Solution below:

	boolean validFlag = false;
	do {
	  try {
	    // ...
	    // If requested file does not exist, throws FileNotFoundException
	    // If requested file exists, sets validFlag to true
	    validFlag = true;
	  } catch (FileNotFoundException e) {
	    // Ask the user for a different file name
	  }
	} while (validFlag != true);
	// Use the file

	public static void main(String[] args) {
    }
}