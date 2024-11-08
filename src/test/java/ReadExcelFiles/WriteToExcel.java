package ReadExcelFiles;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Utils\\WriteToExcel.xlsx");
		
		//create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//create sheet
		XSSFSheet sheet = 	workbook.createSheet("MySheet");
			
		//create row0
		XSSFRow row0 = sheet.createRow(0);
			//create cell and load data
			row0.createCell(0).setCellValue("Apple");
			row0.createCell(1).setCellValue("120 rs");
			row0.createCell(2).setCellValue("Kg");
		
		//create row1
		XSSFRow	row1 = sheet.createRow(1);
			row1.createCell(0).setCellValue("Mango");
			row1.createCell(1).setCellValue("200 rs");
			row1.createCell(2).setCellValue("Kg");
		
		//config workbook and file
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("Ecxel sheet created....");
	}

}
