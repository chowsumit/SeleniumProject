package SeleniumProject1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumprogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demoqa.com";
		String expectedTitle = "ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation";
		String actualTitle;
		
		driver.get(url);
		driver.manage().window().maximize();
		
		actualTitle=driver.getTitle();
		
		System.out.println(actualTitle);
		
		
		if (actualTitle.equals(expectedTitle)){
			System.out.println("Yes");			
		}else{
			System.out.println("Fail");
		}
		
		driver.close();
		
	}

}
