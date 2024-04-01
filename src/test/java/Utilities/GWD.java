package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static ThreadLocal <WebDriver> threadDriver=new ThreadLocal<>();// her bir thread e özel static
    public static ThreadLocal <String> threadBrowserName=new ThreadLocal<>();// o hatta özel browser name

    //threadDriver.get()-> bulunduğum thread deki diriverı al
    //threadDriver.set(driver)-> bulunduğum thread deki diriverı set et

    public static WebDriver getDriver(){
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get()==null)// xml den çalışmayan durumlar için
            threadBrowserName.set("chrome");//default chorme


        if (threadDriver.get() == null) { //1 kez oluştur
            switch (threadBrowserName.get()){

                case "chrome":threadDriver.set(new ChromeDriver());break;// bulunduğun hatta drver yok idi ben bir tane set ettim
                case "firefox":threadDriver.set(new FirefoxDriver());break;
                case "edge":threadDriver.set(new EdgeDriver());break;
            }

            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }

        return threadDriver.get();
    }


    public static void quitDriver(){

        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver kapat
        if (threadDriver.get()!= null){ //bu hatta driver var ise
            threadDriver.get().quit();
            WebDriver driver=threadDriver.get();//hatta daki driverı aldım
            driver=null;//driver null oldu
            threadDriver.set(driver);//bu hattaki driver null oldu
        }

    }
}
