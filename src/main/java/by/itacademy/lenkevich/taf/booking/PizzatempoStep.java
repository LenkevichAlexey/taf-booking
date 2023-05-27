package by.itacademy.lenkevich.taf.booking;

import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoStep {
    PizzatempoPage pizzatempoPage;

    public PizzatempoStep(ChromeDriver driver) {

        pizzatempoPage = new PizzatempoPage(driver);
    }

    public void clickSubmitButton() {

        pizzatempoPage.clickLoginButton();
    }

    public void fillIncorrectEmailAndSubmitButton(String email) {
        pizzatempoPage.sendKeysInputEmailField(email);
        pizzatempoPage.clickLoginButton();
    }

    public void fillIncorrectPasswordAndSubmitButton(String password) {
        pizzatempoPage.sendKeysInputPasswordField(password);
        pizzatempoPage.clickLoginButton();
    }

    public void fillEmptyEmailAndCorrectPassword(String password) {
        pizzatempoPage.sendKeysInputPasswordField(password);
        pizzatempoPage.clickLoginButton();
    }

    public void fillCorrectEmailAndEmptyPassword(String email) {
        pizzatempoPage.sendKeysInputEmailField(email);
        pizzatempoPage.clickLoginButton();
    }

    public void fillCorrectEmailAndCorrectPassword(String email, String password) {
        pizzatempoPage.sendKeysInputEmailField(email);
        pizzatempoPage.sendKeysInputPasswordField(password);
        pizzatempoPage.clickLoginButton();
    }

    public void fillIncorrectEmailAndIncorrectPassword(String email, String password) {
        pizzatempoPage.sendKeysInputEmailField(email);
        pizzatempoPage.sendKeysInputPasswordField(password);
        pizzatempoPage.clickLoginButton();
    }

}
