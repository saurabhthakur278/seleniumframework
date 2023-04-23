package MyStore1.seleniumframework;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standalon {
	public static void main(String [] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/client");

driver.findElement(By.id("userEmail")).sendKeys("tsaurabh278@gmail.com");
driver.findElement(By.id("userPassword")).sendKeys("Qwerty@123");
driver.findElement(By.id("login")).click();

List<WebElement>  list=driver.findElements(By.cssSelector(".mb-3"));

WebElement prod=list.stream().filter(product->product.findElement(By.xpath("//h5/b")).getText().equals("zara coat 3")).findFirst().orElse(null);
     //Thread.sleep(4000);
      prod.findElement(By.xpath("(//button[@class=\"btn w-10 rounded\"])[2]")).click();
}
	
}