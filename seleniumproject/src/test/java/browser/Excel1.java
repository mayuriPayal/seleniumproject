package browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException 
	{
FileInputStream file=new FileInputStream("D:\\seleniumworkspace\\seleniumproject\\testdata\\pravin.xlsx");

XSSFWorkbook workbook =new XSSFWorkbook(file);

XSSFSheet sheet=workbook.getSheet("sheet1");

int totalrow= sheet.getLastRowNum();
int totalcol=sheet.getRow(1).getLastCellNum();
System.out.println(totalrow);
System.out.println(totalcol);

for(int r=0;r<=totalrow;r++)
{
	XSSFRow row=sheet.getRow(r);

for(int c=0;c<totalcol;c++)
{
	XSSFCell cell=row.getCell(c);
	String value=cell.toString();
	System.out.println(value);
}

}
workbook.close();
}
}