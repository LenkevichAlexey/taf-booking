package by.itacademy.lenkevich.taf.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


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
    }

    @Test
    public void testIncorrectEmailAndAnyPassword() {

        dominosStep.fillIncorrectEmailAndAnyPassword(util.generateInvalidEmail(), util.generatePassword());

    }

    @Test
    public void testCorrectEmailAndAnyPassword() {

        dominosStep.fillCorrectEmailAndAnyPassword(util.generateEmail(), util.generatePassword());

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
