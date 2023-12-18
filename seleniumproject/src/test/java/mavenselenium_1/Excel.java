package mavenselenium_1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("D:\\seleniumworkspace\\seleniumproject\\testdata\\pravin.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		    
		 // System.out.println(sheet.getLastRowNum());
		int row=sheet.getLastRowNum();
		System.out.println(row);
		
	int col=sheet.getRow(1).getLastCellNum();
	System.out.println(col);
	
	for(int r=0; r <= row ;r++)
	{
		XSSFRow currow=	sheet.getRow(r);
	
	 for(int c=0;c< col;c++ )
	 {
		//String value= currow.getCell(c).toString();
		 XSSFCell cell=currow.getCell(c);
		 String value= cell.toString();
		 System.out.print(value+"    ");
	 }
	 System.out.println();
	}
	workbook.close();
	file.close();

	}
}
