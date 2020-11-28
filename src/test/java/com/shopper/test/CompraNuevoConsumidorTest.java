package com.shopper.test;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Compra")
@Feature("Compra Nuevo Consumidor")
public class CompraNuevoConsumidorTest extends BaseTest {
	public Properties fileprops = new Properties();
	
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
		
	@Test(priority=0, description="Registrar Consumidor y Generar primera Compra")
    @Severity(SeverityLevel.NORMAL)
    @Description("Registrar Consumidor y Generar primera Compra")
    @Story("Compra")
    @TmsLink("XRPRJ-1")
    public void generarCompraConsumidor () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");
		login.ingresarNumeroCelular("3207474847");
		
		registroCons.validarTerminos()
		.ingresarDatosPersonales("Lorena","Gonzalez","lcontreras@serempre.com")
		.ingresarUbicacionConsumidor("Cl. 65 #14-28, Bogotá, Colombia");
		
		login.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		compraNuevo.validarIntroduccion()
		.seleccionarTiendaCompra();
		
		tienda.seleccionarProductoAbarrotes()
		.verCarrito()
		.verResumenProd("Efectivo");
		compraNuevo.validarDatosConsumidor("23","11","1984")
		.complementarDireccion("TO 4 Apto 505","Al lado del Parque","Casa");
		tienda.finalizarPedido();
		
        
    }

}
