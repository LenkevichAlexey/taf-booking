package by.itacademy.lenkevich.taf.booking.tests;

import by.itacademy.lenkevich.taf.booking.pages.PizzatempoPage;
import by.itacademy.lenkevich.taf.booking.steps.PizzatempoStep;
import by.itacademy.lenkevich.taf.booking.utils.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;
    PizzatempoStep pizzatempoStep;


    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
        pizzatempoPage = new PizzatempoPage(driver);
        pizzatempoStep = new PizzatempoStep(driver);

    }

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

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
