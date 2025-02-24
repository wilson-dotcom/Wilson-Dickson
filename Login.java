package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Login {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		
        WebElement emailbox = driver.findElement(By.id("Email"));
        emailbox.clear();
        emailbox.sendKeys("admin@yourstore.com");
        
        WebElement passwordbox =driver.findElement(By.xpath("//input[@id='Password']"));
        passwordbox.clear();
        passwordbox.sendKeys("admin");
        
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        submitButton.click();
        
        driver.getTitle();
        System.out.println("Tittle on landingpage : admin-demo.nopcommerce.com");
        	
        driver.close();
        driver.quit();
        
	
	}

}
