package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtility {




    //open excel file
    //load/open excel sheet
    //read/open workbook
    //read cells

    static  XSSFWorkbook workbook;
    static XSSFSheet sheet;

    /**
     * Method will open/load and excel sheet
     * @param filePath the path of the excel file
     * @param sheetName the sheet name inside the workbook : example "Sheet1" or "Sheet2"
     */
    public static void getExcelInstance(String filePath , String sheetName ){

        try {
            workbook = new XSSFWorkbook(filePath);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     *
     * @return the number of rows present in the Excel Sheet
     */
    public static int getRowCount(){
        int rowCount = sheet.getPhysicalNumberOfRows();
        return rowCount;
    }

    public static int getColCount(){
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        return colCount;
    }












}
