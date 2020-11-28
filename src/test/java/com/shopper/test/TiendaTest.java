package com.shopper.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Tienda")
@Feature("Tienda Compra")
public class TiendaTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	/*
		
	@Test(priority=0, description="Seleccionar Tienda y Comprar")
    @Severity(SeverityLevel.NORMAL)
    @Description("Seleccionar Tienda y Comprar Consumidor")
    @Story("Compra")
    @TmsLink("XRPRJ-1")
    public void generarCompraConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		tienda.seleccionarTienda()
		.seleccionarProductoAbarrotes()
		.seleccionarProductoBebidas()
		.seleccionarProdCerveza()
		.seleccionarProdCuidadoHogar()
		.seleccionarProdCuidadoPersonal()
		.seleccionarProdLacteo()
		.seleccionarProdSnack()
		.verCarrito()
		.verResumenProd("Efectivo")
		.finalizarPedido()
		.comprobarResultadoCorrectoCompra();
        
    }*/
	
	@Test(priority=1, description="Validar Flujo Completo de Compra")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar Flujo Completo de Compra")
    @Story("Compra")
    @TmsLink("XRPRJ-1")
    public void validarCompraConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		tienda.seleccionarTienda()
		.seleccionarProductoAbarrotes()
		.seleccionarProductoBebidas()
		.seleccionarProdCerveza()
		.seleccionarProdCuidadoHogar()
		.seleccionarProdCuidadoPersonal()
		//.seleccionarProdLacteo()
		//.seleccionarProdSnack()
		.verCarrito()
		.verResumenProd("Efectivo")
		.finalizarPedido()
		.comprobarResultadoCorrectoCompra()
		.cerrarSesionConsumidor();
		home.seleccionarCiudad("Bogotá")
		.seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("12711462");
		login.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		tendero.seleccionarTusPedidos()
		.seleccionarPedido()
		.comprobarResultadoCorrectoPedido()
		.cambiarEstadoPedidoEnCamino()
		.cerrarSesionTendero();
		home.seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		tienda.validarPedidosActivos()
		.seleccionarPedidosEnCurso()
		.comprobarResultadoEstadoEnCamino();
		tienda.cerrarSesionConsumidor();
		home.seleccionarCiudad("Bogotá")
		.seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("12711462");
		login.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		tendero.seleccionarTusPedidos()
		.cambiarEstadoEntregado()
		.validarMetasTendero()
		.validarHistorialPedidos()
		.comprobarResultadoEstadoEntregado();
		
        
    }
	

}
