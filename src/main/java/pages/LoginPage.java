package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Locator
    private By usernameField = By.id("user-name"); // Ganti selector sesuai aplikasi
    private By passwordField = By.id("password"); // Ganti selector sesuai aplikasi
    private By loginButton = By.id("login-button"); // Ganti selector sesuai aplikasi
    private By errorMessageContainer = By.cssSelector(".error-message-container"); // Ganti selector sesuai aplikasi

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement usernameInput = driver.findElement(usernameField);
        usernameInput.clear(); // Membersihkan field sebelum mengirimkan input
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordField);
        passwordInput.clear(); // Membersihkan field sebelum mengirimkan input
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        // Verifikasi apakah elemen pesan error muncul di halaman
        try {
            return driver.findElement(errorMessageContainer).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getErrorMessageText() {
        // Mengembalikan teks dari pesan error (berguna untuk validasi lebih lanjut)
        try {
            return driver.findElement(errorMessageContainer).getText();
        } catch (Exception e) {
            return null;
        }
    }
}