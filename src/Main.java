import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Msg = new Scanner(System.in);
        System.out.println("What is the message?");
        String inputMsg = Msg.next();
        System.out.println("What is the ceasar shift?");
        short inputCeasarShift = Msg.nextShort();

        boolean validInput = false;
        boolean encrypted = false;

        do {
            System.out.println("Is this message already encrypted (Y/N)?");
            String originalInputEncrypted = Msg.next();
            String inputEncrypted = originalInputEncrypted.toUpperCase();

            if (inputEncrypted.equals("Y")) {
                encrypted = true;
                validInput = true;
            } else if (inputEncrypted.equals("N")) {
                encrypted = false;
                validInput = true;
            } else {
                System.out.println("Invalid input. Only 'Y' or 'N' is allowed.");
            }
        } while (!validInput);

        Message decrypt = new Message(inputMsg, inputCeasarShift, encrypted);
        System.out.println(decrypt.encryptedMsg);
        System.out.println(decrypt.decryptedMsg);


    }
}
