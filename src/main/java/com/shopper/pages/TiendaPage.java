package com.shopper.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.shopper.utils.Utilidades;

import io.qameta.allure.Step;

public class TiendaPage extends BasePage{
	
	By btnTienda1=By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/div[2]/ul/li[2]/div/div[1]");
	By btnTienda4=By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/section[1]/ul/li[4]/div/div[1]");
	By btnProducto1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div[2]/div[1]/div/div[3]/button");
	By btnProducto2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/button");
	By btnProducto3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/button");
	By btnProducto4 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div[2]/div[4]/div/div[3]/button");
	By btnProducto5 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div[2]/div[5]/div/div[3]/button");
	
	By btnProdBebida1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[3]/div[2]/div[1]/div/div[3]/button");
	By btnProdBebida2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[3]/div[2]/div[2]/div/div[3]/button");
	
	By btnProdCerveza1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[5]/div[2]/div[1]/div/div[3]/button");
	By btnProdCerveza2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[5]/div[2]/div[2]/div/div[3]/button");
	By btnProdCerveza3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[5]/div[2]/div[3]/div/div[3]/button");
	By btnProdCerveza4 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[5]/div[2]/div[4]/div/div[3]/button");
	
	By btnProdCuidadoHogar1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[6]/div[2]/div[1]/div/div[3]/button");
	By btnProdCuidadoHogar2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[6]/div[2]/div[2]/div/div[3]/button");
	By btnProdCuidadoHogar3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[6]/div[2]/div[3]/div/div[3]/button");
	
	By btnProdCuidadoPersonal1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[7]/div[2]/div[1]/div/div[3]/button");
	By btnProdCuidadoPersonal2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[7]/div[2]/div[2]/div/div[3]/button");
	
	By btnProdLacteos1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[8]/div[2]/div[1]/div/div[3]/button");
	By btnProdLacteos2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[8]/div[2]/div[2]/div/div[3]/button");
	
	By btnProdSnacks1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[9]/div[2]/div[1]/div/div[3]/button");
	By btnProdSnacks2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[9]/div[2]/div[2]/div/div[3]/button");
	By btnProdSnacks3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[9]/div[2]/div[3]/div/div[3]/button");
	By btnProdSnacks4 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[9]/div[2]/div[4]/div/div[3]/button");
	By btnProdSnacks5 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[8]/div[2]/div[5]/div/div[3]/button");
	
	By btnCarrito = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/button/span[1]");
	By btnContinuar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[4]/button");
	By btnGenero = By.id("abi-validate-gender-F");
	By txtFechaNacimiento = By.id("abi-validate-date-birth");
	By btnContinuarValDatos = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/form/button");
	By btnFinalizarPedido = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/section[5]/button");
	
	By txt_to_apto_casa = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/input");
	By txtIntruccionEntrega = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/textarea");
	By btnDireccionDeMi = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[4]/div/div[1]/figure");
	By btnGuardar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/button");

	public TiendaPage(WebDriver driver) {
		super(driver);
		
	}
	@Step("Seleccionar Tienda Cercana")
    public TiendaPage seleccionarTienda() {
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        click(btnTienda4);
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Seleccionar Productos Abarrotes")
    public TiendaPage seleccionarProductoAbarrotes() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,200)");
        Utilidades.screenshot();
        click(btnProducto1);
        Utilidades.waitInMs(500);
        click(btnProducto2);
        Utilidades.waitInMs(500);
        click(btnProducto3);
        Utilidades.waitInMs(500);
        click(btnProducto4);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Seleccionar Productos Bebidas")
    public TiendaPage seleccionarProductoBebidas() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,400)");
        Utilidades.screenshot();
        click(btnProdBebida1);
        Utilidades.waitInMs(500);
        click(btnProdBebida2);
        
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Seleccionar Productos Cervezas")
    public TiendaPage seleccionarProdCerveza() {
        Utilidades.waitInMs(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,800)");
        Utilidades.screenshot();
        click(btnProdCerveza1);
        Utilidades.waitInMs(500);
        click(btnProdCerveza2);
        Utilidades.waitInMs(500);
        click(btnProdCerveza3);
        Utilidades.waitInMs(500);
        click(btnProdCerveza4);
        
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Seleccionar Productos Cuidado Hogar")
    public TiendaPage seleccionarProdCuidadoHogar() {
        Utilidades.waitInMs(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,700)");
        Utilidades.screenshot();
        click(btnProdCuidadoHogar1);
        Utilidades.waitInMs(500);
        click(btnProdCuidadoHogar2);
        Utilidades.waitInMs(500);
        click(btnProdCuidadoHogar3);
        
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Seleccionar Productos Cuidado Personal")
    public TiendaPage seleccionarProdCuidadoPersonal() {
        Utilidades.waitInMs(3000);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
    	//js.executeScript("window.scrollBy(0,1000)");
        Utilidades.screenshot();
        click(btnProdCuidadoPersonal1);
        Utilidades.waitInMs(500);
        click(btnProdCuidadoPersonal2);
                
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Seleccionar Productos Lacteos")
    public TiendaPage seleccionarProdLacteo() {
        Utilidades.waitInMs(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1500)");
        Utilidades.screenshot();
        click(btnProdLacteos1);
        Utilidades.waitInMs(500);
        click(btnProdLacteos1);
                
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Seleccionar Productos Snack")
    public TiendaPage seleccionarProdSnack() {
        Utilidades.waitInMs(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,2000)");
        Utilidades.screenshot();
        click(btnProdSnacks1);
        Utilidades.waitInMs(500);
        click(btnProdSnacks2);
        Utilidades.waitInMs(500);
        click(btnProdSnacks3);
        Utilidades.waitInMs(500);
        click(btnProdSnacks4);
        //Utilidades.waitInMs(500);
        //click(btnProdSnacks5);
                
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Ver Carrito de Compra")
    public TiendaPage verCarrito() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,3000)");
        Utilidades.screenshot();
        click(btnCarrito);
                        
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        
    	
        return this;
    }
	@Step("Ver Resumen de Productos")
    public TiendaPage verResumenProd() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
        Utilidades.screenshot();
        js.executeScript("window.scrollBy(0,3000)");
        Utilidades.screenshot();
        click(btnContinuar);
                        
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
            	
        return this;
    }
	
	@Step("Ver Totales y Finalizar Pedido")
    public TiendaPage finalizarPedido() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
        Utilidades.screenshot();
        js.executeScript("window.scrollBy(0,3000)");
        Utilidades.screenshot();
        click(btnFinalizarPedido);
                        
        Utilidades.screenshot();
        Utilidades.waitInMs(3000);
        Utilidades.screenshot();
            	
        return this;
    }
	@Step("Comprobar que el Pedido fue Realizado")
    public TiendaPage comprobarResultadoCorrecto() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        //Assert.assertEquals(getElement(lblBienvenido).getText(), "Bienvenido");
        return this;
    }

}
