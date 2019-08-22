package stepDefinationPkg;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Requirement {

    static WebDriver driver;
    static WebElement dropDownToClick;


    @Given("^I set the environment variale$")
    public void environmentSetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Jarfiles\\jarchrome\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
   @When("^I launch the URL$")
   public void launchUrl() {
        driver.get("http://newtours.demoaut.com/");
    }


    @When("^I enter the (.*) in the userEditBox$")
    public void enterUserName(String username) {
        driver.findElement(By.name("userName")).sendKeys(username);

    }

    @When("^I enter the (.*) in the passwordEditBox$")
    public void enterPassword(String Password) {
        driver.findElement(By.name("password")).sendKeys(Password);

    }

    @When("^I click (.*) button$")
    public void clickBtn(String btnName) {
        driver.findElement(By.name(btnName)).click();
    }

    @Then("^signoffBtn is present$")
    public void verifyElementPresence() {
        try {
            if (driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).isDisplayed()){
                System.out.println("Login successful");
            }
        }catch (Exception e) {
            // TODO: handle exception
        }

        try {
            if (driver.findElement(By.xpath("//a[text()='SIGN-ON']")).isDisplayed()) {
                System.out.println("Login not successfull");
            }
        }catch (Exception e) {
            // TODO: handle exception
        }

    }


    @When("^I click on Oneway RadioBtn$")
    public void clickRadioBtn() {
        driver.findElement(By.xpath("//input[@value='oneway']")).click();
    }


    @When("^I select (.*) from the (.*) dropdown$")
    public void selectToDropdown(String child,String parent) {
        dropDownToClick=driver.findElement(By.name(parent));
        Select dropDown= new Select(dropDownToClick);
        dropDown.selectByVisibleText(child);

    }



    @When("^I enter the username in the editBox and password in passwordBox$")
    public void entertext() {
        driver.findElement(By.name("userName")).sendKeys("batman");
        driver.findElement(By.name("password")).sendKeys("batman");
    }



    @When("^I close the browser$")
    public void closeBrowser() {
        driver.close();
    }

}
