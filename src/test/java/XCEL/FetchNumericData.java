package XCEL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchNumericData {
	
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream fis = new FileInputStream("./src/test/resources/src/DATA for WEB ELEMENT.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	DataFormatter df=new DataFormatter();
	System.out.println(df.formatCellValue(wb.getSheet("Sheet1").getRow(3).getCell(0)));
	wb.close();
	}
}
