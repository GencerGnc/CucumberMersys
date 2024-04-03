package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**

 Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 bulup ve sonucun döndürülmesi için metod kullanınız.
 src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _05_GetApacaheData {
    public static void main(String[] args) throws IOException {
     String path=   "src/test/java/ApachePOI/resource/LoginData.xlsx";
     String bulunan="";
     FileInputStream input=new FileInputStream(path);
     Workbook workbook=WorkbookFactory.create(input);
     Sheet sheet=workbook.getSheetAt(0);

     String aranan="username";
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            //bu satırın aranana eşitmi
            if (sheet.getRow(i).getCell(0).toString().toLowerCase().equals(aranan.toLowerCase())){
                //bu satırın tüm hücrelerini bulunana ekle
                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    bulunan+=sheet.getRow(i).getCell(j);
                }
            }

        }
        System.out.println("bulunan = " + bulunan);
    }


}
