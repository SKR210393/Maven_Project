package comm.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	public static void writeData() throws Throwable {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet cs = wb.createSheet("Write_Data");
		Row cr = cs.createRow(0);
		Cell cc = cr.createCell(0);
		cc.setCellValue("Emp-ID");

		Sheet cs1 = wb.getSheet("Write_Data");
		Row r1 = cs1.getRow(0);
		Cell cc1 = r1.createCell(1);
		cc1.setCellValue("Emp-Name");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Completed");
	}

	public static void main(String[] args) throws Throwable {

		writeData();
	}
}
