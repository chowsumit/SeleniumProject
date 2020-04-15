package SeleniumProject1.SeleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelreadwrite {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		File src = new File("E:\\Eclipse_Workspace\\newproject\\Datatable\\Datasheet.xlsx");
		
		FileInputStream fis = new FileInputStream(src);  
		
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
	}

	
	} 


