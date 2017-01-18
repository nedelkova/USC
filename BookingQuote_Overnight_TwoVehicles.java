package JunitOvernightTwoVehicles;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookingQuote_Overnight_TwoVehicles {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikoleta Nedelkova\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.95/deploy_usc_new.php?user=niki");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.name("branch"));

		Select select = new Select(element);
		select.selectByVisibleText("master");
		select.selectByVisibleText("za_nikitu");

		WebElement element1 = driver.findElement(By.xpath("//input[@value='Deploy']"));
		element1.click();

		WebElement element2 = driver.findElement(By.id("subject_name"));
		element2.sendKeys("nikoleta@azonmedia.com");

		WebElement element3 = driver.findElement(By.id("password"));
		element3.sendKeys("nikiwsbg");

		WebElement element4 = driver.findElement(By.id("loginform_submit"));
		element4.click();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		WebElement element5 = driver.findElement(By.linkText("Quotes"));
		element5.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object quote_id = js.executeScript(
				"var element = document.getElementsByClassName('booking_number'); var i; var id= element[0].innerText.replace('QUOTE #', '');var tmp_id; for (i = 0; i < element.length; i++) {tmp_id = element[i].innerText.replace('QUOTE #', '');if (id < tmp_id){id = tmp_id;}} return id; ");
		System.out.println(quote_id);

		driver.get(
				"http://192.168.0.95/PROJECTS/uscoachways_2/uscoachwaysonline-com-niki/app/site/p/charters/c/client_manage_charter/a/confirm/id/"
						+ quote_id);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement element6 = driver.findElement(By.name("it_address[0]"));
		element6.sendKeys("Test Test");

		WebElement element7 = driver.findElement(By.name("it_address[1]"));
		element7.sendKeys("Test Test");

		WebElement element8 = driver.findElement(By.name("it_address[4]"));
		element8.sendKeys("test test");
		
		WebElement element9 = driver.findElement(By.name("it_address[5]"));
		element9.sendKeys("test test");
		
		WebElement element10 = driver.findElement(By.name("charter_onsite_contact_name"));

		element10.sendKeys("Nikoleta");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element11 = driver.findElement(By.name("charter_onsite_contact_phone"));
		element11.sendKeys("66666666");

		WebElement element12 = driver.findElement(By.id("arrow_next"));
		js.executeScript("arguments[0].scrollIntoView();", element12);
		js.executeScript("document.getElementById('arrow_next').click()");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		WebElement element13 = driver.findElement(By.xpath("//label[@for='vehicle_type_id_26']"));
		js.executeScript("arguments[0].scrollIntoView();", element13);
		js.executeScript("document.getElementById('vehicle_type_id_26').click()");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		WebElement element14 = driver.findElement(By.id("arrow_next"));
		js.executeScript("arguments[0].scrollIntoView();", element14);
		js.executeScript("document.getElementById('arrow_next').click()");

		WebElement element15 = driver.findElement(By.id("btn_payWire"));
		element15.click();

		WebElement element16 = driver.findElement(By.id("charter_wire_terms_client_agree"));
		element16.click();

		WebElement element17 = driver.findElement(By.id("arrow_next"));
		js.executeScript("arguments[0].scrollIntoView();", element17);
		js.executeScript("document.getElementById('arrow_next').click()");

		WebElement element18 = driver.findElement(By.id("charter_client_agree_terms"));
		element18.click();

		Actions builder = new Actions(driver);

		WebElement element19 = driver.findElement(By.xpath(".//*[@id='signature']/canvas"));
		builder.build();

		builder.moveToElement(element19, 10, 10).clickAndHold().moveByOffset(40, 60).moveByOffset(20, 10).release();

		builder.perform();
		
		WebElement element20 = driver.findElement(By.id("charter_client_agree_purchase"));
		element20.click();

		//WebElement element18 = driver.findElement(By.id("arrow_next"));
		//element18.click();

		WebElement element21 = driver.findElement(By.id("arrow_next"));
		js.executeScript("arguments[0].scrollIntoView();", element21);

		js.executeScript("document.getElementById('arrow_next').click()");
	}
}



