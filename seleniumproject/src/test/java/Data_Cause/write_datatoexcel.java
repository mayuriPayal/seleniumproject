package Data_Cause;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_datatoexcel {

	public static void main(String[] args) throws IOException {

		
		FileInputStream file=new FileInputStream("D:\\seleniumworkspace\\seleniumproject\\testdata\\pravin.xlsx");
	   XSSFWorkbook workbook =new XSSFWorkbook(file);
	   XSSFSheet sheet=workbook.getSheet("sheet1");
	  int row= sheet.getLastRowNum();
	System.out.println(row);
	 int cell=sheet.getRow(1).getLastCellNum();
	
	System.out.println(cell);
	}

}
