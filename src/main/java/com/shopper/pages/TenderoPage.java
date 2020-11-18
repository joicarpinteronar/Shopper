package com.shopper.pages;
import java.io.IOException;

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
	By checkAbarrote1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/span/span[1]/span[1]/span");
	By checkAbarrote2 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[2]/div/div[3]/div/span/span[1]/span[1]/span");
	By checkBebida1 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[3]/div/div[2]/div/span/span[1]/span[1]/span");
	By checkBebida3 = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div/div/div/div[3]/div/div[4]/div/span/span[1]/span[1]/span");
	By lblCambioHorario = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/ul/li[2]/div/div[1]/div/a");
	By btnAgregarHorario = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/footer/button");
	By lblHoraApertura = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/div[2]/div/div[1]/div[1]/div[1]/span");
	By selCincoAper = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[1]/ul/li[6]");
	By selCeroMin = By.xpath("//*[@id=\"html\"]/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]");
	By btnActivarTienda = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/button");

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
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
		click(checkAbarrote2);
		Utilidades.screenshot();
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)");
		Utilidades.waitInMs(1000);
		
		click(checkBebida1);
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
		click(checkBebida3);
		Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Cambiar Horario de Atencion")
    public TenderoPage cambiarHorario() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)");
		Utilidades.screenshot();
		
		click(lblCambioHorario);
		Utilidades.screenshot();
        Utilidades.waitInMs(500);
        
        
    	js.executeScript("window.scrollBy(0,2000)");
    	
        
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

}
