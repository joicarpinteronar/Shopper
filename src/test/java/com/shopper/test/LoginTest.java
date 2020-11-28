package com.shopper.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;

import org.openqa.selenium.By;
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
	/*	
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
		login.ingresarNumeroCelular("3222255941")
		     .ingresarCodigoValidacion("1", "2", "3", "4", "5");
        
    }
	
	@Test(priority=1, description="Login Portal Tendero")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ingresar Portal Tendero")
    @Story("Tendero")
    @TmsLink("XRPRJ-1")
    public void ingresarPortalTendero () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("12711462");
		login.ingresarCodigoValidacion("1", "2", "3", "4", "5")
		.comprobarResultadoLoginTendero();
        
    }*/
	
	@Test(priority=2, description="Validar Campo Login Tendero")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Validar Campo Login Tendero")
    @Story("Tendero")
    @TmsLink("XRPRJ-1")
    public void validarCampoLoginTendero () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("117214620");
		login.validarLoginIncorrecto("Código de cliente no existe");		
		registroTendero.ingresarCodigoTendero("11111111111111111111111111");
		login.validarLoginMaxCaracteres("• El campo client code debe ser un número entero.El campo client code debe contener entre 1 y 20 dígitos.");
		registroTendero.ingresarCodigoTendero("");
		login.validarLoginVacio("El código de cliente es obligatorio");			
        
    }
	

}
