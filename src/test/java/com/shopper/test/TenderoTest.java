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

public class TenderoTest extends BaseTest{
	
public Properties fileprops = new Properties();
	
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	
	@Test(priority=0, description="Activar Tienda")
    @Severity(SeverityLevel.NORMAL)
    @Description("Activar Tienda Tendero")
    @Story("Tendero")
    @TmsLink("XRPRJ-1")
    public void activarTiendaTendero () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Tendero");
		registroTendero.ingresarCodigoTendero("101028097");
		
		login.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		tendero.seleccionarProductoTendero()
		.cambiarHorario("08","00","am","10","00","pm")
		.configurarDomicilio("60000", "10000", "30", "2000")
		.activarTienda();
	}

}
