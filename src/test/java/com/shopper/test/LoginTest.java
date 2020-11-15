package com.shopper.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;



@Listeners({ TestListener.class })
@Epic("Login")
@Feature("Login Tests")

public class LoginTest extends BaseTest{
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Login Portal Consumidor")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ingresar Portal Consumidor")
    @Story("Consumidor")
    @TmsLink("XRPRJ-1")
    public void ingresarPortalConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3138017395")
		     .ingresarCodigoValidacion("1", "2", "3", "4", "5");
        
    }
	

}
