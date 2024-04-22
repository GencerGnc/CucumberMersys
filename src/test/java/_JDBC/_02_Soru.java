package _JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class _02_Soru {
    @Test
    public void Test1() throws SQLException {

        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        //1- bağlantı bilgilerini girdik DB server bağlandık
        Connection baglanti = DriverManager.getConnection(url, username, password);

        //2- Sorgu ekranını açtık
        Statement sorguEkrani = baglanti.createStatement();

        //3- Sorgu ekranına sorguyu yazdım ve çalıştırdım
        ResultSet sonucTablosu= sorguEkrani.executeQuery("select * from city");


        while (sonucTablosu.next()){
            System.out.println("sonucTablosu = " + sonucTablosu.getString("city"));

        }

        baglanti.close();
    }
}
