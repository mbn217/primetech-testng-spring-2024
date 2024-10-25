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

    /**
     *
     * @return the number of column present in the Excel sheet
     */
    public static int getColCount(){
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        return colCount;
    }

    /**
     *
     * @param rowNumber the row number where the cell is located
     * @param colNumber the col number where the cell is located
     * @return the value of the cell at the specific row and col numbers
     */
    public static String getCellDataString(int rowNumber , int colNumber){
        String cellData = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
        return cellData;
    }

    /**
     *
     * @return two dimentional array of the excel sheet
     */
    public static Object[][] getDataSet(){
        int rowCount = ExcelUtility.getRowCount();
        int colCount = ExcelUtility.getColCount();

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount ; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = getCellDataString(i,j);
                data[i][j] = cellData;
            }
        }
        return data;
    }












}
