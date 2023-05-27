package by.itacademy.lenkevich.taf.booking;


public class Until {

    public static String generateEmail() {
        String[] letter = {"a", "b", "!", "7", "A", "$", "V", "^", "}"};
        String result = "";

        for (int i = 0; i < letter.length; i++) {
            int j;
            j = (int) Math.floor(Math.random() * letter.length);
            result = result.concat(letter[j]);
        }
        return (result + "@gmail.com");
    }

    public static String generatePassword() {

        String[] letter = {"a", "b", "!", "7", "A", "$", "V", "^", "}"};
        String result = "";

        for (int i = 0; i < letter.length; i++) {
            int j;
            j = (int) Math.floor(Math.random() * letter.length);
            result = result.concat(letter[j]);
        }
        return (result);
    }

    public static void main(String[] args) {

        System.out.println(generateEmail());
        System.out.println(generatePassword());

    }
}
