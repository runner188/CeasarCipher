public class Message {

    String decryptedMsg;
    short ceasarShift;
    String encryptedMsg;

    public Message(String message, short inputCeasarShift, boolean encrypted) {
        this.ceasarShift = inputCeasarShift;

        if (encrypted == false) {
            this.decryptedMsg = message;

            StringBuilder encryptedMessage = new StringBuilder();
            for (int i = 0; i < this.decryptedMsg.length(); i++) {

                if (i != this.decryptedMsg.length()) {

                    if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(this.decryptedMsg.toUpperCase().substring(i, i + 1)) != -1) {
                        String encryptedLetter = String.valueOf((char) (this.decryptedMsg.charAt(i) + this.ceasarShift));
                        encryptedMessage.append(encryptedLetter);
                    } else {
                        encryptedMessage.append(this.decryptedMsg.charAt(i));
                    }
                } else {

                    if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(this.decryptedMsg.toUpperCase().substring(i, i + 1)) != -1) {
                        String encryptedLetter = String.valueOf((char) (this.decryptedMsg.charAt(i) + this.ceasarShift));
                        encryptedMessage.append(encryptedLetter);
                    } else {
                        encryptedMessage.append(this.decryptedMsg.charAt(i));
                    }

                }

            }

            this.encryptedMsg = encryptedMessage.toString();

        } else {
            this.encryptedMsg = message;

            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < this.encryptedMsg.length(); i++) {

                if (i != this.encryptedMsg.length()) {

                    if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(this.encryptedMsg.toUpperCase().substring(i, i + 1)) != -1) {
                        String decryptedLetter = String.valueOf((char) (this.encryptedMsg.charAt(i) - this.ceasarShift));
                        decryptedMessage.append(decryptedLetter);
                    } else {
                        decryptedMessage.append(this.encryptedMsg.charAt(i));
                    }

                } else {

                    if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(this.encryptedMsg.toUpperCase().substring(i)) != -1) {
                        String decryptedLetter = String.valueOf((char) (this.encryptedMsg.charAt(i) - this.ceasarShift));
                        decryptedMessage.append(decryptedLetter);
                    } else {
                        decryptedMessage.append(this.encryptedMsg.charAt(i));
                    }
                }
            }

            this.decryptedMsg = decryptedMessage.toString();
        }
    }

}
