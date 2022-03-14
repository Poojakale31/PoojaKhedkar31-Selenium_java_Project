package savingaccount;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Customer_Deposite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8082/SavingsAccount");
		driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();
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
		WebElement putter=driver.findElement(By.xpath("//a[contains(text(),'Deposit')]"));
		act.click(putter).perform();
		
		
		String expRes="Deposit first_name middle_name last_name";
		String actRes=driver.getTitle();
		try {
			
		
		if(expRes.equals(actRes)) {
			System.out.println("We are on a Customer Deposite page"+actRes);
			
		}
		else {
			System.out.println("We are on a different page"+actRes);
		}
	
	} catch (Exception e) {
		e.printStackTrace();	
		}
   WebElement branch= driver.findElement(By.xpath("//tbody/tr[2]/td[1]/select[1]"));
   Select Sel = new Select(branch);
   System.out.println("Can we select more than one value : "+Sel.isMultiple());
   Sel.selectByIndex(1);
   
   driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).sendKeys("7000");
   driver.findElement(By.xpath("//tbody/tr[4]/th[1]/input[1]")).click();
   String expPrice="7000";
   String actPrice="7000";
   if(expPrice.equals(actPrice)) {
	   System.out.println("Deposit Successful : "+actPrice);
   }
   else {
	   System.out.println("Deposit not Successful :" +actPrice);
   }
   driver.findElement(By.xpath("//tbody/tr[11]/th[1]/input[1]")).click();
   driver.close();
	}
	
}