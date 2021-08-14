

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.connect.spi.Connection;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\\\seliniumfile\\\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Implicit wait for browser
	  wb.manage().window().maximize();	//Maximize the window
	    
	      wb.get("https://www.amazon.in");
	      wb.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("AppleMobiles");
	    	  wb.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();;
	    	  Thread.sleep(3000);
	    	  //To get print of first product of name and price
	    	  By ProductName=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span");
	    	  By Pprice=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]");
	    	  String prod1= wb.findElement(ProductName).getText();
	    	  String pro1=wb.findElement(Pprice)  .getText(); 
	    	
	    	  System.out.println("First Product Name:" + prod1); 
	    	  System.out.println("First Product Price: " + pro1);
	    		  
	    	  
	    	  //To get print of second product of name and price 
	    	  By ProductName2=By.cssSelector("div:nth-of-type(4)  .celwidget.slot\\=MAIN.template\\=SEARCH_RESULTS.widgetId\\=search-results .a-link-normal.a-text-normal > .a-color-base.a-size-medium.a-text-normal"); 
	    	  By Pprice2=By.cssSelector("div:nth-of-type(3) > .sg-col-inner > .celwidget.slot\\=MAIN.template\\=SEARCH_RESULTS.widgetId\\=search-results .a-link-normal.a-size-base.a-text-normal > .a-price  .a-price-whole"); 
	    	  String prod2= wb.findElement(ProductName2).getText(); 
	    	  String pro2=wb.findElement(Pprice2).getText(); 
	    	  System.out.println("Second Product Name:" + prod2); 
	    	  System.out.println("Second Product Price: " + pro2);
	    		  
	}
	public void afterTest() {
		  WebDriver wb = new ChromeDriver();
		wb.quit();
}}
	    	  
	    	  