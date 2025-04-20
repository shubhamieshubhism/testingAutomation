package Practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeExcelDataReading {
    public static String[][] readDataExcel(String filePath, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        String data[][] = new String[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.toString();
            }
        }
        workbook.close();
        fileInputStream.close();
        return data;
    }

    public static List<String> readDataFromSingleCOL(String filePath, String sheetName, int colInd) throws IOException {
        List<String>dataList = new ArrayList<>();
        FileInputStream fileInputStream=new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        for(Row row : sheet){
            Cell cell = row.getCell(colInd);
            if(cell!=null){
                switch (cell.getCellType()){
                    case STRING:
                        dataList.add(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        dataList.add(String.valueOf(cell.getNumericCellValue()));
                        break;
                    case BOOLEAN:
                        dataList.add(String.valueOf(cell.getBooleanCellValue()));
                        break;
                    case FORMULA:
                        dataList.add(String.valueOf(cell.getCellFormula()));
                        break;
                    default:
                        dataList.add("");
                }
            }else{
                dataList.add("");
            }
        }
        return dataList;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\PALASH TIRPUDE\\Desktop\\testingReadEcelData.xlsx";
        String sheetName = "Sheet1";
        //String[][] out = readDataExcel(filePath, sheetName);
        List<String> dataCol = readDataFromSingleCOL(filePath, sheetName, 0);
        boolean found =false;
        for(String data:dataCol ){
            if(data.equals("jony")){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("The excel sheet contains jon");
        }else{
            System.out.println("The excel sheet doesn't contains jon");
        }
    }
}
