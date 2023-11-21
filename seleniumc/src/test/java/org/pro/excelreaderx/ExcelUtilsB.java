package org.pro.excelreaderx;

import com.google.common.collect.Table;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtilsB {

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
            int firstRowNum =  dataSheet.getFirstRowNum();
            int lastRowNumber = dataSheet.getLastRowNum();
            System.out.println(firstRowNum);
            System.out.println(lastRowNumber);
            for (int i=1;i<=lastRowNumber;i++)
            {
                    for(int j=0;j<=dataSheet.getRow(i).getLastCellNum()-1;j++)
                    {
                        XSSFCell cellVal = dataSheet.getRow(i).getCell(j);
                        if(cellVal.getCellType()== CellType.STRING)
                            System.out.println(cellVal.getStringCellValue());
                        else if (cellVal.getCellType()== CellType.NUMERIC) {
                            System.out.println(cellVal.getNumericCellValue());
                        }
                    }
            }

    }
}
