package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbRel extends JDBCParent {
    @Test
    public void Test() throws SQLException {
        DBConnectionOpen();

        ResultSet rs= sorguEkrani.executeQuery("select * from language");

        rs.next();// bir adım ileri
        System.out.println("rs.getString(2) = " + rs.getString(2));// 2 index değil sıra : italian

        rs.next();// bir adım ileri
        System.out.println("rs.getString(2) = " + rs.getString(2));//English

        rs.previous();
        System.out.println("rs.getString(2) = " + rs.getString(2));

        DBConnectionClose();

    }

    @Test
    public void Test2() throws SQLException {
        DBConnectionOpen();

        ResultSet rs=sorguEkrani.executeQuery("select * from film");

        rs.absolute(10); // direk 10. satıra gider
        System.out.println("rs.getString(\"title\") = " + rs.getString("title")); // alladın cleandar

        rs.absolute(5);// direk 5. satıra gider
        System.out.println("rs.getString(\"title\") = " + rs.getString("title"));

        rs.relative(5); // kaldığı yerden 5 satır ileri gider
        System.out.println("rs.getString(\"title\") = " + rs.getString("title"));

        rs.next(); // 11. satıra gider

        DBConnectionClose();

        // rs.next() : sonraki satır
        // rs.previous : önceki satır
        // rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
        // rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
        // rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
        // rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
    }
}
