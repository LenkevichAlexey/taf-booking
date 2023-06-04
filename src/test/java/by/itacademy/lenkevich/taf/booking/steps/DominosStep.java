package by.itacademy.lenkevich.taf.booking.steps;

import by.itacademy.lenkevich.taf.booking.pages.DominosPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosStep {
    DominosPage dominosPage;

    public DominosStep(ChromeDriver driver) {

        dominosPage = new DominosPage(driver);
    }

    public void fillIncorrectEmailAndAnyPassword(String email, String password) {
        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputEmailField(email);
        dominosPage.sendKeysInputPasswordField(password);
        dominosPage.clickLogInButton();
    }

    public void fillCorrectEmailAndAnyPassword(String email, String password) {
        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputEmailField(email);
        dominosPage.sendKeysInputPasswordField(password);
        dominosPage.clickLogInButton();
    }

    public void fillIncorrectEmailAndEmptyPassword(String email) {
        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputEmailField(email);
        dominosPage.clickLogInButton();
    }

    public void fillEmptyEmailAndInccorectPassword(String password) {
        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputPasswordField(password);
        dominosPage.clickLogInButton();
    }

}
