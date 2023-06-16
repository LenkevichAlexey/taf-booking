package by.itacademy.lenkevich.taf.booking.tests;

import by.itacademy.lenkevich.taf.booking.pages.DominosPage;
import by.itacademy.lenkevich.taf.booking.steps.DominosStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestsDominos {
    ChromeDriver driver;
    DominosPage dominosPage;
    DominosStep dominosStep;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://dominos.by/");
        driver.manage().window().maximize();
        dominosPage = new DominosPage(driver);
        dominosStep = new DominosStep(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
