package ApachePOI;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        //hafızada workbook oluştur
        //bundan hafızada sheet oluştur
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("sayfa1");


        Row yenisatir=sheet.createRow(0);
        Cell yenihucre=yenisatir.createCell(0);
        yenihucre.setCellValue("Merhaba Dunya Excel");

        String path="src/test/java/ApachePOI/resource/NewExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }
}
