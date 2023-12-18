package Data_driven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingIntoExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file=new FileOutputStream("D:\\seleniumworkspace\\seleniumproject\\testdata\\payal.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		XSSFRow rows=sheet.createRow(0);
		
		rows.createCell(0).setCellValue("my");
		rows.createCell(1).setCellValue("name");
		rows.createCell(2).setCellValue("khan");
		
		XSSFRow rows1=sheet.createRow(1);
		
		rows1.createCell(0).setCellValue("1");
		rows1.createCell(1).setCellValue("2");
		rows1.createCell(2).setCellValue("3");
		
		workbook.write(file);
		System.out.println("written");
	}

}
