package by.itacademy.lenkevich.taf.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;
    Util util;
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
    public void testEmptyEmailAndEmptyPassword() {

        pizzatempoStep.clickSubmitButton();
    }

    @Test
    public void testIncorrectEmail() {

        pizzatempoStep.fillIncorrectEmailAndSubmitButton(util.generateInvalidEmail());
    }

    @Test
    public void testAnyPassword() {
        pizzatempoStep.fillAnyPasswordAndSubmitButton(util.generatePassword());
    }

    @Test
    public void testEmptyEmailAndAnyPassword() {

        pizzatempoStep.fillEmptyEmailAndAnyPassword(util.generatePassword());
    }

    @Test
    public void testCorrectEmailAndEmptyPassword() {

        pizzatempoStep.fillCorrectEmailAndEmptyPassword(util.generateEmail());

    }

    @Test
    public void testCorrectEmailAndAnyPassword() {

        pizzatempoStep.fillCorrectEmailAndAnyPassword(util.generateEmail(), util.generatePassword());

    }

    @Test
    public void testIncorrectEmailAndAnyPassword() {

        pizzatempoStep.fillIncorrectEmailAndAnyPassword(util.generateInvalidEmail(), util.generatePassword());

    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
