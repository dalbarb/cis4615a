public class R10_THI00_J {

	// THI00-J. Do not invoke Thread.run() Given the non-compliant code below:
	public final class Foo implements Runnable {
	  @Override public void run() {
	    // ...
	  }
	 
	  public static void main(String[] args) {
	    Foo foo = new Foo();
	    new Thread(foo).run();
	  }
	}
	
	// Correct the code as shown in the Compliant Solution below:
	public final class Foo implements Runnable {
	  @Override public void run() {
	    // ...
	  }
	 
	  public static void main(String[] args) {
	    Foo foo = new Foo();
	    new Thread(foo).start();
	  }
	}

	public static void main(String[] args) {
    }
}