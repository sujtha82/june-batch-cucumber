package util;

import io.cucumber.messages.internal.com.google.common.collect.Table;

import java.io.FileInputStream;
import java.util.HashMap;

public class DataHelper {
 //*   public static List<HashMap<String, String>> readExcelDatafromFile(String filePath, String sheetName) {

       // List <HashMap<String,String>> excelData = new ArrayList<>();

      //  try {
          //  FileInputStream fs = new FileInputStream(filePath);
          //  XSSFWorkbook wb = new XSSFWorkbook(fs);
          //  XSSFSheet sheet = wb.getSheet(sheetName);

            //System.out.println("No. of rows:"+sheet.getPhysicalNumberOfRows());
            //catch header row, so that you can use it as Key for your hashmap
           // Row headerRow = sheet.getRow(0);

          //  for(int r = 1; r<sheet.getPhysicalNumberOfRows();r++) {
          //      Row CurrentRow = sheet.getRow ( r );
                //each row of data is stored in new hashmap
                HashMap<String, String> currentRowMap = new HashMap<String, String> ();

              //  for (int c = 0; c < CurrentRow.getPhysicalNumberOfCells (); c++) {
                //    Table.Cell CurrentCell = CurrentRow.getCell ( c );
                    //System.out.print(CurrentCell.getStringCellValue() + "\t");
                  //  currentRowM

                }
