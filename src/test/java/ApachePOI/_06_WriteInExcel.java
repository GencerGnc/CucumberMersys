package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInExcel {

    //Var olan excele yazma işlemi


    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);//okuma modunda açıldı
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);

        int ensonmiktari=sheet.getPhysicalNumberOfRows();//getPhysicalNumberOfRows() dolu satır sayısını veriyor,ilk boş yere kadar

        Row yenisatir=sheet.createRow(ensonmiktari);//yeni satır oluşturma
        Cell yeniHucre=yenisatir.createCell(0);//yeni satırda yeni hücre oluşturdum

        yeniHucre.setCellValue("Merhaba Dünya");// yeni hücreye değer verdim
        //yazma işlemi bitti
        inputStream.close();//aynı anda okuma ve kaydetme yapılmıyor,okuma modu kapatıldı



        //dosyayı KAYDETME modunu aç

        FileOutputStream outputStream=new FileOutputStream(path);//kaydetme modu açıldı
        workbook.write(outputStream);//workbook kaydedildi
        workbook.close();//hafıza boşaltıldı
        outputStream.close();//yazma modu kapatıldı

        System.out.println("kayıt yapıldı");


    }

}
