public class R02_XP00_J {
    
    // XP00-J. Do not ignore values returned by methods 
    // Given the non-compliant code below
    public void deleteFile()
    {
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
    }

    // Correct the code as shown in the Compliant Solution below:
    public void deleteFile()
    {
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete())
        {
            // Handle failure to delete the file
        }
    }

    public static void main(String[] args) {
    }

}