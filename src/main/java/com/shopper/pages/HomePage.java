package com.shopper.pages;

import java.io.IOException;

import org.openqa.selenium.By;
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

public class HomePage extends BasePage {
	
	By txtNumeroCelular=By.id("abi-phone");
	By selCiudad = By.id("cityLocation");
	By btnContinuarSelCiudad = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/button");
	By btnValidar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/button");
	By txtCodigoValidacion1 = By.id("abi-otp-0");
	By txtCodigoValidacion2 = By.id("abi-otp-1");
	By txtCodigoValidacion3 = By.id("abi-otp-2");
	By txtCodigoValidacion4 = By.id("abi-otp-3");
	By txtCodigoValidacion5 = By.id("abi-otp-4");
	By btnIniciarSesion = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/div[1]/button");
	By lblBienvenido = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[1]/p[1]");
	By lblSeleccionaCiudad = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/p[1]");
	By btnConsumidor = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div[1]/a");
	By btnTendero = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div[2]/a");


	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Abrir Portal Shopper. Url {0}")
    public HomePage irPortal(String url)  {
        driver.get(url);
        Utilidades.waitInMs(1000);
        return new HomePage(driver);
    }
	
	@Step("Seleccionar la Ciudad")
    public HomePage seleccionarCiudad(String ciudad) {
        Utilidades.waitInMs(1000);
        Select unoSel = new Select(driver.findElement(selCiudad));
		unoSel.selectByVisibleText(ciudad);
		Utilidades.screenshot();
		click(btnContinuarSelCiudad);
        Utilidades.waitInMs(1000);
        return this;
    }

    @Step("Comprobar Paso al Portal Bienvenido")
    public HomePage comprobarResultadoCorrecto() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblBienvenido).getText(), "Bienvenido");
        return this;
    }
    @Step("Seleccionar Rol")
    public HomePage seleccionarRol(String rol) {
    	if (rol == "Consumidor") {
    		click(btnConsumidor);
    		Utilidades.waitInMs(1000);
    	}else if(rol =="Tendero"){
    		click(btnTendero);
    		Utilidades.waitInMs(1000);
    	}
        
        return this;
    }
    
    

}
