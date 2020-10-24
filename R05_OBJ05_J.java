public class R05_OBJ05_J {

	// OBJ05-J. Do not return references to private mutable class members 
	// Given the non-compliant code below:
	class MutableClass {
	  private Date d;
	 
	  public MutableClass() {
	    d = new Date();
	  }
	 
	  public Date getDate() {
	    return d;
	  }
	}

	// Correct the code as shown in the Compliant Solution below:
	public Date getDate() {
  		return (Date)d.clone();
	}

	public static void main(String[] args) {
    }
}