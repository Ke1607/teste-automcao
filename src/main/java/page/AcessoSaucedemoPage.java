package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AcessoSaucedemoPage {

	WebDriver driver = new FirefoxDriver();

	public void acesso() {

		// WebDriver driver = new FirefoxDriver();
		driver.get("http://www.saucedemo.com");

	}

	public void login() {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	public void ordenacao() {

		WebElement Element = driver.findElement(By.className("product_sort_container"));
		Select combo = new Select(Element);
		combo.selectByValue("lohi");

	}

	public void adicao() {

		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();

	}

	public void carrinho() {

		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();

	}

	public void formulario() throws InterruptedException {

		driver.findElement(By.id("first-name")).sendKeys("Keila");
		driver.findElement(By.id("last-name")).sendKeys("Aquino");
		driver.findElement(By.id("postal-code")).sendKeys("73350205");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
	}

	public String getMensagemSucesso() throws InterruptedException {
		String texto = driver.findElement(By.id("checkout_complete_container")).getText();
		return texto;
	}

	public void sair() {
		driver.close();
	}

}
