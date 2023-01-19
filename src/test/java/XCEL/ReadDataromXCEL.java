package XCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataromXCEL {

	public static void main(String[] args) throws IOException {
		//step 1: convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/src/DATA for WEB ELEMENT.xlsx");
		//step 2: open the xcel workbook
		//Import workbook from org.apache.poi.ss.usemode
		//the below statement throws encryptedDocumentException and IOException
		Workbook wb= WorkbookFactory.create(fis);
		//step 3: get control over perticular sheet
		Sheet s=wb.getSheet("Sheet1");
		//step4: get control over specific row
		Row r=s.getRow(0);
		//step5: get control over cell
		Cell c=r.getCell(1);
		//step6: Fetch the data from cell
		System.out.println(c.getStringCellValue());
		//step 7: Close workbook
		wb.close();

	}

}
