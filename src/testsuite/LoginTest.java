package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    //Write down the following test in the ‘LoginTest’ class
    public void userShouldNavigateToLoginPageSuccessfully(){
        //* click on the ‘Login’ link
       driver.findElement(By.linkText("Log in")).click();
       //Verify the text Welcome, Please Sign In!
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("Not redirected to login page",expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter a valid username
        driver.findElement(By.id("Email")).sendKeys("alexpatel123@gmail.com");
        //Enter a valid password
        driver.findElement(By.name("Password")).sendKeys("alex123");
        //Click on the ‘Login’ button
        driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
        //Verify the ‘Welcome to our store’ text is displayed
        String expectedMessage = "Welcome to our store";
        WebElement welcomeMessageElement = driver.findElement(By.xpath("//div[@class = 'topic-html-content-title']"));
        String actualMessage = welcomeMessageElement.getText();
        Assert.assertEquals("Message has displayed correctly", expectedMessage, actualMessage);


    }
    @Test
    public void verifyTheErrorMessage(){
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter the invalid username
        driver.findElement(By.id("Email")).sendKeys("Dexpatel123@gmail.com");

        //Enter the invalid password
        driver.findElement(By.name("Password")).sendKeys("dex123");
        //Click on the ‘Login’ button
        driver.findElement(By.xpath("//input[@value = 'Log in']")).click();

        // Verify the error message ‘Login was unsuccessful. Please correct the errors and try again. No customer account found’
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not display", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();

    }
}
