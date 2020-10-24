public class R03_NUM03_J {
    
    // NUM03-J. Use integer types that can fully represent the possible range of unsigned data Given the non-cokmpliant code below:
    public static int getInteger(DataInputStream is) throws IOException
    {
        return is.readInt();
    }

    // Correct the code as shown in the Compliant Solution below:
    public static int getInteger(DataInputStream is) throws IOException
    {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }

    public static void main(String[] args) {
    }

}