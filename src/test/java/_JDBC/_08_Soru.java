package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class _08_Soru extends JDBCParent{
// bir metoda sorguyu("select * from language") gönderiniz,
    // metod size sorgunun datasını bir ArrayList olarak döndürsün


 @Test
    public void tets() throws SQLException {

     DBConnectionOpen();

     String sorgu="select * from city";
     List<List<String>>  donenTablo=getListData(sorgu);;
    // System.out.println("donenlist = " + donenTablo);
     for (List<String> satir : donenTablo) {
         for (String kolon : satir)
             System.out.printf(kolon+"\t");

         System.out.println();
     }
     DBConnectionClose();
 }

    public List<List<String>> getListData(String sorgu)
    {
        List<List<String>> tablo=new ArrayList<>();

        try {
            DBConnectionOpen();
            ResultSet rs = sorguEkrani.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData(); // kolon sayısı
            // kolon isimleri
            ArrayList<String> kolonsatiri = new ArrayList<>();
            for (int i = 1; i < rsmd.getColumnCount() ; i++) {
                kolonsatiri.add(rsmd.getColumnName(i));
                tablo.add(kolonsatiri);
            }


            while (rs.next()) {

                ArrayList<String> satir = new ArrayList<>();
                // bu satırdaki elemanları satır listine ekle
                // rs.getString(1); // 1
                // rs.getString(2); // English
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    satir.add(rs.getString(i));

                // satıra ekleme bitince tablo ya ekle
                tablo.add(satir);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            DBConnectionClose();
        }

        return tablo;
    }

}
