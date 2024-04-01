package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIstart {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";//excelin olduğu yer copy path den aldım

        /// Java dosya okuma nesenesine bu yol vererek bağlantı kuruyorum

        FileInputStream dosyaokumabaglantisi=new FileInputStream(path);

            //Dosya okuma işlemcisi üzrinden çalışma kitabını alıyorum
        //hafızada workbook u alıp oluşturdu
        Workbook calismakitabi= WorkbookFactory.create(dosyaokumabaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismasayfasi=calismakitabi.getSheet("Sheet1");

        Row satir=calismasayfasi.getRow(0);//0. satırı aldım

        Cell hucre=satir.getCell(0);//0. hücreyi ver

        System.out.println("hucre = " + hucre);

    }
}
