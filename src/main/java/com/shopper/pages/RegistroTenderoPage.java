package com.shopper.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.shopper.utils.Utilidades;
import io.qameta.allure.Step;

public class RegistroTenderoPage extends BasePage{
	
	By txtCodigoCliente=By.id("login-clientCode");
	By btnValidarUsuario = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/button[1]");
	By checkAceptaTerminos = By.id("abi-checkbox-terms");
	By checkAceptaPoliticas = By.id("abi-checkbox-policies");
	By btnContinuarRegistro = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[3]/button");
	By txtDocumentoIdentificacion = By.id("abi-client-document");
	By txtNumeroCelularTendero = By.id("abi-phone");
	By btnContinuarDatosPersonales = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div[3]/button");
	
	By checkConfirmoServicio = By.id("abi-1");
	By btnSiguienteConfirmo = By.xpath("//button/span");
	By cbxTipoNegocio = By.id("id-businessType");
	By btnSiguienteTipNeg = By.xpath("//button/span");
	
	By btnAbarrotes = By.id("abarrotes");
	By btnBebidas = By.id("bebidas");
	By btnCervezas = By.id("cervezas");
	By btnCuidadoHogar = By.id("ciudado_hogar");
	By btnCuidadoPersonal = By.id("ciudado_personal");
	By btnSiguienteCategoria = By.xpath("//button/span");
	
	By checkEfectivo = By.id("cash");
	By checkDatafono = By.id("pos");
	By btnFinalizarRegistroTen = By.xpath("//button/span");
	
	By lblResultRegistroTendero = By.xpath("//main/div/div/p");
	By lblCodigoTenderoInvalido = By.xpath("//div[2]/div/div/div/div/div/div");
	By lblResultDocumentoObligatorio = By.xpath("//div/div[2]/div");
	By lblResultCampoCelVacio = By.xpath("//div[2]/div/div[2]/div/div");
	
	By btnSiguienteCatIntro = By.xpath("//span");
	By btnSiguineteHorIntro = By.xpath("//span");
	By btnSiguienteDomIntro = By.xpath("//span");
	By btnSiguienteCueIntro = By.xpath("//span");
	

	public RegistroTenderoPage(WebDriver driver) {
		super(driver);
		
	}
	@Step("Ingresar Codigo Tendero")
    public RegistroTenderoPage ingresarCodigoTendero(String codigo) {
        Utilidades.waitInMs(500);
        clear(txtCodigoCliente);
        writeText(txtCodigoCliente, codigo);
        Utilidades.screenshot();
        click(btnValidarUsuario);
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Ingresar Datos Personales Tendero")
    public RegistroTenderoPage ingresarDatosTendero(String documento, String celular) {
        Utilidades.waitInMs(500);
        writeText(txtDocumentoIdentificacion, documento);
        writeText(txtNumeroCelularTendero, celular);
        Utilidades.screenshot();
        click(btnContinuarDatosPersonales);
        Utilidades.waitInMs(3000);
        return this;
    }
	@Step("Seleccionar que Tiene Servicio Domiciliario")
    public RegistroTenderoPage seleccionarServicioDomiciliario() {
        Utilidades.waitInMs(500);
        click(checkConfirmoServicio);
        Utilidades.screenshot();
        click(btnSiguienteConfirmo);
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Seleccionar Tipo de Negocio")
    public RegistroTenderoPage seleccionarTipoNegocio(String tipoNegocio) {
        Utilidades.waitInMs(500);
        Select unoSel = new Select(driver.findElement(cbxTipoNegocio));
		unoSel.selectByVisibleText(tipoNegocio);
        Utilidades.screenshot();
        click(btnSiguienteTipNeg);
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Seleccionar Categorias Tendero")
    public RegistroTenderoPage seleccionarCategorias() {
        Utilidades.waitInMs(500);
        click(btnAbarrotes);
        click(btnBebidas);
        click(btnCervezas);
        click(btnCuidadoHogar);
        click(btnCuidadoPersonal);
        Utilidades.screenshot();
        click(btnSiguienteCategoria);
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Seleccionar Medio de Pago")
    public RegistroTenderoPage seleccionarMedioPago(String medioPago) {
        Utilidades.waitInMs(500);
        if(medioPago == "Efectivo") {
        	click(checkEfectivo);
        }else if(medioPago == "Datafono") {
        	click(checkDatafono);
        }
        Utilidades.screenshot();
        click(btnFinalizarRegistroTen);
        Utilidades.waitInMs(5000);
        Utilidades.screenshot();
        return this;
 }
	
	@Step("Validar Resultado Registro Tendero")
	public RegistroTenderoPage validarRegistroTendero(String resultado) {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblResultRegistroTendero).getText(), resultado);
        Utilidades.waitInMs(4000);
        return this;
    }
	
	@Step("Validar Codigo Invalido Registro Tendero")
	public RegistroTenderoPage validarCodigoInvalidoTendero(String resultado) {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblCodigoTenderoInvalido).getText(), resultado);
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Validar Campos Vacios")
	public RegistroTenderoPage validarCampoVacio(String resultado, String resultado2) {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblResultDocumentoObligatorio).getText(), resultado);
        Utilidades.waitInMs(1000);
        Assert.assertEquals(getElement(lblResultCampoCelVacio).getText(), resultado2);
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Validar Introduccion Tendero")
    public RegistroTenderoPage validarIntroduccion() {
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        click(btnSiguienteCatIntro);
        Utilidades.screenshot();
        click(btnSiguineteHorIntro);
        Utilidades.screenshot();
        click(btnSiguienteDomIntro);
        Utilidades.screenshot();
        click(btnSiguienteCueIntro);
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
	
	
}
