package testolivegarden;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestOg {
	public static void main(String[] args) throws InterruptedException, IOException, MoveTargetOutOfBoundsException,IndexOutOfBoundsException
	{

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.olivegarden.com/home");
	driver.manage().window().maximize();
	WebElement login=driver.findElement(By.xpath("//*[@id='header-login-link']"));
	login.click();
	
    WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(120));
	w.until(ExpectedConditions.presenceOfElementLocated(By.id("customerLogoutId")));
	WebElement register=driver.findElement(By.id("customerLogoutId"));
	register.click();

	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(120));
	w1.until(ExpectedConditions.presenceOfElementLocated(By.id("email-id")));
	WebElement email=driver.findElement(By.id("email-id"));
	email.sendKeys("abc@gmail.com");
	WebElement fname=driver.findElement(By.name("vfirstName"));
	fname.sendKeys("Ram");
	WebElement lname=driver.findElement(By.name("vlastName"));
	lname.sendKeys("Patil");
	WebElement zipCode=driver.findElement(By.name("vpostalCode"));
	zipCode.sendKeys("445566");
	WebElement phoneNo=driver.findElement(By.name("vphonenumber"));
	phoneNo.sendKeys("9888987656");
	WebElement ext=driver.findElement(By.id("phoneExt"));
	ext.sendKeys("5");
	WebElement phoneType=driver.findElement(By.name("phoneType"));
	Select ddn1=new Select(phoneType);
	ddn1.selectByValue("Home");
	WebElement month=driver.findElement(By.name("vdobMonth"));
	Select ddn2=new Select(month);
	ddn2.selectByValue("2");
	WebElement day=driver.findElement(By.name("vdobDay"));
	Select ddn3=new Select(day);
	ddn3.selectByValue("11");
	WebElement year=driver.findElement(By.xpath("//*[@name='vdobYear']"));
	Select ddn4=new Select(year);
	ddn4.selectByValue("1998");
	WebElement psw=driver.findElement(By.xpath("//*[@name='vpassword']"));
	psw.sendKeys("1234556");
	WebElement findResto=driver.findElement(By.xpath("//*[@id='selectRestaurant']"));
	findResto.click();
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(4000);

	//---------Careers---------------
	driver.get("https://www.olivegarden.com/customer-service/registration?redirectURL=%2fcustomer-service%2faccount-login&_requestid=10266");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
	Thread.sleep(4000);
	WebDriverWait w11=new WebDriverWait(driver,Duration.ofSeconds(120));
	w11.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'https://jobs.olivegarden.com/\']")));
	 WebElement careers=driver.findElement(By.xpath("//*[@id=\'https://jobs.olivegarden.com/\']"));
	 careers.click();
	 ArrayList<String> wh=new ArrayList<String>(driver.getWindowHandles());
	 String mainWinHandId=wh.get(0);
	 for(int i1=1;i1<=wh.size()-1;i1++)
	 {
	 String s=wh.get(i1);
	 driver.switchTo().window(s);
	 WebElement position=driver.findElement(By.xpath("//a[text()='Restaurant Manager']"));
	 position.click();
	 WebElement cookies=driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']"));
	 cookies.click();
	 Thread.sleep(4000);
	 List<WebElement> hotels=driver.findElements(By.xpath("//table[@class='jtable ui-widget-content']/tbody/tr[@role='link']/td[@class='reference-number-column']/span"));
	 String a1="58eb8ae7-a50e-4d72-bb8f-0ee46858d7fe";
	 String myData11="24712";
	 System.out.println(hotels.size());
	 for(int i11=0; i11<=hotels.size()-1;i11++)
	 {
	 WebElement one1=hotels.get(i11);
	 String dt1=one1.getText();
	   System.out.println(dt1);
	 if(dt1.equals(myData11))
	 {
	 WebElement locationID=driver.findElement(By.xpath("//table[@class='jtable ui-widget-content']/tbody/tr[@data-record-key='"+a1+"']"));
	 locationID.click();
	 break;
	 }

	 }

	 }
	 driver.switchTo().window(mainWinHandId);
	 Thread.sleep(8000);
	WebElement catering=driver.findElement(By.xpath("//a[@class='desktop-nav-link' and @id='Notification-Bar-Careers-link']"));
	catering.click();
	WebElement orderDelivery=driver.findElement(By.xpath("//a[@data-link-info='CATERING EN ORDER DELIVERY']"));
	orderDelivery.click();
	WebElement streetAddress=driver.findElement(By.xpath("//input[@placeholder='Enter Street Address*']"));
	streetAddress.sendKeys("Fashion Street,Texas");
	WebElement apartment=driver.findElement(By.xpath("//input[@placeholder='Suite / Apartment #']"));
	apartment.sendKeys("Apartment Asawari");
	WebElement addressType=driver.findElement(By.xpath("//select[@aria-label=\"Address type\"]"));
	Select ddn=new Select(addressType);
	ddn.selectByValue("Business");
	//------------Contact us--------------
	 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 Thread.sleep(2000);
	WebElement contactUs=driver.findElement(By.xpath("//*[@id='/contact-us']"));
	contactUs.click();
	List<WebElement> contactUsQues=driver.findElements(By.xpath("//div[@class='col-lg-8 col-md-12 order-first order-md-1']/div[@class='questions']/h4[@role='presentation']"));
	String myData11="Does Olive Garden have a rewards program?";
	System.out.println(contactUsQues.size());
	for(int i1=0; i1<=contactUsQues.size()-1;i1++)
	{
	WebElement one1=contactUsQues.get(i1);
	String dt1=one1.getText();
	 System.out.println(dt1);
	if(dt1.equals(myData11))
	{
	WebElement que=driver.findElement(By.xpath("//div[@class='questions']/h4[6]"));
	que.click();
	Thread.sleep(2000);
	break;
	}
	}
	 driver.close();
	}
	}



