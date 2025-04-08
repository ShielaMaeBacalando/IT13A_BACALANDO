
package MIDTERM;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class EncryptFileHandling {
    public static void main(String[] args) {
        int key = 6;
        String message = "I love you!\nGwapa ko!\nBuotan si Maam!";

        try {
            File myObj = new File("C:\\Users\\Administrator\\Desktop\\BACALANDO .txt");
            File encrypted = new File("C:\\Users\\Administrator\\Desktop\\BACALANDO .txt");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName() +" and "+ encrypted.getName());
            } else {
                System.out.println("The file already exists.");
            }

            try (FileWriter write = new FileWriter(myObj)) {
                write.write(message);
            }
          

             String encryptedMessage = encryptMessage(message, key);
            
            try (FileWriter encryptednasulat = new FileWriter(encrypted)) {
                encryptednasulat.write(encryptedMessage);
            }
            
            System.out.println("Original  : \n" + message +"\n");
            System.out.println("Encrypted message : \n" + encryptedMessage);

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
         
            if (Character.isLetterOrDigit(chars[i])) {
                chars[i] += key;
            }
        }
        return new String(chars);
    }
}


    
