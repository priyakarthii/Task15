package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleQA {
    public static void main(String[] args)
    {
        //open the browser
        ChromeDriver chromedriver = new ChromeDriver();
        //Navigate to google website
        chromedriver.get("https://google.com");
        //locate id
        By by = By.id("APjFqb");
        //Find the by element
        WebElement element = chromedriver.findElement(by);
        //search for selenium browser driver
        element.sendKeys("Selenium Browser Driver");
        //click on enter
        element.sendKeys(Keys.ENTER);


    }

}
