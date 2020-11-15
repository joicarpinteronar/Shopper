package com.shopper.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;



@Listeners({ TestListener.class })
@Epic("Registro")
@Feature("Registro Consumidor Tests")

public class RegistroConsumidorTest extends BaseTest {
	public Properties fileprops = new Properties();
	
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Registro Portal Consumidor")
    @Severity(SeverityLevel.NORMAL)
    @Description("Registrar Consumidor")
    @Story("Consumidor")
    @TmsLink("XRPRJ-1")
    public void ingresarPortalConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3144817329");
		registroCons.validarTerminos()
		.ingresarDatosPersonales("Alejandra","Sanchez","alecon7@gmail.com")
		.ingresarUbicacionConsumidor("Cl. 65 #14-28, Bogotá, Colombia");
		    
        
    }

}
