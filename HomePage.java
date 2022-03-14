package savingaccount;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8082/SavingsAccount");
	
	//Admin
	driver.findElement(By.xpath("//a[contains(text(),'Admin')]")).click();
	
	try {
		
	Alert alert=driver.switchTo().alert();
	alert.accept();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	
	Actions act=new Actions(driver);
	
	WebElement target=driver.findElement(By.xpath("//a[contains(text(),'Transaction')]"));
	act.moveToElement(target).perform();
	Thread.sleep(10000);
	WebElement putter=driver.findElement(By.xpath("//a[contains(text(),'Customer')]"));
	act.click(putter).perform();
	
	//customer page
	WebElement inv=driver.findElement(By.xpath("//*[@id=\"AddCustomer\"]/table/tbody/tr[2]/td[2]/select"));
	Select sel=new Select(inv);
	System.out.println("can we select more than one value :"+sel.isMultiple());
	sel.selectByVisibleText("corporate");
	WebElement radio1 =driver.findElement(By.id("Miss"));
	WebElement radio2 =driver.findElement(By.id("Master"));
	WebElement radio3 =driver.findElement(By.id("Mr"));
	WebElement radio4 =driver.findElement(By.id("Mrs"));
	radio1.click();
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("Pooja");
	driver.findElement(By.xpath("//tbody/tr[4]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[4]/td[4]/input[1]")).sendKeys("Pranav");
	driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("Kale");
	driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).sendKeys("7625242960");
	driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input[1]")).sendKeys("31-03-1996");
	driver.findElement(By.xpath("//tbody/tr[6]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[6]/td[4]/input[1]")).sendKeys("abcd32@gmail.com");
	
	WebElement gender1=driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
	WebElement gender2=driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[2]"));
	WebElement gender3=driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[3]"));
	gender2.click();
	
	driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Mouli Colony");
	driver.findElement(By.xpath("//tbody/tr[8]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[8]/td[4]/input[1]")).sendKeys("Ganga Nagar");
	driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Hadapsar");

	driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("Pune");
	driver.findElement(By.xpath("//tbody/tr[9]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[9]/td[4]/input[1]")).sendKeys("444809");
	
	driver.findElement(By.xpath("//tbody/tr[10]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[10]/td[4]/input[1]")).sendKeys("Maharashtra");
	
	driver.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).sendKeys("India");
	
	driver.findElement(By.xpath("//tbody/tr[11]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[11]/td[4]/input[1]")).sendKeys("Indian");
	
	driver.findElement(By.xpath("//tbody/tr[12]/td[2]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[12]/td[2]/input[1]")).sendKeys("ECMK2348LK");
	
	driver.findElement(By.xpath("//tbody/tr[12]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[12]/td[4]/input[1]")).sendKeys("234556780980");
	
	WebElement marrital_status1=driver.findElement(By.id("Single"));
	WebElement marrital_status2=driver.findElement(By.id("married"));
	WebElement marrital_status3=driver.findElement(By.id("d"));
	WebElement marrital_status4=driver.findElement(By.id("widowed"));
	marrital_status2.click();
	
	driver.findElement(By.xpath("//input[@id='username']")).clear();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("poojakhedkar");
	
	driver.findElement(By.xpath("//tbody/tr[14]/td[4]/input[1]")).clear();
	driver.findElement(By.xpath("//tbody/tr[14]/td[4]/input[1]")).sendKeys("Poojaa31003");
	
	driver.findElement(By.xpath("//tbody/tr[16]/th[1]/input[1]")).click();
	
	try {
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	driver.findElement(By.xpath("//tbody/tr[16]/th[1]/input[2]")).click();
	
	driver.close();
	
	}
	}

