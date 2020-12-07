package com.shopper.test;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

@Listeners({ TestListener.class })
@Epic("Tendero")
@Feature("Tendero Tests")

public class RegistroTenderoTest extends BaseTest {
	
	public Properties fileprops = new Properties();
	
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	
	@Test(priority=0, description="Registro Tendero")
    @Severity(SeverityLevel.NORMAL)
    @Description("Registrar Portal Tendero")
    @Story("Tendero")
    @TmsLink("XRPRJ-1")
    public void registrarTendero () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("100612763");
		registroCons.validarTerminos();
		registroTendero.ingresarDatosTendero("100612763","3213482379");
		login.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		registroTendero.seleccionarServicioDomiciliario()
		.seleccionarTipoNegocio("MINIMERCADO")
		.seleccionarCategorias()
		.seleccionarMedioPago("Efectivo")
		//.validarRegistroTendero("¡Te has registrado")
		.validarIntroduccion();		        
    }/*
	
	@Test(priority=1, description="Validar Codigo Tendero")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar Codigo Erroneo Tendero")
    @Story("Tendero")
    @TmsLink("XRPRJ-1")
    public void validarCodigoInvalido () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("101034061");
		registroCons.validarTerminos();
		registroTendero.ingresarDatosTendero("10105286925","3223594679")
		.validarCodigoInvalidoTendero("El número de documento no corresponde a la tienda");
			        
    }
	
	@Test(priority=2, description="Validar Campos Vacios Documento y Numero Celular Tendero")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar Campos Vacio Tendero")
    @Story("Tendero")
    @TmsLink("XRPRJ-1")
    public void validarCampoVacio () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("101034061");
		registroCons.validarTerminos();
		registroTendero.ingresarDatosTendero("","")
		.validarCampoVacio("El número de documento es obligatorio","El teléfono es obligatorio");
			        
    }*/
	
	

}
