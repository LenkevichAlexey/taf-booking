package by.itacademy.lenkevich.taf.booking.tests;

import by.itacademy.lenkevich.taf.booking.pages.DominosPage;
import by.itacademy.lenkevich.taf.booking.steps.DominosStep;
import by.itacademy.lenkevich.taf.booking.utils.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class DominosTest extends BaseTestsDominos {

    @Test
    public void testIncorrectEmailAndAnyPassword() {

        dominosStep.fillIncorrectEmailAndAnyPassword(Util.generateInvalidEmail(), Util.generatePassword());
        String actualResult = dominosPage.getResultText();
        Assertions.assertEquals("Неверный логин или пароль", actualResult);
    }

    @Test
    public void testCorrectEmailAndAnyPassword() {

        dominosStep.fillCorrectEmailAndAnyPassword(Util.generateEmail(), Util.generatePassword());
        String actualResult = dominosPage.getResultText();
        Assertions.assertEquals("Неверный логин или пароль", actualResult);

    }

    @Test
    public void testIncorrectEmailAndEmptyPassword() {

        dominosStep.fillIncorrectEmailAndEmptyPassword(Util.generateInvalidEmail());

    }

    @Test
    public void testEmptyEmailAndAnyPassword() {

        dominosStep.fillEmptyEmailAndInccorectPassword(Util.generatePassword());

    }
}
