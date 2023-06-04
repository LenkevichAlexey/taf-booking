package by.itacademy.lenkevich.taf.booking.tests;

import by.itacademy.lenkevich.taf.booking.pages.BookingPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BookingTest {
    BookingPage bookingPage = new BookingPage();
    ChromeDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testEmptyEmail() {

        WebElement buttonRegister = driver.findElement(By.cssSelector(bookingPage.buttonRegisterXpath));
        buttonRegister.click();

        WebElement buttonContinue = driver.findElement(By.xpath(bookingPage.buttonContinueXpath));
        buttonContinue.click();
    }

    @Test
    public void testIncorrectEmail() {

        WebElement buttonRegister = driver.findElement(By.cssSelector(bookingPage.buttonRegisterXpath));
        buttonRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("test@test.com");

        WebElement buttonContinue = driver.findElement(By.xpath(bookingPage.buttonContinueXpath));
        buttonContinue.click();
    }

    @Test
    public void testCorrectEmail() {
        WebElement buttonRegister = driver.findElement(By.cssSelector(bookingPage.buttonRegisterXpath));
        buttonRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("academy23@gmail.com");

        WebElement buttonContinue = driver.findElement(By.xpath(bookingPage.buttonContinueXpath));
        buttonContinue.click();
    }

    @Test
    public void testCorrectEmailAndEmptyPassword() {
        WebElement buttonRegister = driver.findElement(By.cssSelector(bookingPage.buttonRegisterXpath));
        buttonRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("academy23@gmail.com");

        WebElement buttonContinue = driver.findElement(By.xpath(bookingPage.buttonContinueXpath));
        buttonContinue.click();

        WebElement buttonCreateAccount = driver.findElement(By.xpath(bookingPage.buttonCreateAccountXpath));
        buttonCreateAccount.click();
    }

    @Test
    public void testCorrectEmailAndPassword() {
        WebElement buttonRegister = driver.findElement(By.cssSelector(bookingPage.buttonRegisterXpath));
        buttonRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("academy23@gmail.com");

        WebElement buttonContinue = driver.findElement(By.xpath(bookingPage.buttonContinueXpath));
        buttonContinue.click();

        WebElement inputPassword = driver.findElement(By.xpath(bookingPage.inputPasswordXpath));
        inputPassword.sendKeys("12345Qwe!");

        WebElement buttonCreateAccount = driver.findElement(By.xpath(bookingPage.buttonCreateAccountXpath));
        buttonCreateAccount.click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
