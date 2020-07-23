package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	private static Cell createCell;

	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\\\Users\\\\Dell\\\\eclipse-workspace-new\\\\Excel\\\\target\\\\Book2.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("1");
		Row r = s.createRow(0);
          Cell c = r.createCell(0);
          c.setCellValue("Harun");
          FileOutputStream f1=new FileOutputStream(f);
          w.write(f1);
          
          
          
 
		
	}

}
