package ExcelUtilityPack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// this is common excel code for reading and writing the data from excel
public class ExcelUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb ;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;	
	public static XSSFCellStyle cellStyle;	

	public static int getRowCount(String xlfile, String xlsheet) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getcellcount(String xlfile, String xlsheet, int rownum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		int cellcount =row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	public static String getcelldata(String xlfile, String xlsheet, int rownum, int cellnum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell =row.getCell(cellnum);
		
		String data;
		try
		{
			data = cell.toString();
		/*	DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell); //returns formatted value of cell as string regards of cell value 
		*/	
		}
		catch(Exception e)
		{
			data= "";
		}
		
		wb.close();
		fi.close();
		return data;				
	}
	public static void setcelldata(String xlfile, String xlsheet, int rownum, int cellnum, String putdata ) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		cell =row.createCell(cellnum);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
		
	}
}
