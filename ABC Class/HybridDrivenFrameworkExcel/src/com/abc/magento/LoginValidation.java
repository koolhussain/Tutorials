package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {
	static XSSFSheet sheet;
	static ChromeDriver driver;

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Ahmad\\eclipse-workspace\\HybridDrivenFrameworkExcel\\src\\com\\abc\\utilities\\hybrid.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);

		for (int i = 1; i < numberOfRows; i++) {
			String action = getCellValue(i, 2);

			switch (action) {
			case "open":
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			case "navigate":
				driver.get(getCellValue(i, 4));
				break;
			case "click":
				driver.findElement(By.xpath(getCellValue(i, 3))).click();
				break;
			case "type":
				driver.findElement(By.xpath(getCellValue(i, 3))).sendKeys(getCellValue(i, 4));
				break;
			case "quit":
				driver.close();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

	public static String getCellValue(int row, int col) {
		XSSFRow r1 = sheet.getRow(row);
		XSSFCell c1 = r1.getCell(col);
		String data = c1.getStringCellValue();
		return data;
	}
}