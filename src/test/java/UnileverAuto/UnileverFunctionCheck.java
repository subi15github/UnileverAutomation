package UnileverAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UnileverFunctionCheck extends baseTest {
	 WebDriver driver;

	    @Test
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.unilever.com/");
	        driver.manage().window().maximize();
	        
	    }
	    @Test
	    public void acceptCookiesIfPresent() {
	        try {
	            WebElement cookie = driver.findElement(By.id("onetrust-accept-btn-handler"));
	            if (cookie.isDisplayed()) cookie.click();
	        } catch (Exception ignored) {}
	    }
	    @Test
	    public void VerifyOurCompanyLink() {
	    	driver.findElement(By.xpath("//button[@id='uco-header-menu-0-0']")).click();
	    }
	    @Test
	    public void VerifyNewsLink() {
	    	driver.findElement(By.xpath(" //button[@id='uco-header-menu-0-1']")).click();
	    }
	    
	    @Test
	    public void VerifyLatestNews() {
	    	driver.findElement(By.xpath("//span[normalize-space()='View Latest news stories']")).click();
	    }
	    
	    @Test
	    public void VerifySignup() {
	    	driver.findElement(By.xpath("//span[normalize-space()='Sign up for email alerts']")).click();
	    }
	    @Test
	    public void VerifySuppliersLink() {
	    	driver.findElement(By.xpath("//button[@id='uco-header-menu-0-4']")).click();
	    }
	    @Test
	    public void VerifyViewSuppliersLink() {
	    	driver.findElement(By.xpath("//span[normalize-space()='View Suppliers']")).click();
	    }
	    @Test
	    public void VerifySustainabilityLink() {
	    	driver.findElement(By.xpath("//button[@id='uco-header-menu-0-1']")).click();
	    }
	    
	    @Test
	    public void VerifyInvestersLink() {
	    	driver.findElement(By.xpath("//button[@id='uco-header-menu-0-6']")).click();
	    }
	    @Test
	    public void VerifyBrandsLink() {
	    	driver.findElement(By.xpath("//button[@id='uco-header-menu-0-2']")).click();
	    }
	    @Test
	    public void VerifyViewBrandsLink() {
	    	driver.findElement(By.xpath("//span[normalize-space()='View Brands']")).click();
	    }
	    @Test
	    public void VerifyExploreBrandsLink() {
	    	driver.findElement(By.xpath("//span[normalize-space()='Explore more brands']")).click();
	    }
	    
	    @Test
	    public void VerifySearchBrandsLink() {
	    	driver.findElement(By.xpath("//input[@id='keywords']")).sendKeys("closeup");
	    }
	    @Test
	    public void VerifySearchBrandsBtn() {
	    	driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
	    }
	    @Test
	    public void VerifyCareersLink() {
	    	driver.findElement(By.xpath("//a[@id='uco-header-menu-0-5']")).click();
	    }
	    @Test
	    public void VerifyCareersSearchLink() {
	    	driver.findElement(By.xpath("//span[contains(text(),'Visit our careers site to start your job search')]")).click();
	    }
	    @Test
	    public void VerifyViewCompany() {
	    	driver.findElement(By.xpath("//span[normalize-space()='View Our company']")).click();
	    }
	    @Test
	    public void VerifyContactUs() {
	    	driver.findElement(By.xpath("//span[normalize-space()='Contact us']")).click();
	    }
	    
	    @Test
	    public void teardown() {
	    	driver.quit();
	    }

}
