package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the ‘COMPUTERS’ Tab
        driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[2]/a")).click();
        //Verify the text ‘Computers’
        String expectedMessage = "Computers";
        String actualMessage = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Text not display", expectedMessage, actualMessage);



    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
     //click on the ‘ELECTRONICS’ Tab
        driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[3]/a")).click();
       // Verify the text ‘Electronics’
        String expectedResult="Electronics";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
       Assert.assertEquals("Not redirected to login page",expectedResult,actualResult);


    }
    public void userShouldNavigateToApparelAndShoesPageSuccessfully(){
     //click on the ‘APPAREL & SHOES’ Tab
        driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[4]/a")).click();
        //Verify the text ‘Apparel & Sh’
        String expectedResult="Apparel & Shoes";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("text on the display",expectedResult,actualResult);

    }
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click on the ‘DIGITAL DOWNLOADS’ Tab
        driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[5]/a")).click();
        //Verify the text ‘Digital downloads’
        String expectedTitle = "Digital downloads";
        String actualTitle = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Digital downloads display", expectedTitle, actualTitle);



    }
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the ‘BOOKS’ Tab
        driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[1]/a")).click();
        //* Verify the text ‘Books’
        String expectedResult="Books";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("Not redirected to login page",expectedResult,actualResult);

    }
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the ‘JEWELRY’ Tab
        driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[6]/a")).click();
        //* Verify the text ‘Jewelry’
        String expectedResult="Jewelry";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("Not redirected to login page",expectedResult,actualResult);

    }
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //click on the ‘GIFT CARDS’ Tab
        driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[7]/a")).click();
        //Verify the text ‘Gift Cards’
        String expectedResult="Gift Cards";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("Not redirected to login page", expectedResult, actualResult);



    }
    @After
    public void tearDown(){
        // closeBrowser();
    }
}
