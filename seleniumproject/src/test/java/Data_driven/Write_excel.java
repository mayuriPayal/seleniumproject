package Data_driven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_excel {

	public static void main(String[] args) throws IOException {

	FileOutputStream file=new FileOutputStream("D:\\seleniumworkspace\\seleniumproject\\testdata\\myff.xlsx");
		
	XSSFWorkbook workbook	=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet();
	
	XSSFRow rows  =sheet.createRow(0);
	
	rows.createCell(0).setCellValue("welcome");
	rows.createCell(1).setCellValue("to");
	rows.createCell(2).setCellValue("nagpur");
	
	XSSFRow rows1  =sheet.createRow(1);
	
	rows1.createCell(0).setCellValue("abc");
	rows1.createCell(1).setCellValue("mayu");
	rows1.createCell(2).setCellValue("cho");
	
	workbook.write(file);
	
	System.out.println("done");
	
	}

}
