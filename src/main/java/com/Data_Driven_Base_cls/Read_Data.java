package com.Data_Driven_Base_cls;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void allData() throws Throwable {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);

		int noOfRows = s.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows: " + noOfRows);

		for (int i = 0; i < noOfRows; i++) {

			Row r = s.getRow(i);
			int noOfCells = r.getPhysicalNumberOfCells();

			for (int j = 0; j < noOfCells; j++) {
				Cell c = r.getCell(j);
				CellType cellType = c.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String stringValue = c.getStringCellValue();
					System.out.print("    " + stringValue + "     ");
				}

				else if (cellType.equals(CellType.NUMERIC)) {
					double dValue = c.getNumericCellValue();
					int nValue = (int) dValue;
					System.out.print("    " + nValue + "    ");
				}
			}
			System.out.println();
		}

		wb.close();
	}

	public static void particularCell() throws Throwable {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row r = sheet.getRow(4);
		Cell c = r.getCell(3);
		CellType cellType = c.getCellType();

		if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		} else if (cellType.equals(CellType.STRING)) {

			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);

		}

		wb.close();
	}

	public static void particularColumn() throws Throwable {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {

			Row row = sheet.getRow(i);

			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			} else if (cellType.equals(CellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			}
		}
		wb.close();
	}

	public static void particularRow() throws Throwable {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(5);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {

			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.print("    " + value + "    ");
			} else if (cellType.equals(CellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();
				System.out.print(" " + stringCellValue + " ");

			}
		}
		wb.close();
	}

	public static void particularRowTitle() throws Throwable {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(0);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {

			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.print(" " + value + " ");
			} else if (cellType.equals(CellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();
				System.out.print(" " + stringCellValue + " ");

			}
		}
		System.out.println();
		wb.close();
	}

}
