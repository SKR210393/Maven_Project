package comm.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel{

	public static void allData() throws IOException {

		File f = new File("C:\\Users\\Saravana\\Desktop\\DataDriven_Concept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		int physicalNoOfRows = s.getPhysicalNumberOfRows();
		System.out.println("Physical No Of Rows: " + physicalNoOfRows);

		for (int i = 0; i < physicalNoOfRows; i++) {

			Row r = s.getRow(i);
			int v = r.getPhysicalNumberOfCells();

			for (int j = 0; j < v; j++) {

				Cell c = r.getCell(j);
				CellType cellType = c.getCellType();

				if (cellType.equals(CellType.STRING)) {
					String svalue = c.getStringCellValue();
					System.out.print("  " + svalue + "   ");
				}

				else if (cellType.equals(CellType.NUMERIC)) {

					double dvalue = c.getNumericCellValue();
					int a = (int) dvalue;
					System.out.print("    " + a + "   ");
				}

			}
			System.out.println();

		}
	wb.close();
	}

	public static void main(String[] args) throws Throwable {

		allData();

	}
}
