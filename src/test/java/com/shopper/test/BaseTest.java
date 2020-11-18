package com.shopper.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.shopper.pages.BuscadorPage;
import com.shopper.pages.CompraNuevoConsumidor;
import com.shopper.pages.HomePage;
import com.shopper.pages.LoginPage;
import com.shopper.pages.RegistroConsumidorPage;
import com.shopper.pages.RegistroTenderoPage;
import com.shopper.pages.TenderoPage;
import com.shopper.pages.TiendaPage;

public class BaseTest {

    public WebDriver driver;
    public BuscadorPage buscadorPage;
    public HomePage home;
    public LoginPage login;
    public TiendaPage tienda;
    public RegistroConsumidorPage registroCons;
    public CompraNuevoConsumidor compraNuevo;
    public RegistroTenderoPage registroTendero;
    public TenderoPage tendero;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void inicializar() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        buscadorPage = new BuscadorPage(driver);
        home = new HomePage(driver);
        login = new LoginPage(driver);
        tienda = new TiendaPage(driver);
        registroCons = new RegistroConsumidorPage(driver);
        compraNuevo = new CompraNuevoConsumidor(driver);
        registroTendero = new RegistroTenderoPage(driver);
        tendero = new TenderoPage(driver);
    }

    @AfterMethod
    public void tearDown () {
        if (driver != null) {
            driver.quit();
        }
    }

}
