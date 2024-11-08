package ReadExcelFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicData {

	public static void main(String[] args) throws IOException {
		
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Utils\\WriteToExcel_Dynamically.xlsx");
		
		//create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//create sheet
		XSSFSheet sheet = 	workbook.createSheet("Dynamic_data");
		
		//take from input screen
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many row you want?");
			int rowcount = sc.nextInt();
			
			System.out.println("Enter how many cell in each row?");
			int cellcount = sc.nextInt();
			
			//get into each cell in a row and enter data
			for(int r=0; r<=rowcount ; r++)
			{	
				//create row
				XSSFRow currentRow = sheet.createRow(r);
				for(int c=0; c<cellcount; c++)
				{	
					//create cell
					XSSFCell currentCell = 	currentRow.createCell(c);
					currentCell.setCellValue(sc.next());
				}
			}
		
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("Excel is created with dynamic input values...");
	}

}
