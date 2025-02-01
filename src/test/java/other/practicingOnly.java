package other;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class practicingOnly {
    public static String [][] readEcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fileinputstream = new FileInputStream(new File(filePath));
        Workbook workbook =new XSSFWorkbook(fileinputstream);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount=sheet.getPhysicalNumberOfRows();
        int colCOunt = sheet.getRow(0).getPhysicalNumberOfCells();

        String [][] data =new String [rowCount-1][colCOunt];
        for(int i =1 ; i<rowCount ; i++){
            Row row=sheet.getRow(i);
            for(int j = 0 ; j < colCOunt ; j++){
                Cell cell=row.getCell(j);
                data[i-1][j] = cell.toString();
            }
        }
        workbook.close();
        fileinputstream.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\PALASH TIRPUDE\\Desktop\\testingReadEcelData.xlsx";
        String sheetName="Sheet1";
        String [][] red = readEcelData(filePath,sheetName);
        System.out.println(Arrays.deepToString(red));
    }
}
