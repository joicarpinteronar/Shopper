package com.shopper.test;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

@Listeners({ TestListener.class })
@Epic("Home")
@Feature("Home Tests")

public class HomeTest extends BaseTest {
	public Properties fileprops = new Properties();

    public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }

    @Test(priority=0, description="Seleccionar Ciudad en el Home")
    @Severity(SeverityLevel.NORMAL)
    @Description("Seleccionar Ciudad")
    @Story("Ciudad")
    @TmsLink("XRPRJ-1")
    public void test_seleccionar_ciudad () throws Exception {
        home.irPortal(getProperties().getProperty("url"))
                    .seleccionarCiudad("Bogotá")
                    .comprobarResultadoCorrecto()
                    .seleccionarRol("Consumidor");
        
    }

}
