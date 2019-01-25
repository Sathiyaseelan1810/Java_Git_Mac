package Java_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class selenium1 {


    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/sathiyaseelan/Folder/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.getTitle();
        driver.manage().window().maximize();
        driver.quit();



    }







}
