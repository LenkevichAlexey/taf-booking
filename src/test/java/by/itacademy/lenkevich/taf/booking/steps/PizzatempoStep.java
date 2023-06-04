package by.itacademy.lenkevich.taf.booking.steps;

import by.itacademy.lenkevich.taf.booking.pages.PizzatempoPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoStep {
    PizzatempoPage pizzatempoPage;

    public PizzatempoStep(ChromeDriver driver) {

        pizzatempoPage = new PizzatempoPage(driver);
    }

    public void fillEmptyEmailAndAnyPassword(String password) {
        pizzatempoPage.sendKeysInputPasswordField(password);
        pizzatempoPage.clickLoginButton();
    }

    public void fillCorrectEmailAndEmptyPassword(String email) {
        pizzatempoPage.sendKeysInputEmailField(email);
        pizzatempoPage.clickLoginButton();
    }

    public void fillCorrectEmailAndAnyPassword(String email, String password) {
        pizzatempoPage.sendKeysInputEmailField(email);
        pizzatempoPage.sendKeysInputPasswordField(password);
        pizzatempoPage.clickLoginButton();
    }

    public void fillIncorrectEmailAndAnyPassword(String email, String password) {
        pizzatempoPage.sendKeysInputEmailField(email);
        pizzatempoPage.sendKeysInputPasswordField(password);
        pizzatempoPage.clickLoginButton();
    }

}
