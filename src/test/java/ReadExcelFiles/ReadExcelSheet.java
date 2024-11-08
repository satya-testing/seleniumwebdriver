package ReadExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Utils\\SeleniumExcelPractice.xlsx");
	//	FileInputStream file = new FileInputStream(System.getProperty("C:\\Users\\Satyanarayana.patil\\OneDrive - Entain Group\\Desktop\\SeleniumExcelPractice.xlsx"));

		
		XSSFWorkbook workbook = new XSSFWorkbook(file);	
		XSSFSheet sheet = workbook.getSheet("Data");
		 
		 //total rows in a sheet
		 int totalRows= sheet.getLastRowNum();
		 System.out.println("Total number of rows in a sheet :"+totalRows);
		 
		 //total no. of cells in each row
		 int totalCells = sheet.getRow(0).getLastCellNum();
		 System.out.println("Total number of cells in each row :"+ totalCells);
		 
		 //now go to each cell in row and print the values
		 for(int row = 0; row<=totalRows; row ++)
		 {
			//XSSFRow 	currentRow = sheet.getRow(row);
			 for(int cell= 0; cell<totalCells; cell++)
			 {
			//	 XSSFCell currentCell = 	currentRow.getCell(cell);
				//System.out.print( currentCell.toString()+"\t");
				
				 //sheet > row number > cell number > data present in cell
				System.out.print( sheet.getRow(row).getCell(cell).toString()+"\t");
			 }
			 System.out.println();
		 }
			
		 workbook.close();
		 file.close();
	}

}

