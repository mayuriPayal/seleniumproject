package Data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws IOException {
//reading
		
	FileInputStream file= new FileInputStream("D:\\seleniumworkspace\\seleniumproject\\testdata\\pravin.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	
    int totalrows=sheet.getLastRowNum();
    int totalcells=	sheet.getRow(1).getLastCellNum(); 
	//System.out.println(totalrows);
	//System.out.println(totalcells);
	for(int r=0; r<=totalrows;r++)
	{
		XSSFRow row=sheet.getRow(r);
		
		for(int c=0; c<totalcells;c++)
		{
			String value=row.getCell(c).toString();
			
			System.out.println(value  +   "   ");
		}
		
	}
	
	System.out.println();
	
	}

}
