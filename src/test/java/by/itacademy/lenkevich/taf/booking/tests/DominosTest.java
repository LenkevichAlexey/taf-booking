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


public class DominosTest {
    ChromeDriver driver;
    DominosPage dominosPage;
    DominosStep dominosStep;
    Util util;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://dominos.by/");
        driver.manage().window().maximize();
        dominosPage = new DominosPage(driver);
        dominosStep = new DominosStep(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testIncorrectEmailAndAnyPassword() {

        dominosStep.fillIncorrectEmailAndAnyPassword(util.generateInvalidEmail(), util.generatePassword());
        String actualResult = dominosPage.getResultText();
        Assertions.assertEquals(actualResult, "Неверный логин или пароль");
    }

    @Test
    public void testCorrectEmailAndAnyPassword() {

        dominosStep.fillCorrectEmailAndAnyPassword(util.generateEmail(), util.generatePassword());
        String actualResult = dominosPage.getResultText();
        Assertions.assertEquals(actualResult, "Неверный логин или пароль");

    }

    @Test
    public void testIncorrectEmailAndEmptyPassword() {

        dominosStep.fillIncorrectEmailAndEmptyPassword(util.generateInvalidEmail());

    }

    @Test
    public void testEmptyEmailAndAnyPassword() {

        dominosStep.fillEmptyEmailAndInccorectPassword(util.generatePassword());

    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
