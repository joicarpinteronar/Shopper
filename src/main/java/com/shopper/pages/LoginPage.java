package com.shopper.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.shopper.utils.Utilidades;

import io.qameta.allure.Step;

public class LoginPage extends BasePage {
	
	By txtNumeroCelular=By.id("abi-phone");
	By btnValidar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/button");
	By txtCodigoValidacion1 = By.id("abi-otp-0");
	By txtCodigoValidacion2 = By.id("abi-otp-1");
	By txtCodigoValidacion3 = By.id("abi-otp-2");
	By txtCodigoValidacion4 = By.id("abi-otp-3");
	By txtCodigoValidacion5 = By.id("abi-otp-4");
	By btnIniciarSesion = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/div[1]/button");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Ingresar Numero de Celular")
    public LoginPage ingresarNumeroCelular(String celular) {
        Utilidades.waitInMs(500);
        writeText(txtNumeroCelular, celular);
		Utilidades.screenshot();
		click(btnValidar);
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Ingresar Codigo de Validacion")
    public LoginPage ingresarCodigoValidacion(String cod1, String cod2, String cod3, String cod4, String cod5) {
        Utilidades.waitInMs(500);
        writeText(txtCodigoValidacion1, cod1);
        writeText(txtCodigoValidacion2, cod2);
        writeText(txtCodigoValidacion3, cod3);
        writeText(txtCodigoValidacion4, cod4);
        writeText(txtCodigoValidacion5, cod5);
		Utilidades.screenshot();
		click(btnIniciarSesion);
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Comprobar Ingreso al Portal Tienda Cerca")
    public LoginPage comprobarResultadoCorrecto() {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(driver.getTitle(), "Mi cuenta");
        return this;
    }

}
