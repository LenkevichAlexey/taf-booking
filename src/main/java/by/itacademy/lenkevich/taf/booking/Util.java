package by.itacademy.lenkevich.taf.booking;


import com.github.javafaker.Faker;

public class Util {

    static Faker faker = new Faker();

    public static String generateInvalidEmail() {
        String[] letter = {"a", "b", "!", "7", "A", "$", "V", "^", "}"};
        String result = "";

        for (int i = 0; i < letter.length; i++) {
            int j = (int) Math.floor(Math.random() * letter.length);
            result = result.concat(letter[j]);
        }
        return (result + "@test.com");
    }


    public static String generateEmail() {
        String email = faker.internet().emailAddress();
        return email;
    }

    public static String generatePassword() {
        String password = faker.internet().password();
        return password;
    }
}
