package Asel.Java.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursHmwrk {

	public static <WorkBook> void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\TestDataS\\newTours.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sheet2");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");

		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> listData = new ArrayList<>();

		for (int r = 1; r < row; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			driver.findElement(By.linkText("REGISTER")).click();
			for (int c = 0; c < col; c++) {
				String key = sheet.getRow(0).getCell(c).toString();

				String value = sheet.getRow(r).getCell(c).toString();

				map.put(key, value);

				switch (key) {
				case "firstName":
					driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(map.get(key));
					break;
				case "lastName":
					driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(map.get(key));
					break;
				case "Phone":
					driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(map.get(key));
					break;
				case "Email":
					driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(map.get(key));
					break;
				case "Adress":
					driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(map.get(key));
					break;
				case "City":
					driver.findElement(By.cssSelector("input[name='city']")).sendKeys(map.get(key));
					break;
				case "State":
					driver.findElement(By.cssSelector("input[name='state']")).sendKeys(map.get(key));
					break;
				case "Country":
					driver.findElement(By.cssSelector("select[name='country']")).sendKeys(map.get(key));
                    break;
				case "UserName":
					driver.findElement(By.cssSelector("input[id='email']")).sendKeys(map.get(key));
					break;
				case "Password":
					driver.findElement(By.cssSelector("input[name='password']")).sendKeys(map.get(key));
					break;
				case "Confirmpassword":
					Thread.sleep(3000);
					driver.findElement(By.cssSelector("input[name*='firm']")).sendKeys(map.get(key));
					//driver.findElements(By.xpath("//input[@name='register']")).submit();
					break;
				}
				
			}
			
			  Thread.sleep(6000);
	            driver.findElement(By.xpath("//input[@name='register']")).click();
			

			
		}

	}

}
