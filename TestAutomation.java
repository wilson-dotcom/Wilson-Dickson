package Demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class TestAutomation {

	public static void main(String[] args) {


		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



		driver.get("https://www.saucedemo.com/");

		WebElement usernamebox = driver.findElement(By.xpath("//input[@id='user-name']"));
		usernamebox.sendKeys("visual_user");

		WebElement passwordbox = driver.findElement(By.xpath("//input[@id='password']"));
		passwordbox.sendKeys("secret_sauce");

		WebElement loginbutton = driver.findElement(By.cssSelector("#login-button"));
		loginbutton.click(); 


		if (!driver.getTitle().equals("Swag Labs")) {
			System.out.println("Login failed. Test Failed!");

			driver.quit();
			return;
		}

		System.out.println("Login successful.");	



		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();

		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();

		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();

		WebElement shoppingcart = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
		shoppingcart.click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[2]/button[1]")).click();

		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("John");

		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Dew");

		driver.findElement(By.cssSelector("#postal-code")).sendKeys("10001");

		driver.findElement(By.cssSelector("#continue")).click();

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/button[2]")).click();

		WebElement successMessage = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));


		if (successMessage.isDisplayed()) {

			System.out.println("Checkout: Complete! Test Passed");
		}

		else {
			System.out.println("Checkout: Failed! Test Failed");
		}


		driver.close();
		driver.quit();

		

	}
}
