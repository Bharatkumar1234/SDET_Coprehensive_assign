package DataExcel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
	
	    public static void main(String[] args) {
	        try {
	            FileInputStream excelFile = new FileInputStream(new File("C:\\Users\\GURUBHARAT\\eclipse-workspace\\ReadData\\src\\ExcelFile\\SDET_Emp_Data.xlsx"));
	            Workbook workbook = new XSSFWorkbook(excelFile);
	            Sheet sheet = workbook.getSheetAt(0);

	            // Iterate through rows and columns to read data
	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "\t\t");
	                            break;
	                        case NUMERIC:
	                            System.out.print(cell.getNumericCellValue() + "\t\t");
	                            break;
	                        default:
	                            System.out.print("\t\t");
	                            break;
	                    }
	                }
	                System.out.println(); 
	            }

	            
	            workbook.close();
	            excelFile.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


