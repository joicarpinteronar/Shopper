package com.shopper.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.shopper.utils.Utilidades;
import io.qameta.allure.Step;

public class TenderoPrimeraVezPage extends BasePage {
	
	By txtCodigoCliente=By.id("login-clientCode");
	By checkConfirmoServicio = By.id("abi-1");
	By btnSiguienteConfirmo = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[2]/div/button[2]");
	

	public TenderoPrimeraVezPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Validar Servicio Domicilio Tendero")
    public TenderoPrimeraVezPage validarServicioDomicilio() {
        Utilidades.waitInMs(500);
       // writeText(txtCodigoCliente, codigo);
        Utilidades.screenshot();
        //click(btnValidarUsuario);
        Utilidades.waitInMs(1000);
        return this;
    }

}
