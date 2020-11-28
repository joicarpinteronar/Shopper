package com.shopper.pages;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.reporters.DotTestListener;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;

import com.shopper.utils.Utilidades;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.listener.*;

public class TenderoPage extends BasePage {
	
	By listaProductos = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/ul/li[1]/div/div/div/a");
	By checkAbarrote1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/span/span[1]/span[1]/input");
	By checkAbarrote2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[2]/div/div[3]/div/span/span[1]/span[1]/input");
	By checkAbarrote3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[2]/div/div[4]/div/span/span[1]/span[1]/input");
	By checkAbarrote4 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[2]/div/div[5]/div/span/span[1]/span[1]/input");
	
	By checkBebida1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[3]/div/div[2]/div/span/span[1]/span[1]/input");
	By checkBebida3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[3]/div/div[4]/div/span/span[1]/span[1]/input");
	By checkBebida4 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[3]/div/div[5]/div/span/span[1]/span[1]/input");
	By checkCerveza1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[4]/div/div[2]/div/span/span[1]/span[1]/input");
	By checkCerveza3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[4]/div/div[4]/div/span/span[1]/span[1]/input");
	
	By lblCambioHorario = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/ul/li[2]/div/div[1]/div/a");
	By btnAgregarHorario = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/footer/button");
	By selHoraApertura = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[1]");
	By lblHoraApertura = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/div/div[1]/div[1]/div[1]/span");
	By selCincoAper = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[1]/ul/li[6]");
	By selDiez = By.xpath("//li[11]");
	By selCeroMinAper = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[2]/ul/li[1]");
	By selCeroMinCerr = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[2]/ul/li[1]");
	By selCincoCerr = By.xpath("//li[6]");
	By selZonaHorariaAM = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[3]/ul/li[1]");
	By selZonaHorariaPM = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[3]/ul/li[2]");
	By lblHoraCierre = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/span/input");
	By selCeroMin = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]");
	By selLunes = By.id("L");
	By selMartes = By.name("Martes");
	By selMiercoles = By.name("Miercoles");
	By selJueves = By.id("J");
	By selViernes = By.id("V");
	By selSabado = By.id("S");
	By selDomingo = By.id("D");
	By btnGuardarHorario = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/footer/div/button");
	By btnActivarTienda = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/button");
	By lblMedioPago = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/ul/li[2]/div/div[1]/div/a");
	By btnGuardarMedioPago = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div[2]/button");
	By checkEfectivo = By.id("abi-cash");
	By checkDatafono = By.id("abi-pos");
	By lblDomicilio = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/ul/li[4]/div/div[1]/div/a");
	By txtAlcance = By.id("id-delivery-scope");
	By txtPedidoMinimo = By.id("id-delivery-cost");
	By txtTiempoEntrega = By.id("id-delivery-time");
	By txtCostoDomicilio = By.name("id-delivery-cost-radius");
	By btnGuardarCambiosDomicilio = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/footer/button");
	
	By lblTusPedidos = By.xpath("//span/span");
	By lblSeleccionarPedido = By.xpath("//div[2]/div/div/div[2]/p");
	By btnAceptarPedido = By.xpath("//div[2]/div/button[2]/span");
	
	By altResultAceptaPedido = By.xpath("//body/div/div[2]/div/div/div/div/div/div");
	By rbtnEnCamino = By.id("abi-state-order-1");
	By lblConfiguracion = By.name("Configuración");
	By lblCerrarSesionTendero = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[5]/div/div[2]");
	By btnSiSalirTendero = By.xpath("//button[2]/span");
	
	By rbtnEntregado = By.id("abi-state-order-2");
	By btnSiConfirmarEntregaPedido = By.xpath("//div[2]/button[2]/span");
	By lblTusMetas = By.xpath("//button[3]/span");
	By lblVerMasHistorialPedido = By.xpath("//a/span");
	By lblOrdenesFinalizadas = By.xpath("//div[2]/div/div/button[2]/span");
	By lblVerMasOrdenesFinalizadas = By.xpath("//div[3]/span");
	By lblResultEntregado = By.xpath("//p[5]");
	By lblNumeroPedidoPrimero = By.xpath("//div/div/div/div[2]/p[2]");
	
	

	
	
	public TenderoPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Seleccionar Productos Tendero")
    public TenderoPage seleccionarProductoTendero() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        click(listaProductos);
        Utilidades.waitInMs(1000);
        
		Utilidades.screenshot();
		click(checkAbarrote1);
		
		Utilidades.waitInMs(1000);
		click(checkAbarrote2);
		
		Utilidades.waitInMs(1000);
		click(checkAbarrote3);
		
		Utilidades.waitInMs(1000);
		click(checkAbarrote4);
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
    	//js.executeScript("window.scrollBy(0,500)");
		//Utilidades.waitInMs(1000);
		
		//click(checkBebida1);
		//Utilidades.screenshot();
		//Utilidades.waitInMs(1000);
		//click(checkBebida3);
		//Utilidades.screenshot();
        //Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Cambiar Horario de Atencion")
    public TenderoPage cambiarHorario(String horaApertura,String minutoApertura, String zonaApertura, String horaCierreTienda, String minutoCierreTienda, String zonaCierre) {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		
		click(lblCambioHorario);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
		Utilidades.screenshot();
		click(btnAgregarHorario);
        Utilidades.waitInMs(1000);
        js.executeScript("window.scrollBy(0,-2000)");
        click(lblHoraApertura);
        Utilidades.waitInMs(1000);
        List<WebElement> currencyList= driver.findElements(By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[1]/ul/li"));
        for(WebElement currency:currencyList){
        if(currency.getText().equals(horaApertura))
        currency.click();
        }
        List<WebElement> minutosList= driver.findElements(By.xpath("//*[@id=\"html\"]/body/div[3]/div/div/div/div[2]/div[2]/ul/li"));
        for(WebElement currency:minutosList){
        if(currency.getText().equals(minutoApertura))
        currency.click();
        
        
        }
        List<WebElement> zonaHoraria = driver.findElements(By.xpath("//*[@id=\"html\"]/body/div[3]/div/div/div/div[2]/div[3]/ul/li"));
        for(WebElement currency:zonaHoraria){
        if(currency.getText().equals(zonaApertura))
        currency.click();
        
        
        }
        //Hora de Cierre
        click(lblHoraCierre);
        
        Utilidades.waitInMs(1000);
        List<WebElement> horaCierre= driver.findElements(By.xpath("//ul/li"));
        for(WebElement currency:horaCierre){
        if(currency.getText().equals(horaCierreTienda))
        currency.click();
        }
        List<WebElement> minutoCierre= driver.findElements(By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[2]/ul/li"));
        for(WebElement currency:minutoCierre){
        if(currency.getText().equals(minutoCierreTienda))
        currency.click();
        }
        List<WebElement> zonaHorariaCierre= driver.findElements(By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[3]/ul/li"));
        for(WebElement currency:zonaHorariaCierre){
        if(currency.getText().equals(zonaCierre))
        currency.click();
        }
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        click(selLunes);
        click(selMartes);
        click(selMiercoles);
        click(selJueves);
        click(selViernes);
        click(selSabado);
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);       
    	js.executeScript("window.scrollBy(0,3000)");
    	Utilidades.screenshot();
    	click(btnGuardarHorario);
    	
        
        return this;
    }
	
	@Step("Seleccionar Medios de Pago")
    public TenderoPage seleccionarMedioPago(String medioPago) {
        Utilidades.waitInMs(1000);
        
		Utilidades.screenshot();
		
		click(lblMedioPago);
		if(medioPago == "Efectivo") {
			click(checkEfectivo);
		}else if(medioPago == "Datafono"){
			click(checkDatafono);
		}
		Utilidades.waitInMs(1000);
		Utilidades.screenshot();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Utilidades.screenshot();
        click(btnGuardarMedioPago);
        Utilidades.screenshot();
		
		Utilidades.waitInMs(1000);      
        return this;
    }
	
	@Step("Configurar Domicilio")
    public TenderoPage configurarDomicilio(String alcance, String pedidoMin, String tiempoEntre, String costoDom) {
        Utilidades.waitInMs(1000);
        
		Utilidades.screenshot();
		
		click(lblDomicilio);
		Utilidades.waitInMs(1000);
		clear(txtAlcance);
		writeText(txtAlcance, alcance);
		Utilidades.waitInMs(500);
		clear(txtPedidoMinimo);
		writeText(txtPedidoMinimo, pedidoMin);
		Utilidades.waitInMs(500);
		clear(txtTiempoEntrega);
		writeText(txtTiempoEntrega, tiempoEntre);
		Utilidades.waitInMs(500);
		clear(txtCostoDomicilio);
		writeText(txtCostoDomicilio, costoDom);
		Utilidades.screenshot();
		Utilidades.waitInMs(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Utilidades.screenshot();
        click(btnGuardarCambiosDomicilio);
		Utilidades.waitInMs(1000);      
        return this;
    }
	
	@Step("Activar Tienda")
    public TenderoPage activarTienda() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
		Utilidades.screenshot();
		
		click(btnActivarTienda);
		
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);      
        return this;
    }
	
	@Step("Seleccionar Tus Pedidos")
    public TenderoPage seleccionarTusPedidos() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		click(lblTusPedidos);
		
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);      
        return this;
    }
	@Step("Seleccionar y Aceptar Pedidos en Proceso")
    public TenderoPage seleccionarPedido() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		click(lblSeleccionarPedido);
		Utilidades.waitInMs(1000);
		click(btnAceptarPedido);
		
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);      
        return this;
    }
	
	@Step("Validar Cambio de Estado del Pedido")
    public TenderoPage comprobarResultadoCorrectoPedido() {
        
        Utilidades.screenshot();
        Assert.assertEquals(getElement(altResultAceptaPedido).getText(), "Pedido actualizado correctamente");
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Cambiar Estado Pedido a En Camino")
    public TenderoPage cambiarEstadoPedidoEnCamino() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		click(rbtnEnCamino);
		Utilidades.screenshot();
		Utilidades.waitInMs(5000);      
        return this;
    }
	
	@Step("Cerrar Sesion Tendero")
    public TenderoPage cerrarSesionTendero() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		click(lblConfiguracion);
		Utilidades.waitInMs(1000);
		Utilidades.screenshot();
		click(lblCerrarSesionTendero);
		Utilidades.screenshot();
		click(btnSiSalirTendero);
		Utilidades.screenshot();
		Utilidades.waitInMs(2000);      
        return this;
    }
	
	@Step("Cambiar Estado a Entregado")
    public TenderoPage cambiarEstadoEntregado() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        click(lblNumeroPedidoPrimero);
        Utilidades.waitInMs(2000);
		click(rbtnEntregado);
		Utilidades.waitInMs(1000);
		Utilidades.screenshot();
		click(btnSiConfirmarEntregaPedido);
		Utilidades.screenshot();
		Utilidades.waitInMs(2000);      
        return this;
    }
	
	@Step("Validar las Metas del Tendero")
    public TenderoPage validarMetasTendero() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		click(lblTusMetas);
		Utilidades.waitInMs(1000);
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);      
        return this;
    }
	
	@Step("Validar Historial de Pedidos")
    public TenderoPage validarHistorialPedidos() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		click(lblVerMasHistorialPedido);
		Utilidades.waitInMs(1000);
		click(lblOrdenesFinalizadas);
		Utilidades.waitInMs(1000);
        Utilidades.screenshot();
		click(lblVerMasOrdenesFinalizadas);
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);      
        return this;
    }
	
	@Step("Validar Cambio de Estado del Pedido")
    public TenderoPage comprobarResultadoEstadoEntregado() {
        
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblResultEntregado).getText(), "Entregado");
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
		
	public boolean getTextLink(WebElement elemento, String textoEnlace) {
		boolean resultado;
		if (elemento.getText().equals(textoEnlace)) {
			resultado= true;
		}else {
			resultado=false;
		}
		return resultado;
	}// Fin método getTextLink
	
	

}
