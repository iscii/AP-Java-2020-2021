import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.io.File;

class Read {
    public static void main(String[] args) throws Exception {
        // Create a File instance for passwords
        java.io.File passwordFile = new File("lib/password.txt");
        // Create a File instance for common passwords
        java.io.File topPasswordList = new File("lib/topPasswordList.txt");

        // Create a Scanner for the passwordFile
        Scanner input = new Scanner(passwordFile);
        
        Hashtable<String, String> pass = new Hashtable<>();
        // Read data from a file
        while (input.hasNext()) {
            String password = input.next();
            for(int i = 0; i < password.length(); i++)
                if(password.substring(i, i+1).equals(":"))
                    pass.put(password.substring(0, i), password.substring(i+1));
        }

        // Close the file
        input.close();
        // Switch to the other file
        input = new Scanner(topPasswordList);

        Set<String> key = pass.keySet();
        // Read data from a file
        while (input.hasNext()) {
            String password = input.next();
            for (String k : key)
                if (pass.get(k).equals(MessageDigestMethod.messageDigestMD5(password)))
                    System.out.println("Name: [" + k + "] Pass: [" + password + "] Hash: " + pass.get(k));
        }

        // Close the file
        input.close();

    }
}