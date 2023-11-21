package org.pro.excelreaderx;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtilsA {

    public static void main(String [] args) throws IOException {

            String filePath = "D:\\SroutGit\\SeleniumPro\\seleniumc\\src\\test\\resources\\sroutdata.xlsx";
            String sheetName = "userData";
            //Locate and Create a pointer to red data from file
            FileInputStream fileInput = new FileInputStream(filePath);
            //Create a workbook
            XSSFWorkbook workbook = new  XSSFWorkbook(fileInput);
            // Create a Sheet
            XSSFSheet dataSheet =  workbook.getSheet(sheetName);
            // Create a Row
            XSSFRow dataRow=  dataSheet.getRow(1);
            // Create a Cell
            XSSFCell cellData= dataRow.getCell(1);
            Double cellVal = cellData.getNumericCellValue();
            System.out.println(cellVal);

    }
}
