package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

public class gmailSteps {
	
	WebDriver driver;
	
	@Then("User login to gmail with username {string}")
	public void login(String str1) {
		
		driver.findElement(By.id("identifierId")).sendKeys(str1); 

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      

        WebDriverWait wait=new WebDriverWait(driver, 20);               

        //driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        /*
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='whsOnd zHQkBf']")));

        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(str2);             

        //driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
        */
	}
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\MyWorkspaces\\Project Folder\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        
		
        System.out.println("Launching Browser");
	}

	@When("User opens the gmail login page")
	public void user_opens_the_gmail_login_page() {
		driver.get("https://mail.google.com/");
		//if(driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).isDisplayed())
		//	driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[4]/div/div/div[2]")).click();	    
	}

	@And("password {string}")
	public void and_password(String string) {
		/*
		WebElement emailBox=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		//emailBox.clear();
		emailBox.sendKeys(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement next1=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		//wait.until(ExpectedConditions.elementToBeClickable(next1));
		next1.click();
		*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement passBox=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(string);
		
		//passBox.clear();
		//passBox.sendKeys(string);
		WebElement next2=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		//wait.until(ExpectedConditions.elementToBeClickable(next2));
		next2.click();
	   
	}
	

	@And("User clicks on the compose button")
	public void user_clicks_on_the_compose_button() throws Exception {
		
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		
		//driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\":3m\"]/div/div")).click();
		//*[@id=":3q"]/div/div
		//*[@id=":3q"]/div/div
		//*[@id=":3m"]/div/div
	   
	}

	@Then("Check the New Message box appears")
	public void check_the_new_message_box_appears() {
		boolean st = false;
		
				st=driver.findElement(By.xpath("//span[text()='New Message']")).isDisplayed();
			 st=true;
		Assert.assertEquals(true, st);
		
	   
	}
	
	@Then("User composes mail with To {string} Subject {string} Body {string}")
	public void composeMail(String st1, String st2, String st3) {
		
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(st1);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(st2);
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys(st3);
		
		
	}
	@And("clicks Send")
	public void clickSend() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")));
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		Thread.sleep(10000);
		
	}
	
	@Then("close the browser")
	public void closeBrowser() {
		driver.quit();
	}
	

}
