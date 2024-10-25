package testcases;

import utilities.ExcelUtility;

public class DemoExcel {


    public static void main(String[] args) {

        ExcelUtility.getExcelInstance("dataset/data.xlsx","Sheet1");

        System.out.println("Row count is : " + ExcelUtility.getRowCount());
        System.out.println("Col count is : " + ExcelUtility.getColCount());




    }
}
