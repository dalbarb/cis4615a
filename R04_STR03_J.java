public class R04_STR03_J {
    
    // STR03-J. Do not encode noncharacter data as a string Given the non-compliant code below:
    BigInteger x = new BigInteger("530500452766");
    byte [] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);

    // Correct the code as shown in the Compliant Solution below:
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString(); // Valid character data
    byte [] byteArray = s.getBytes();
    String ns = nerw String(byteArray);
    x = new BigInteger(ns);


    public static void main(String[] args) {
    }

}