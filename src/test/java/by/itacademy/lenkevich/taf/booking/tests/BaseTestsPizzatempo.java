package by.itacademy.lenkevich.taf.booking.tests;

import by.itacademy.lenkevich.taf.booking.pages.PizzatempoPage;
import by.itacademy.lenkevich.taf.booking.steps.PizzatempoStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestsPizzatempo {
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

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
