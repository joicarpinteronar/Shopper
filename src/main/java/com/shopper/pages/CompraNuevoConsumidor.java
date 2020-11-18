package com.shopper.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.shopper.utils.Utilidades;
import io.qameta.allure.Step;

public class CompraNuevoConsumidor extends BasePage{
	
	By btnIntroSiguiente = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[2]/div/button");
	By btnIntroSiguiente2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[2]/div/button");
	By btnIntroFinalizar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[2]/div/button");
	By btnTienda2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/div[2]/ul/li[2]/div/div[1]");
	By btnGenero = By.id("abi-validate-gender-F");
	By txtFechaNacimiento = By.id("abi-validate-date-birth");
	By btnContinuarValDatos = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/form/button");
	By btnFinalizarPedido = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/section[5]/button");
	
	By txt_to_apto_casa = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/input");
	By txtIntruccionEntrega = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/textarea");
	By btnDireccionDeMiCasa = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[4]/div/div[1]/figure");
	By btnDireccionOficina = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[4]/div/div[2]/figure");
	By btnDireccionNovia = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[4]/div/div[3]/figure");
	By btnDireccionOtro = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[4]/div/div[4]/figure");
	By btnGuardar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/button");

	public CompraNuevoConsumidor(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Validar Introduccion de la Aplicacion")
    public CompraNuevoConsumidor validarIntroduccion() {
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        click(btnIntroSiguiente);
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        click(btnIntroSiguiente2);
        Utilidades.screenshot();
		click(btnIntroFinalizar);
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Seleccionar Tienda Primera Compra")
    public CompraNuevoConsumidor seleccionarTiendaCompra() {
        Utilidades.waitInMs(1500);
        Utilidades.screenshot();
        click(btnTienda2);
        Utilidades.waitInMs(500);
        return this;
    }
	
	@Step("Validar Datos Ingresados Consumidor")
    public CompraNuevoConsumidor validarDatosConsumidor(String dia, String mes, String year) {
        Utilidades.waitInMs(1000);
        click(btnGenero);
        writeText(txtFechaNacimiento, dia);
        driver.findElement(txtFechaNacimiento).sendKeys(Keys.TAB);
        writeText(txtFechaNacimiento, mes);
        driver.findElement(txtFechaNacimiento).sendKeys(Keys.TAB);
        writeText(txtFechaNacimiento, year);
        Utilidades.screenshot();
        click(btnContinuarValDatos);
        Utilidades.waitInMs(500);
        return this;
    }
	
	@Step("Complementar Direccion de Entrega")
    public CompraNuevoConsumidor complementarDireccion(String apartamento, String instEntrega, String perteneceA) {
        Utilidades.waitInMs(1000);
        
        writeText(txt_to_apto_casa, apartamento);
        
        writeText(txtIntruccionEntrega, instEntrega);
        
        if(perteneceA =="Casa") {
        	Utilidades.waitInMs(500);
        	click(btnDireccionDeMiCasa);
        }else if(perteneceA =="Oficina") {
        	Utilidades.waitInMs(500);
        	click(btnDireccionOficina);
        	
        }else if(perteneceA =="Novia") {
        	Utilidades.waitInMs(500);
        	click(btnDireccionNovia);
        	
        }else if(perteneceA =="Otro") {
        	Utilidades.waitInMs(500);
        	click(btnDireccionOtro);
        	
        }
        Utilidades.screenshot();
        click(btnGuardar);
        Utilidades.waitInMs(500);
        return this;
    }
	/*
	@Step("Finalizar Compra Consumidor")
    public CompraNuevoConsumidor finalizarCompra() {
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        click(btnIntroSiguiente);
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        click(btnIntroSiguiente2);
        Utilidades.screenshot();
		click(btnIntroFinalizar);
        Utilidades.waitInMs(1000);
        return this;
    }
*/
}
