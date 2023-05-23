package by.itacademy.lenkevich.taf.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripadvisorTest {
    TripadvisorPage tripadvisorPage = new TripadvisorPage();
    ChromeDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testEmptyEmail() {

        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();

        //iframe
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();

        WebElement buttonCreate = driver.findElement(By.xpath(tripadvisorPage.buttonCreateXpath));
        buttonCreate.click();
    }

    @Test
    public void testIncorrectEmail() {

        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();

        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("test@test.com");

        WebElement buttonCreate = driver.findElement(By.xpath(tripadvisorPage.buttonCreateXpath));
        buttonCreate.click();
    }

    @Test
    public void tesCorrectEmailAndEmptyPassword() {

        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();

        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("test@gmail.com");

        WebElement buttonCreate = driver.findElement(By.xpath(tripadvisorPage.buttonCreateXpath));
        buttonCreate.click();
    }

    @Test
    public void tesCorrectEmailAndPassword() {

        WebElement buttonSignIn = driver.findElement(By.xpath(tripadvisorPage.buttonSignInXpath));
        buttonSignIn.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();

        WebElement inputEmail = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
        inputEmail.sendKeys("test@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(tripadvisorPage.inputPasswordXpath));
        inputPassword.sendKeys("Qwerty123!");

        WebElement buttonCreate = driver.findElement(By.xpath(tripadvisorPage.buttonCreateXpath));
        buttonCreate.click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
