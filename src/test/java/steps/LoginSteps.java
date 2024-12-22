package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I open the login page")
    public void i_open_the_login_page() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected_to_the_inventory_page() {
        // Verifikasi redireksi ke inventory page
        Assert.assertTrue("User is not redirected to the inventory page!",
                driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        // Verifikasi adanya pesan error
        Assert.assertTrue("Error message is not displayed!",
                loginPage.isErrorMessageDisplayed());
        driver.quit();
    }

    @Then("I should see an error message for missing credentials")
    public void i_should_see_an_error_message_for_missing_credentials() {
        // Verifikasi adanya pesan error untuk kredensial kosong
        Assert.assertTrue("Error message for missing credentials is not displayed!",
                loginPage.isErrorMessageDisplayed()); // Anda bisa menambahkan metode spesifik jika diperlukan
        driver.quit();
    }

    @Then("I should see an error message for invalid username")
    public void i_should_see_an_error_message_for_invalid_username() {
        // Verifikasi adanya pesan error untuk username tidak valid
        Assert.assertTrue("Error message for invalid username is not displayed!",
                loginPage.isErrorMessageDisplayed()); // Anda bisa menambahkan metode spesifik jika diperlukan
        driver.quit();
    }
}