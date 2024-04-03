package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_Soru {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/Carpim.xlsx";
        FileInputStream inputStream=new FileInputStream(path);//okuma modunda açıldı
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);




            int yenisatirindex=0;
        // Çarpım tablosunu oluştur ve yazdır
        for (int i = 1; i <= 10; i++) {



            for (int j = 1; j <= 10; j++) {
                Row yenisatir=sheet.createRow(yenisatirindex++);
                System.out.println(i+"x"+j+"="+(i*j));
                Cell yeniHucre=yenisatir.createCell(0);yeniHucre.setCellValue(i);
                Cell yeniHucre2=yenisatir.createCell(1);yeniHucre2.setCellValue("x");
                Cell yeniHucre3=yenisatir.createCell(2);yeniHucre3.setCellValue(j);
                Cell yeniHucre4=yenisatir.createCell(3);yeniHucre4.setCellValue("=");
                Cell yeniHucre5=yenisatir.createCell(4);yeniHucre5.setCellValue(i*j);

            }
            Row bossatir=sheet.createRow(yenisatirindex++);
        }
        inputStream.close();

        //dosyayı KAYDETME modunu aç

        FileOutputStream outputStream=new FileOutputStream(path);//kaydetme modu açıldı
        workbook.write(outputStream);//workbook kaydedildi
        workbook.close();//hafıza boşaltıldı
        outputStream.close();//yazma modu kapatıldı

        System.out.println("kayıt yapıldı");


    }
    }

