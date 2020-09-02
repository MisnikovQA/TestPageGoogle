import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Test with Google PageSpeed Insights
 * and send rate to Telegram.
 *
 * @author Andrey Misnikov
 * @version 1.0
 * @since 29-08-2020
 */

public class MainClass {
    private static SomeTreadTest1 someTreadTest1;
    private static SomeTreadTest3 someTreadTest3;
    private static SomeTreadTest2 someTreadtest2;

    public static void main(String[] args) {
        someTreadTest1 = new SomeTreadTest1();
        someTreadtest2 = new SomeTreadTest2();
        someTreadTest3 = new SomeTreadTest3();
        someTreadTest1.start();
        someTreadtest2.start();
        someTreadTest3.start();
    }
}

class SomeTreadTest1 extends Thread {

    static String URL_Site1 = "https://bestvaluevpn.com/comparison-chart/";
    static By analyzeButton = By.cssSelector("#page-speed-insights > div.main-action > form > div > div > div");
    static By desktopButton = By.cssSelector("#\\:8 > div > div");
    static WebDriver driver;
    static By line_URL = By.cssSelector("#page-speed-insights > div.main-action > form > div > input");
    static By reteOfGoogleDes = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[1]/a/div[2]");
    static By reteOfGoogleMob = By.className("lh-gauge__percentage");
    static WebDriverWait wait;

    public void run() {
        System.setProperty("WebDriver.Chrome.driver", "F:\\Test_PageSpeed_Insights\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://developers.google.com/speed/pagespeed/insights/");
        driver.findElement(line_URL).sendKeys(URL_Site1);
        driver.findElement(analyzeButton).click();
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(reteOfGoogleMob));
        String rateMob = driver.findElement(reteOfGoogleMob).getText();
        System.out.println("The Mobile Rate Site("+URL_Site1+") is = "+rateMob);
        driver.findElement(desktopButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(reteOfGoogleDes));
        String rateDes = driver.findElement(reteOfGoogleDes).getText();
        System.out.println("The Desktop Rate Site("+URL_Site1+") is = "+rateDes);
        driver.close();
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        String apiToken = "1156988319:AAFzV5zNcaMbKHraLpZyiDjayxfWq-yZ_v8";
        String chatId = "-430318664";
        String text = "Test site("+URL_Site1+")  Mobile Rate is = "+rateMob+"   Desktop Rate is = "+rateDes;
        urlString = String.format(urlString, apiToken, chatId, text);
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SomeTreadTest2 extends Thread {

    static String URL_Site2 = "https://top5-passwordmanagers.com/d/";
    static By analyzeButton = By.cssSelector("#page-speed-insights > div.main-action > form > div > div > div");
    static By desktopButton = By.cssSelector("#\\:8 > div > div");
    static WebDriver driver;
    static By line_URL = By.cssSelector("#page-speed-insights > div.main-action > form > div > input");
    static By reteOfGoogleDes = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[1]/a/div[2]");
    static By reteOfGoogleMob = By.className("lh-gauge__percentage");
    static WebDriverWait wait;

    public void run() {
        System.setProperty("WebDriver.Chrome.driver", "F:\\Test_PageSpeed_Insights\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://developers.google.com/speed/pagespeed/insights/");
        driver.findElement(line_URL).sendKeys(URL_Site2);
        driver.findElement(analyzeButton).click();
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(reteOfGoogleMob));
        String rateMob = driver.findElement(reteOfGoogleMob).getText();
        System.out.println("The Mobile Rate Site("+URL_Site2+") is = "+rateMob);
        driver.findElement(desktopButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(reteOfGoogleDes));
        String rateDes = driver.findElement(reteOfGoogleDes).getText();
        System.out.println("The Desktop Rate Site("+URL_Site2+") is = "+rateDes);
        driver.close();
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        String apiToken = "1156988319:AAFzV5zNcaMbKHraLpZyiDjayxfWq-yZ_v8";
        String chatId = "-430318664";
        String text = "Test site("+URL_Site2+")  Mobile Rate is = "+rateMob+"   Desktop Rate is = "+rateDes;
        urlString = String.format(urlString, apiToken, chatId, text);
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SomeTreadTest3 extends Thread {

    static String URL_Site3 = "https://ubet.co.uk/";
    static By analyzeButton = By.cssSelector("#page-speed-insights > div.main-action > form > div > div > div");
    static By desktopButton = By.cssSelector("#\\:8 > div > div");
    static WebDriver driver;
    static By line_URL = By.cssSelector("#page-speed-insights > div.main-action > form > div > input");
    static By reteOfGoogleDes = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[1]/a/div[2]");
    static By reteOfGoogleMob = By.className("lh-gauge__percentage");
    static WebDriverWait wait;


    public void run() {
        System.setProperty("WebDriver.Chrome.driver", "F:\\Test_PageSpeed_Insights\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://developers.google.com/speed/pagespeed/insights/");
        driver.findElement(line_URL).sendKeys(URL_Site3);
        driver.findElement(analyzeButton).click();
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(reteOfGoogleMob));
        String rateMob = driver.findElement(reteOfGoogleMob).getText();
        System.out.println("The Mobile Rate Site("+URL_Site3+") is = "+rateMob);
        driver.findElement(desktopButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(reteOfGoogleDes));
        String rateDes = driver.findElement(reteOfGoogleDes).getText();
        System.out.println("The Desktop Rate Site("+URL_Site3+") is = "+rateDes);
        driver.close();
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        String apiToken = "1156988319:AAFzV5zNcaMbKHraLpZyiDjayxfWq-yZ_v8";
        String chatId = "-430318664";
        String text = "Test site("+URL_Site3+")  Mobile Rate is = "+rateMob+"   Desktop Rate is = "+rateDes;
        urlString = String.format(urlString, apiToken, chatId, text);
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
