public class R01_DCL02_J {

	// DCL02-J. Do not modify the collection's elements during an enhanced for statement Given the non-compliant code below:
	List<Integer> list = Arrays.asList(new Integer[] {13, 14, 15});
	boolean first = true;
	 
	System.out.println("Processing list...);
	for (Integer i: list) {
	  if (first) {
	    first = false;
	    i = new Integer(99);
	  }
	  System.out.println(" New item: " + i);
	  // Process i
	}
	 
	System.out.println("Modified list?");
	for (Integer i : list) {
	  System.out.println("List item: " + i);
	}

	// Correct the code as shown in the Compliant Solution below:
	
	// ...
	  
	for (final Integer i: list) {
	  Integer item = i;
	  if (first) {
	    first = false;
	    item = new Integer(99);
	  }
	  System.out.println(" New item: " + item);
	  // Process item
	}
	 
	// ...

	public static void main(String[] args) {
    }
}