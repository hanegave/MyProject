package XCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataIntoCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis= new FileInputStream("./src/test/resources/src/DATA for WEB ELEMENT.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		wb.close();

	}

}
