package browser;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datawritting {

	public static void main(String[] args) throws IOException {

		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet();
	XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("welcome");
		row.createCell(1).setCellValue("1234");
		row.createCell(2).setCellValue("false");
		XSSFRow row1=sheet.createRow(1);	
		row1.createCell(0).setCellValue("ffj");
		row1.createCell(1).setCellValue("34");
		row1.createCell(2).setCellValue("true");
		System.out.println("0k");
		workbook.write(file);
	}

}
