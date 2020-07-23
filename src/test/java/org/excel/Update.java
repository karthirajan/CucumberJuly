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

public class Update {
	public static void main(String[] args) throws Throwable {
	
	File f=new File("C:\\Users\\Dell\\eclipse-workspace-new\\Excel\\target\\Book2.xlsx");
	FileInputStream f1=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(f1);
	Sheet s = w.getSheet("1");
	Row r = s.getRow(0);
	Cell c = r.getCell(1);
	int e = c.getCellType();
	if (e==1) {
		String value = c.getStringCellValue();
		System.out.println(value);
		if (value.equals("Harun")) {
			c.setCellValue("Kumar");
			FileOutputStream f2=new FileOutputStream(f);
			w.write(f2);
			System.out.println("done");
			
		}
		
	}
	
}
}