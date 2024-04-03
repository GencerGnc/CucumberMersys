package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Soru {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("sayfa1");

        int yenisatirindex=0;

        for (int i = 1; i <= 10; i++) {



            for (int j = 1; j <= 10; j++) {
                Row yenisatir=sheet.createRow(yenisatirindex++);
                System.out.println(i+"x"+j+"="+(i*j));
                Cell yeniHucre=yenisatir.createCell(0);yeniHucre.setCellValue(i);
                Cell yeniHucre2=yenisatir.createCell(1);yeniHucre2.setCellValue("x");
                Cell yeniHucre3=yenisatir.createCell(2);yeniHucre3.setCellValue(j);
                Cell yeniHucre4=yenisatir.createCell(3);yeniHucre4.setCellValue("=");
                Cell yeniHucre5=yenisatir.createCell(4);yeniHucre5.setCellValue(i*j);
//                for (int k = 0; k < 100; k++) {
//                    Cell yeniHucre6=yenisatir.createCell(5);yeniHucre6.setCellValue(5);
//
//                }
            }
            Row bossatir=sheet.createRow(yenisatirindex++);
        }



        String path="src/test/java/ApachePOI/resource/NewExcel2.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
}
