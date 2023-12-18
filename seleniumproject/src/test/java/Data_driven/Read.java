package Data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {

		
		FileInputStream file=new FileInputStream("D:\\seleniumworkspace\\seleniumproject\\testdata\\pravin.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int totalrow=sheet.getLastRowNum();
		System.out.println(totalrow);
		
		int totalcell=sheet.getRow(0).getLastCellNum();
		System.out.println(totalcell);
		for(int r=0;r<=totalrow;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<totalcell;c++)
			{
				String value=row.getCell(c).toString();
				System.out.println(value);
			}

			System.out.println();
		}
		
		
		
		
		
	}

}
