package assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cartify {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cartify.pk/");
		driver.findElement(By.xpath("(//span[text()='Shop By Categories'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='collection-grid-item__title h3'])[3]")).click();
		WebElement Cloth = driver.findElement(By.xpath("//span[text()='Floor-Standing Cloth Rack With Wheels']"));
		JavascriptExecutor Executer = (JavascriptExecutor) driver;  
		Executer.executeScript("arguments[0].click();", Cloth);
		driver.findElement(By.xpath("//button[@name='add']")).click();
		driver.findElement(By.xpath("//a[@class='cart-popup__cta-link btn btn--secondary-accent']")).click();
		WebElement Subtotal = driver.findElement(By.xpath("//span[text()='Rs.10,500.00 PKR']"));
		System.out.println(Subtotal.getText());
		driver.quit();
		
	}
}
