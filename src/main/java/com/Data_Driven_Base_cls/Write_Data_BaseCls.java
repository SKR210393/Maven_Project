package com.Data_Driven_Base_cls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_BaseCls {

	public static void writeDataTable() throws Throwable {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("Data_Table").createRow(0).createCell(0).setCellValue("Emp ID");
		wb.getSheet("Data_Table").getRow(0).createCell(1).setCellValue("Emp Name");
		wb.getSheet("Data_Table").getRow(0).createCell(2).setCellValue("Blood Grp");
		wb.getSheet("Data_Table").getRow(0).createCell(2).setCellValue("Team Name");

		wb.getSheet("Data_Table").createRow(1).createCell(0).setCellValue(123456);
		wb.getSheet("Data_Table").getRow(1).createCell(1).setCellValue("Antonne");
		wb.getSheet("Data_Table").getRow(1).createCell(2).setCellValue("B +");
		wb.getSheet("Data_Table").getRow(1).createCell(3).setCellValue("E-Comm");

		wb.getSheet("Data_Table").createRow(2).createCell(0).setCellValue(124567);
		wb.getSheet("Data_Table").getRow(2).createCell(1).setCellValue("Hendrey");
		wb.getSheet("Data_Table").getRow(2).createCell(2).setCellValue("A +");
		wb.getSheet("Data_Table").getRow(2).createCell(3).setCellValue("E-Comm");

		wb.getSheet("Data_Table").createRow(3).createCell(0).setCellValue(567890);
		wb.getSheet("Data_Table").getRow(3).createCell(1).setCellValue("Spencer");
		wb.getSheet("Data_Table").getRow(3).createCell(2).setCellValue("AB +");
		wb.getSheet("Data_Table").getRow(3).createCell(3).setCellValue("E-Comm");

		wb.getSheet("Data_Table").createRow(4).createCell(0).setCellValue(435345);
		wb.getSheet("Data_Table").getRow(4).createCell(1).setCellValue("Hathirne");
		wb.getSheet("Data_Table").getRow(4).createCell(2).setCellValue("AB -");
		wb.getSheet("Data_Table").getRow(4).createCell(3).setCellValue("E-Comm");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("New Data Table created for Employees");

	}

}
