package com.shopper.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.shopper.utils.Utilidades;
import io.qameta.allure.Step;

public class RegistroConsumidorPage extends BasePage{
	
	By txtNumeroCelular= By.id("abi-phone");
	By btnValidarCelular = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/button");
	By checkTerminos = By.id("abi-checkbox-terms");	
	By checkPoliticas = By.id("abi-checkbox-policies");
	By checkAutorizo= By.id("abi-checkbox-personal-information");
	By btnContinuar= By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[3]/button");
	By txtNombre = By.id("register-name");
	By txtApellido = By.id("register-lastName");
	By txtCorreo = By.id("register-email");
	By btnSiguiente = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[2]/div/button[2]");
	By btnIngreseUbicacion = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[1]/div/div/div[2]/div/div[1]/button");
	By txtUbicacion = By.id("address");
	By btnConfirmarUbicacion = By.xpath("//*[@id=\"html\"]/body/div[2]/div[3]/div/div/div[2]/div/form[2]/button");
	By selDireccion = By.xpath("//*[@id=\"html\"]/body/div[2]/div[3]/div/div/div[2]/div/form[1]/div/div[2]/ul/li");
	
	
	public RegistroConsumidorPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Aceptar Terminos")
    public RegistroConsumidorPage validarTerminos() {
        Utilidades.waitInMs(500);
        click(checkTerminos);
        click(checkPoliticas);
		Utilidades.screenshot();
		click(btnContinuar);
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Ingresar Datos Personales Consumidor")
    public RegistroConsumidorPage ingresarDatosPersonales(String nombre, String apellido, String correo) {
        Utilidades.waitInMs(500);
        writeText(txtNombre, nombre);
        writeText(txtApellido, apellido);
        writeText(txtCorreo, correo);
		Utilidades.screenshot();
		click(btnSiguiente);
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Ingresar Ubicacion Consumidor")
    public RegistroConsumidorPage ingresarUbicacionConsumidor(String direccion) {
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        click(btnIngreseUbicacion);
        Utilidades.waitInMs(2000);
        writeText(txtUbicacion, direccion);
        Utilidades.waitInMs(2000);
        //Utilidades.seleccionarKeyBoard(driver.findElement(txtUbicacion));
        click(selDireccion);
        Utilidades.waitInMs(2000);
        
		Utilidades.screenshot();
		click(btnConfirmarUbicacion);
        Utilidades.waitInMs(5000);
        return this;
    }

}
