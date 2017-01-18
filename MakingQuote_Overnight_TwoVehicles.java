package JunitOvernightTwoVehicles;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakingQuote_Overnight_TwoVehicles {

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
		// select.selectByVisibleText("master");
		select.selectByVisibleText("za_nikitu");

		WebElement element1 = driver.findElement(By.xpath("//input[@value='Deploy']"));
		element1.click();

		WebElement element2 = driver.findElement(By.id("subject_name"));
		element2.sendKeys("test.user3@azonmedia.com");

		WebElement element3 = driver.findElement(By.id("password"));
		element3.sendKeys("Rome419$");

		WebElement element4 = driver.findElement(By.id("loginform_submit"));
		element4.click();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		WebDriver newWindow = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		newWindow.navigate()
				.to("http://192.168.0.95/PROJECTS/uscoachways_2/uscoachwaysonline-com-niki/clear_cache.php");
		newWindow.quit();

		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);

		WebElement element5 = driver.findElement(By.linkText("New Quote Call"));

		element5.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var element = document.getElementsByClassName('fancybox-overlay'); console.log(element[0]);");

		WebElement element6 = driver.findElement(By.id("did"));

		Select select1 = new Select(element6);
		select1.selectByVisibleText("USC_Repeat Client");

		WebElement element7 = driver.findElement(By.name("client_first_name"));
		element7.sendKeys("Nikoleta");

		WebElement element8 = driver.findElement(By.name("client_last_name"));
		element8.sendKeys("Nedelkova");

		WebElement element9 = driver.findElement(By.id("quote_type"));

		Select select2 = new Select(element9);
		select2.selectByVisibleText("Repeat customer");

		WebElement element10 = driver.findElement(By.name("client_phone"));
		element10.sendKeys("666666666");

		// JavascriptExecutor js5 = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('step_1_proceed').click()");

		// WebElement element100 =
		// driver.findElement(By.name("client_phone_ext"));
		// element100.click();

		// WebElement element13 =
		// driver.findElement(By.xpath(".//*[@id='mainform']/div[3]/p/a[1]"));
		// WebElement element13 =
		// driver.findElement(By.xpath("//a[@onclick='return
		// com.uscoachways.matrix.quotes.create_quote.step1.proceed();']"));
		// element13.click();

		// WebDriverWait firstContinueButton = new WebDriverWait(driver, 5000);
		// firstContinueButton.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Start
		// Call")))).click();

		// new Actions(driver).moveToElement(element13).click().perform();

		WebElement element11 = driver.findElement(By.id("charter_start_state"));
		Select select3 = new Select(element11);
		select3.selectByVisibleText("MA (Massachusetts)");

		WebElement element12 = driver.findElement(By.id("charter_type"));
		Select select4 = new Select(element12);
		select4.selectByVisibleText("Birthday");

		WebElement element13 = driver.findElement(By.id("definitely_book"));
		Select select5 = new Select(element13);
		select5.selectByVisibleText("Yes");

		WebElement element14 = driver.findElement(By.id("charter_trip_type"));
		Select select6 = new Select(element14);
		select6.selectByVisibleText("Overnight Trip");

		WebElement element15 = driver.findElement(By.id("book_hotel_room"));
		Select select7 = new Select(element15);
		select7.selectByVisibleText("Yes");

		WebElement element16 = driver.findElement(By.id("local_usage"));
		Select select8 = new Select(element16);
		select8.selectByVisibleText("Yes");

		WebElement element17 = driver.findElement(By.id("local_usage_reason"));
		element17.sendKeys("test test test");

		WebElement element18 = driver.findElement(By.id("charter_people_count"));
		element18.sendKeys("8");

		WebElement element19 = driver.findElement(By.id("charter_itinerary_0__it_zipcode"));
		element19.sendKeys("02657");

		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

		WebElement element20 = driver.findElement(By.id("charter_itinerary_0__it_depart_time_hrs"));
		Select select9 = new Select(element20);
		select9.selectByVisibleText("12 AM");

		WebElement element21 = driver.findElement(By.id("charter_itinerary_0__it_depart_time_mins"));
		Select select10 = new Select(element21);
		select10.selectByVisibleText("10");

		WebElement element22 = driver.findElement(By.id("charter_itinerary_0__it_date"));
		element22.click();

		WebElement element23 = driver.findElement(By.id("ui-datepicker-div"));
		element23.click();

		WebElement element24 = driver.findElement(By.xpath(".//*[@class='ui-datepicker-month']"));
		Select select11 = new Select(element24);
		select11.selectByVisibleText("Dec");

		WebElement element25 = driver.findElement(By.xpath(".//*[@class='ui-datepicker-year']"));
		Select select12 = new Select(element25);
		select12.selectByVisibleText("2017");

		WebElement element26 = driver.findElement(By.linkText("28"));
		element26.click();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		WebElement element27 = driver.findElement(By.id("charter_itinerary_1__it_zipcode"));
		element27.sendKeys("02108");

		WebElement element28 = driver.findElement(By.id("charter_itinerary_2__it_city"));
		element28.click();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

		WebElement element29 = driver.findElement(By.id("charter_itinerary_2__it_depart_time_hrs"));
		element29.sendKeys("1 PM");

		WebElement element30 = driver.findElement(By.id("charter_itinerary_2__it_depart_time_mins"));
		element30.sendKeys("10");

		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

		WebElement element31 = driver.findElement(By.id("charter_itinerary_2__it_date"));
		// element34.clear();
		element31.sendKeys("12-31-2017");

		WebElement element32 = driver.findElement(By.id("charter_itinerary_3__it_city"));
		element32.click();

		WebElement element33 = driver.findElement(By.id("charter_itinerary_3__it_depart_time_hrs"));
		element33.sendKeys("3 PM");

		WebElement element34 = driver.findElement(By.id("charter_itinerary_3__it_depart_time_mins"));
		element34.sendKeys("10");

		WebElement element35 = driver.findElement(By.id("charter_itinerary_3__it_date"));
		element35.clear();
		element35.sendKeys("12-31-2017");

		WebElement element36 = driver.findElement(By.id("charter_itinerary_3__it_notes"));
		element36.click();
		
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

		js.executeScript("document.getElementById('step_2_proceed').click()");

		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

		Select select13 = new Select(driver.findElement(By.id("vehicle_type_id_")));
		select13.selectByValue("21");

		Select select14 = new Select(driver.findElement(By.xpath("//*[@data-select-count='2']")));
		select14.selectByValue("26");

		js.executeScript("document.getElementById('step_3_proceed').click()");

		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

		WebElement element37 = driver.findElement(By.id("step_4_proceed"));
		js.executeScript("arguments[0].scrollIntoView();", element37);

		js.executeScript("document.getElementById('step_4_proceed').click()");

		WebElement element38 = driver.findElement(By.id("client_email"));
		element38.sendKeys("nikoleta@azonmedia.com");

		WebElement element39 = driver.findElement(By.id("client_email_verification"));
		element39.sendKeys("nikoleta@azonmedia.com");

		WebElement element40 = driver.findElement(By.id("client_mobile"));
		element40.sendKeys("(666) 666-666");

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		WebElement element41 = driver.findElement(By.id("client_phone"));
		element41.sendKeys("0");

		WebElement element42 = driver.findElement(By.id("charters_per_year"));
		Select select15 = new Select(element42);
		select15.selectByVisibleText("2");

		WebElement element43 = driver.findElement(By.id("client_book_driver_room"));
		Select select16 = new Select(element43);
		select16.selectByVisibleText("Yes, I have already booked");

		WebElement element44 = driver.findElement(By.id("reserve_today"));
		Select select17 = new Select(element44);
		select17.selectByVisibleText("Yes");

		js.executeScript("document.getElementById('step_5_proceed').click()");

		WebElement element45 = driver.findElement(By.id("call_disposition"));
		Select select18 = new Select(element45);
		select18.selectByVisibleText("Hang up");

		js.executeScript("jQuery('#charter_quote_callback_time').datepicker('setDate', '01-01-2020')");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		js.executeScript("document.getElementById('step_6_proceed').click()");

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	//	WebElement assert1 = driver.findElement(By.linkText("Call completed"));
	//	boolean bool = assert1.isDisplayed();
	//	Assert.assertEquals(true, bool);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
	}
}

