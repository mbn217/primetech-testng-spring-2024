package testcases;

import utilities.ExcelUtility;

public class DemoExcel {


    public static void main(String[] args) {

        ExcelUtility.getExcelInstance("dataset/data.xlsx","Sheet1");

        System.out.println("Row count is : " + ExcelUtility.getRowCount());
        System.out.println("Col count is : " + ExcelUtility.getColCount());

        System.out.println(ExcelUtility.getCellDataString(0,0));//username
        System.out.println(ExcelUtility.getCellDataString(1,0));//username
        System.out.println(ExcelUtility.getCellDataString(2,0));//username
        System.out.println("-------------------------");
        int rowCount = ExcelUtility.getRowCount();
        int colCount = ExcelUtility.getColCount();
        for (int i = 0; i < rowCount ; i++) {
            for (int j = 0; j < colCount; j++) {          //                         i j   i j     i  j     i j     i  j   i  j
                System.out.print(ExcelUtility.getCellDataString(i,j) + "  |  "); // (0,0) (0,1)  | (1,0) , (1,1)  | (2,0) (2,1)
            }
            System.out.println();
        }





    }
}
