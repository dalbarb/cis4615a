public class R13_FIO05_J {

	// FIO05-J. Do not expose buffers or their backing arrays methods to untrusted code Given the non-compliant code below:
	final class Wrap {
	  private char[] dataArray;
	 
	  public Wrap() {
	    dataArray = new char[10];
	    // Initialize
	  }
	 
	  public CharBuffer getBufferCopy() {
	    return CharBuffer.wrap(dataArray);
	  }
	}

	// Correct the code as shown in the Compliant Solution below:
	final class Wrap {
	  private char[] dataArray;
	 
	  public Wrap() {
	    dataArray = new char[10];
	    // Initialize
	  }
	 
	  public CharBuffer getBufferCopy() {
	    return CharBuffer.wrap(dataArray).asReadOnlyBuffer();
	  }
	}
	
	public static void main(String[] args) {
    }
}