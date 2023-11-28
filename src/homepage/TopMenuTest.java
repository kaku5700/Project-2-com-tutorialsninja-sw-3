package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl =  "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    public void selectMenu(String menu){
        if (menu == "Desktops") {
            // Mouse hover on “Desktops” Tab and click
            mouseHoverToElement(By.xpath("//a[normalize-space()='Desktops']"));
            clickOnElement(By.xpath("//a[normalize-space()='Show AllDesktops']"));
            String actualText = driver.getTitle();
            String expectedText = "Desktops";
            Assert.assertEquals(expectedText, actualText);
        }else if (menu == "Laptops & Notebooks"){
            mouseHoverToElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
            clickOnElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));
            String actualText = driver.getTitle();
            String expectedText = "Laptops & Notebooks";
            Assert.assertEquals(expectedText, actualText);
        }
        else if (menu == "Components"){
            mouseHoverToElement(By.xpath("//a[normalize-space()='Components']"));
            clickOnElement(By.xpath("//a[normalize-space()='Show AllComponents']"));
            String actualText = driver.getTitle();
            String expectedText = "Components";
            Assert.assertEquals(expectedText, actualText);
        } else {
            System.out.println("Wrong parameter passed");
        }

    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        selectMenu("Desktops");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        selectMenu("Laptops & Notebooks");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        selectMenu("Components");
    }

    @After
    public void tearDown() {
        closeBrowser(baseUrl);
    }

}




