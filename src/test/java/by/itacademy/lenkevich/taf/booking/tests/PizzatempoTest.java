package by.itacademy.lenkevich.taf.booking.tests;

import by.itacademy.lenkevich.taf.booking.pages.PizzatempoPage;
import by.itacademy.lenkevich.taf.booking.steps.PizzatempoStep;
import by.itacademy.lenkevich.taf.booking.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzatempoTest extends BaseTestsPizzatempo {
    PizzatempoPage pizzatempoPage;
    PizzatempoStep pizzatempoStep;

    @Test
    public void testEmptyEmailAndAnyPassword() {

        pizzatempoStep.fillEmptyEmailAndAnyPassword(Util.generatePassword());
    }

    @Test
    public void testCorrectEmailAndEmptyPassword() {

        pizzatempoStep.fillCorrectEmailAndEmptyPassword(Util.generateEmail());

    }

    @Test
    public void testCorrectEmailAndAnyPassword() {

        pizzatempoStep.fillCorrectEmailAndAnyPassword(Util.generateEmail(), Util.generatePassword());
        String actualResult = pizzatempoPage.getResultText();
        Assertions.assertEquals("Неверно указано имя пользователя или пароль.\n" +
                "Ok", actualResult);
    }

    @Test
    public void testIncorrectEmailAndAnyPassword() {

        pizzatempoStep.fillIncorrectEmailAndAnyPassword(Util.generateInvalidEmail(), Util.generatePassword());
        String actualResult = pizzatempoPage.getResultText();
        Assertions.assertEquals("Неверно указано имя пользователя или пароль.\n" +
                "Ok", actualResult);

    }
}
