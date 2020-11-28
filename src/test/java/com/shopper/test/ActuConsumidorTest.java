package com.shopper.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Consumidor")
@Feature("Actualizar Datos")

public class ActuConsumidorTest extends BaseTest {
	public Properties fileprops = new Properties();
	
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	
	@Test(priority=0, description="Modificar Datos Basicos Consumidor")
    @Severity(SeverityLevel.NORMAL)
    @Description("Modificar Datos Basicos Consumidor")
    @Story("Consumidor")
    @TmsLink("XRPRJ-1")
    public void modificarDatosConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		actualizaConsumidor.seleccionarPerfil()
		.modificarNombreApellido("Ivan","Quintero")
		.modificarFechaNacimiento("10","05","1995")
		.modificarGenero("Hombre")
		.guardarCambios();
		
	}
	
	@Test(priority=1, description="Modificar Correo Electronico Consumidor")
    @Severity(SeverityLevel.NORMAL)
    @Description("Modificar Correo Electronico Consumidor")
    @Story("Consumidor")
    @TmsLink("XRPRJ-1")
    public void modificarCorreoElectronicoConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		actualizaConsumidor.seleccionarPerfil()
		.cambiarCorreo();
		login.ingresarCodigoValidacion1("1", "2", "3", "4", "5");
		actualizaConsumidor.ingresarNuevoCorreo("icarpi-1@serempre.com");
		login.ingresarCodigoValidacion1("1", "2", "3", "4", "5");
		
		
	}
	@Test(priority=2, description="Cambiar Numero de Celular Consumidor")
    @Severity(SeverityLevel.NORMAL)
    @Description("Modificar Numero Celular Consumidor")
    @Story("Consumidor")
    @TmsLink("XRPRJ-1")
    public void cambiarNumeroCelularConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		actualizaConsumidor.seleccionarPerfil()
		.cambiarCelular();
		login.ingresarCodigoValidacion1("1", "2", "3", "4", "5")
		.ingresarNuevoNumeroCelular("3222255941")
		.ingresarCodigoValidacion1("1", "2", "3", "4", "5");
		
		
		
	}
	
	@Test(priority=3, description="Modificar Direccion de Entrega Consumidor")
    @Severity(SeverityLevel.NORMAL)
    @Description("Modificar Numero Celular Consumidor")
    @Story("Consumidor")
    @TmsLink("XRPRJ-1")
    public void modificarDireccionEntregaConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		actualizaConsumidor.seleccionarPerfil()
		.modificarDireccion()
		.ingresarNuevaDireccionConsumidor("Cl. 152b #101b-45, Bogotá, Colombia")
		.complementarNuevaDireccion("TO 8 APTO 258", "Cerca a la Panaderia", "Trabajo");
			
		
	}
	
	@Test(priority=4, description="Historial de Compra y Generar la misma Compra")
    @Severity(SeverityLevel.NORMAL)
    @Description("Historial de Compra")
    @Story("Consumidor")
    @TmsLink("XRPRJ-1")
    public void validarHistorialCompraConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		actualizaConsumidor.seleccionarPerfil()
		.verHistorialPedidosConsumidor();
				
	}
	

}
