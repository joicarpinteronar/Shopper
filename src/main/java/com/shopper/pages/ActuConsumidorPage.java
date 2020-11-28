package com.shopper.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shopper.utils.Utilidades;

import io.qameta.allure.Step;

public class ActuConsumidorPage extends BasePage {
	
	By lblPerfil = By.name("Perfil");
	By lblMiPerfil = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[1]/a[1]/div[2]");
	By txtNombre = By.id("abi-profile-name");
	By txtApellido = By.id("abi-profile-lastname");
	By txtFechaNacimiento = By.id("abi-date-birth");
	By btnGeneroM = By.id("abi-gender-M");
	By btnGeneroF = By.id("abi-gender-F");
	By btnGeneroO = By.id("abi-gender-O");
	By btnCambiarCelular = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/form/div[3]/button");
	By btnCambioNumeroCelular = By.xpath("//*[@id=\"html\"]/body/div[2]/div[3]/div/div[2]/button[2]");
	
	By btnCambiarCorreo = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/form/div[4]/button");
	By btnCambiarCor = By.xpath("//*[@id=\"html\"]/body/div[2]/div[3]/div/div[2]/button[2]");
	By txtNuevoCorreo = By.id("register-email");
	By btnContinuarCambioCorreo = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/div[1]/form/div[3]/div/button");
	
	By btnEliminarCuenta = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/form/div[5]/button");
	By btnGuardarCambios = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/form/div[6]/button");
	
	
	By lblDireccionEntrega = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[1]/div[1]/a[2]/div[2]");
	By lblModificarDireccion = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/div/div[2]/div[1]/div/p");
	By txtDireccionActualiza = By.id("address");
	By btnContinuarActDir = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[2]/div/form[2]/button");
	By txtUbicacion = By.id("address");
	By btnConfirmarUbicacion = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[2]/div/form[2]/button");
	By selDireccion = By.xpath("//*[@id=\"html\"]/body/div[2]/div[3]/div/div/div[2]/div/form[1]/div/div[2]/ul/li");
	By txt_to_apto_casa = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/input");
	By txtIntruccionEntrega = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[3]/textarea");
	By btnDireccionDeMiCasa = By.id("abi-checkbox-etiqueta-home");
	By btnDireccionOficina = By.id("abi-checkbox-etiqueta-office");
	By btnDireccionNovia = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[4]/div/div[3]/figure");
	By btnDireccionOtro = By.id("abi-checkbox-etiqueta-other");
	By btnGuardar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/button");
	
	
	By lblHistorialCompras = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[1]/div[2]/a/div[2]");
	By lblEnCursoHisCompra = By.xpath("//*[@id=\"full-width-tab-0\"]/span");
	By lblAnterioresHisCompra = By.xpath("//*[@id=\"full-width-tab-1\"]/span");
	By btnVerHistorialCompra = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/section[2]/section/div[1]/div[3]/button");
	By btnPedirNuevamente = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/button[1]");
	By lblPagarEfectivo = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[6]/div/div[2]/div[2]");
	By btnContinuarHisCompra = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[6]/button");
	By btnFinalizarPedidoHisCompra = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/section[5]/button");
	
	By lblNotofocaciones = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[1]/div[3]/a/p");
	By checkMensajeTexto = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/div/form/div[1]/span/span[1]/span[1]/input");
	By checkCorreoElectornico = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/div/form/div[2]/span/span[1]/span[1]/input");
	By checkNotificacionPush = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div/div/div/form/div[3]/span/span[1]/span[1]/input");
	
	By lblAyuda = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[1]/div[4]/a/p");
	
	By lblTutoriales = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[1]/div[5]/a/p");
	
	By lblCerrarSesion = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[1]/div[6]/div/p");
	By btnSiSalir = By.xpath("//*[@id=\"html\"]/body/div[2]/div[3]/div/div[2]/button[2]");
	By btnNoSalir = By.xpath("//*[@id=\"html\"]/body/div[2]/div[3]/div/div[2]/button[1]");
	
		
	public ActuConsumidorPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Seleccionar Opcion Perfil")
    public ActuConsumidorPage seleccionarPerfil() {
        Utilidades.waitInMs(1000);
        click(lblPerfil);
        Utilidades.waitInMs(1000);
        click(lblMiPerfil);
		Utilidades.screenshot();
		Utilidades.waitInMs(2000);
        return this;
    }
	
	
	@Step("Modificar Nombre y Apellido Consumidor")
    public ActuConsumidorPage modificarNombreApellido(String nombreNuevo, String apellidoNuevo) {
        Utilidades.waitInMs(1000);
        clear(txtNombre);
        writeText(txtNombre, nombreNuevo);
        clear(txtApellido);
        writeText(txtApellido, apellidoNuevo);
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Modificar Fecha de Nacimiento")
    public ActuConsumidorPage modificarFechaNacimiento(String dia, String mes, String year) {
        Utilidades.waitInMs(500);
        writeText(txtFechaNacimiento, dia);
        driver.findElement(txtFechaNacimiento).sendKeys(Keys.TAB);
        writeText(txtFechaNacimiento, mes);
        driver.findElement(txtFechaNacimiento).sendKeys(Keys.TAB);
        writeText(txtFechaNacimiento, year);
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Modificar Genero")
    public ActuConsumidorPage modificarGenero(String genero) {
        Utilidades.waitInMs(1000);
        if(genero == "Hombre") {
        	click(btnGeneroM);
        }else if(genero == "Mujer") {
        	click(btnGeneroF);
        }else if(genero == "Otro") {
        	click(btnGeneroO);
        }
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Guardar Cambios Realizados")
    public ActuConsumidorPage guardarCambios() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        click(btnGuardarCambios);
        
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Cambiar Correo Electronico")
    public ActuConsumidorPage cambiarCorreo() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        Utilidades.screenshot();
        click(btnCambiarCorreo);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        click(btnCambiarCor);
        
        
		Utilidades.screenshot();
		Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Ingresar Nuevo Correo Electronico")
    public ActuConsumidorPage ingresarNuevoCorreo(String nuevoCorreo) {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Utilidades.screenshot();
        writeText(txtNuevoCorreo, nuevoCorreo);
        Utilidades.screenshot();
        click(btnContinuarCambioCorreo);       
		Utilidades.screenshot();
		Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Cambiar Numero de Celular")
    public ActuConsumidorPage cambiarCelular() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Utilidades.screenshot();
        click(btnCambiarCelular);
        Utilidades.screenshot();
        click(btnCambioNumeroCelular);            
		Utilidades.screenshot();
		Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Modificar Direccion de Entrega")
    public ActuConsumidorPage modificarDireccion() {
        Utilidades.waitInMs(1000);
        click(lblDireccionEntrega);
        Utilidades.screenshot();
        click(lblModificarDireccion);
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Ingresar Nueva Direccion Consumidor")
    public ActuConsumidorPage ingresarNuevaDireccionConsumidor(String direccion) {
        Utilidades.waitInMs(500);
        Utilidades.screenshot();
        
        Utilidades.waitInMs(2000);
        clear(txtUbicacion);
        Utilidades.waitInMs(1000);
        writeText(txtUbicacion, direccion);
        Utilidades.waitInMs(2000);
                        
		Utilidades.screenshot();
		click(btnConfirmarUbicacion);
        Utilidades.waitInMs(3000);
        return this;
    }
	
	@Step("Complementar Nueva Direccion de Entrega")
    public ActuConsumidorPage complementarNuevaDireccion(String apartamento, String instEntrega, String perteneceA) {
        Utilidades.waitInMs(1000);
        clear(txt_to_apto_casa);
        writeText(txt_to_apto_casa, apartamento);
        clear(txtIntruccionEntrega);
        writeText(txtIntruccionEntrega, instEntrega);
        
        if(perteneceA =="Casa") {
        	Utilidades.waitInMs(500);
        	click(btnDireccionDeMiCasa);
        }else if(perteneceA =="Trabajo") {
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
        Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Ver Historial de Mis Pedidos y Volver a Comprar ese Pedido")
    public ActuConsumidorPage verHistorialPedidosConsumidor() {
        Utilidades.waitInMs(1000);
        click(lblHistorialCompras);
        Utilidades.screenshot();
        click(lblAnterioresHisCompra);
        Utilidades.screenshot();
        click(btnVerHistorialCompra);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Utilidades.screenshot();
        click(btnPedirNuevamente);
        Utilidades.waitInMs(1000);
        js.executeScript("window.scrollBy(0,1000)");
        Utilidades.screenshot();
        click(lblPagarEfectivo);
        
        click(btnContinuarHisCompra);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        js.executeScript("window.scrollBy(0,1000)");
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        click(btnFinalizarPedidoHisCompra);
                        
		Utilidades.screenshot();
		
        Utilidades.waitInMs(5000);
        return this;
    }
	
	

	

}
