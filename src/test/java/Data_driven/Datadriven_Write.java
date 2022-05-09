package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	
	public static void write_Data() throws Exception {
		
		File n = new File("C:\\Users\\AKBAR\\eclipse-workspace\\Maven_Project\\target\\aslam.xlsx");
		
		FileInputStream nr = new FileInputStream(n);
		
		Workbook r = new XSSFWorkbook(nr);
		
		Sheet createSheet = r.createSheet("Ayaan");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Aslam");
		
		r.getSheet("Ayaan").getRow(0).createCell(1).setCellValue("1234");
		r.getSheet("Ayaan").createRow(1).createCell(0).setCellValue("Akbar");
		r.getSheet("Ayaan").getRow(1).createCell(1).setCellValue("321");
		r.getSheet("Ayaan").createRow(2).createCell(0).setCellValue("Mohammed");
		r.getSheet("Ayaan").getRow(2).createCell(1).setCellValue("786");
		
		FileOutputStream nss = new FileOutputStream(n);
		
		r.write(nss);
		r.close();
	}
	
	public static void main(String[] args) throws Throwable {
		write_Data();
	}
		
	
		

	}


