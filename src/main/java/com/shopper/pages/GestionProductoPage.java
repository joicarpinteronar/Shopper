package com.shopper.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.shopper.utils.Utilidades;

import io.qameta.allure.Step;

public class GestionProductoPage extends BasePage {
	
	By btnBuscar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/form/div");
	By txtBuscarProducto = By.id("consumerGeneralSearch");
	By lblResultBusquedaProducto = By.xpath("//header/p");
	By btnBuscarProducto = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div/div[1]/form/button");
	By lblTiendas = By.xpath("//button[2]/span");
	By selTienda = By.xpath("//figure/img");
	By txtProductoBuscar = By.id("abi-search-textfield");
	By btnProductoBuscar = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/div[2]/div[1]/button");
	By lblListaTiendas = By.xpath("//*[@id=\"root\"]/div[1]/main/div/div/section[3]/section/div[2]/div[2]/div/div[1]/div");
	
	By lblAbarrotes = By.xpath("//h2");
	By btnAborrote1 = By.xpath("//div[3]/button/span");
	By btnAbarrote2 = By.xpath("//div[2]/div/div[3]/button/span");
    
	By lblBebidas = By.xpath("//div[3]/div/h2");
	By btnBebida1 = By.xpath("//div[3]/div[2]/div/div/div[3]/button/span");
	By btnBebida2 = By.xpath("//div[3]/div[2]/div[2]/div/div[3]/button/span");
	
	By lblCerveza = By.xpath("//div[4]/div/h2");
	By btnCerveza1 = By.xpath("//div[4]/div[2]/div/div/div[3]/button/span");
	By btnCerveza2 = By.xpath("//div[4]/div[2]/div[2]/div/div[3]/button/span");
	
	By lblLicores = By.xpath("//div[10]/div/h2");
	By btnLicor1 = By.xpath("//div[10]/div[2]/div/div/div[3]/button/span");
	By btnLicor2 = By.xpath("//div[10]/div[2]/div[2]/div/div[3]/button/span");
	
	By lblAgregarProductos = By.xpath("//div[2]/p[2]");
	
	By lblNumeroPedidos = By.xpath("//div/div[2]/p");
	By lblValorProducto1 = By.xpath("//p[3]");
	By lblValorProducto2 = By.xpath("//div[2]/div/div/p[3]");
	By lblValorProducto3 = By.xpath("//div[3]/div/div/p[3]");
	By lblValorProducto4 = By.xpath("//div[4]/div/div/p[3]");
	By lblValorProducto5 = By.xpath("//div[5]/div/div/p[3]");
	By lblValorProducto6 = By.xpath("//div[6]/div/div/p[3]");
	By lblValorTotalProductos = By.xpath("//li/p");
	By lblValorDomicilio = By.xpath("//li[2]/p");
	By lblValorTotalPedido = By.xpath("//div[4]/p[2]");
	By btnVerPedidoCurso = By.xpath("//div[3]/button");
	
	By lblCostoTotal = By.xpath("//section[2]/div/p[2]");
	By lblVerMasCostos = By.xpath("//label/img");
	By lblTotalProducto = By.xpath("//article/div/p[2]");
	By lblDomicilio = By.xpath("//div[2]/p[2]");
	By lblProductoPed1 = By.xpath("//li/div/div/div/p[3]");
	By lblProductoPed2 = By.xpath("//li[2]/div/div/div/p[3]");
	By lblProductoPed3 = By.xpath("//li[3]/div/div/div/p[3]");
	By lblProductoPed4 = By.xpath("//li[4]/div/div/div/p[3]");
	By lblProductoPed5 = By.xpath("//li[5]/div/div/div/p[3]");
	By lblProductoPed6 = By.xpath("//li[6]/div/div/div/p[3]");
	By lblCantidadProd1 = By.xpath("//div[@id='691']/div/div[2]");
	By lblCantidadProd2 = By.xpath("//li[2]/div/div/div[2]");
	By lblCantidadProd3 = By.xpath("//li[3]/div/div/div[2]");
	By lblCantidadProd4 = By.xpath("//li[4]/div/div/div[2]");
	By lblCantidadProd5 = By.xpath("//li[5]/div/div/div[2]");
	By lblCantidadProd6 = By.xpath("//li[6]/div/div/div[2]");
	
	By lblVerMasProductosAbarrotes = By.xpath("//div[2]/div[2]/div/div/div");
	By btnProdAbarrote1 = By.xpath("//div[3]/button/span");
	By btnProdAbarrote2 = By.xpath("//div[2]/div[3]/button");
	By btnProdAbarrote3 = By.xpath("//div[2]/div[3]/button/span");
	By btnProdAbarrote4 = By.xpath("//div[3]/div[3]/button/span");
	By btnProdAbarrote5 = By.xpath("//div[4]/div[3]/button/span");
	By btnProdAbarrote6 = By.xpath("//div[5]/div[3]/button/span");
	By btnProdAbarrote7 = By.xpath("//div[6]/div[3]/button/span");
	By btnProdAbarrote8 = By.xpath("//div[7]/div[3]/button/span");
	By btnProdAbarrote9 = By.xpath("//div[8]/div[3]/button/span");
	By lblMasProductos = By.xpath("//div[8]/div[3]/div/span/b");
	By lblMenosProductos = By.xpath("//div[8]/div[3]/div/span/b[2]");
	By btnCarrito = By.name("Carrito");
	
	By listaCategoriaProductos = By.xpath("//div[2]/ul/li");
	
		
	
	
	

	public GestionProductoPage(WebDriver driver) {
		super(driver);
		
	}
	
	@Step("Buscar Productos por Nombre")
    public GestionProductoPage buscarProductoNombre(String producto) {
        Utilidades.waitInMs(1000);
        click(btnBuscar);
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        writeText(txtBuscarProducto, producto);
        Utilidades.waitInMs(1000);
		Utilidades.screenshot();
		click(btnBuscarProducto);
		Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Comprobar Busqueda de Producto")
	public GestionProductoPage comprobarResultadoBuscarProducto(String resultado) {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblResultBusquedaProducto).getText(), resultado);
        return this;
    }
	
	@Step("Buscar Tienda por Nombre")
    public GestionProductoPage buscarTiendaNombre(String tienda, String producto) {
        Utilidades.waitInMs(1000);
        click(btnBuscar);
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        Utilidades.screenshot();
        click(lblTiendas);
        Utilidades.waitInMs(2000);
        writeText(txtBuscarProducto, tienda);
        Utilidades.waitInMs(2000);
		Utilidades.screenshot();
		click(btnBuscarProducto);
		Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        click(selTienda);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        writeText(txtProductoBuscar, producto);
       // click(txtProductoBuscar);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        click(btnProductoBuscar);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        
        return this;
    }
	
	@Step("Seleccionar Tienda por Nombre")
    public GestionProductoPage seleccionarTiendaPorNombre(String tienda) {
        Utilidades.waitInMs(3000);
        List<WebElement> currencyList= driver.findElements(lblListaTiendas);
        for(WebElement currency:currencyList){
        if(currency.getText().equals(tienda))
        currency.click();
        }
        Utilidades.screenshot();
        Utilidades.waitInMs(3000);
        return this;
    }
	
	@Step("Buscar Categoria de Productos por Nombre")
    public GestionProductoPage buscarCategoriaPorNombre(String producto) {
        Utilidades.waitInMs(2000);
        List<WebElement> currencyList= driver.findElements(listaCategoriaProductos);
        for(WebElement currency:currencyList){
        if(currency.getText().equals(producto))
        currency.click();
        }
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Seleccionar Productos")
    public GestionProductoPage seleccionarProductos() {
        Utilidades.waitInMs(1000);
        
        	click(btnAborrote1);
        	Utilidades.waitInMs(1000);
        	click(btnAbarrote2);
        	Utilidades.screenshot();
        	Utilidades.waitInMs(1000);
            return this;
        	
	}
	
	@Step("Seleccionar Productos por Categoria")
    public GestionProductoPage seleccionarProductoCategoria(String producto) {
        Utilidades.waitInMs(1000);
        if(producto == "Abarrotes") {
        	Utilidades.waitInMs(1000);
        	click(lblAbarrotes);
        	click(btnAborrote1);
        	Utilidades.waitInMs(1000);
        	click(btnAbarrote2);
        	Utilidades.screenshot();
        }else if(producto =="Bebidas") {
        	Utilidades.waitInMs(1000);
        	click(lblBebidas);
        	click(btnBebida1);
        	Utilidades.waitInMs(1000);
        	click(btnBebida2);
        	Utilidades.screenshot();
        	
        }else if(producto == "Cervezas") {
        	Utilidades.waitInMs(2000);
        	click(lblCerveza);
        	click(btnCerveza1);
        	Utilidades.waitInMs(1000);
        	click(btnCerveza2);
        	Utilidades.screenshot();
        	
        }else if(producto == "Licores") {
        	Utilidades.waitInMs(2000);
        	//click(lblLicores);
        	click(btnLicor1);
        	Utilidades.waitInMs(1000);
        	click(btnLicor2);
        	Utilidades.screenshot();
        	
        }
        
        Utilidades.waitInMs(1000);
        return this;
    }
	
	
	
	
	@Step("Añadir mas Productos")
    public GestionProductoPage agregarMasProductos() {
        Utilidades.waitInMs(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,-3000)");
        click(lblAgregarProductos);
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Comprobar Valores Totales de Productos")
	public GestionProductoPage comprobarResultadoValoresPedidoUnidad(String numeroPed, String valProd1, String valProd2,
			String valProd3, String valProd4, String valProd5, String valProd6, String vtProd, String valDom, String vtPedido) {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblNumeroPedidos).getText(), numeroPed);
        Assert.assertEquals(getElement(lblValorProducto1).getText(), valProd1);
        Assert.assertEquals(getElement(lblValorProducto2).getText(), valProd2);
        Assert.assertEquals(getElement(lblValorProducto3).getText(), valProd3);
        Assert.assertEquals(getElement(lblValorProducto4).getText(), valProd4);
        Assert.assertEquals(getElement(lblValorProducto5).getText(), valProd5);
        Assert.assertEquals(getElement(lblValorProducto6).getText(), valProd6);
        Assert.assertEquals(getElement(lblValorTotalProductos).getText(), vtProd);
        Assert.assertEquals(getElement(lblValorDomicilio).getText(), valDom);
        Assert.assertEquals(getElement(lblValorTotalPedido).getText(), vtPedido);
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Validar Pedidos en Curso Ver")
    public GestionProductoPage validarPedidoVer() {
        Utilidades.waitInMs(1000);
        
        click(btnVerPedidoCurso);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }

	@Step("Comprobar Valores Totales de Productos Pedido en Curso")
	public GestionProductoPage comprobarResultadoValoresPedidoEnCurso(String costoTotal, String totalProducto, String valDomicilio,
			String valProd1, String valProd2, String valProd3, String valProd4, String valProd5, String valProd6,
			String cantProd1,String cantProd2,String cantProd3,String cantProd4,String cantProd5,String cantProd6) {
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Assert.assertEquals(getElement(lblCostoTotal).getText(), costoTotal);
        Utilidades.waitInMs(1000);        
        click(lblVerMasCostos);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        Assert.assertEquals(getElement(lblTotalProducto).getText(), totalProducto);
        Assert.assertEquals(getElement(lblDomicilio).getText(), valDomicilio);
        Assert.assertEquals(getElement(lblProductoPed1).getText(), valProd1);
        Assert.assertEquals(getElement(lblProductoPed2).getText(), valProd2);
        Assert.assertEquals(getElement(lblProductoPed3).getText(), valProd3);
        Assert.assertEquals(getElement(lblProductoPed4).getText(), valProd4);
        Assert.assertEquals(getElement(lblProductoPed5).getText(), valProd5);
        Assert.assertEquals(getElement(lblProductoPed6).getText(), valProd6);
        Assert.assertEquals(getElement(lblCantidadProd1).getText(), cantProd1);
        Assert.assertEquals(getElement(lblCantidadProd2).getText(), cantProd2);
        Assert.assertEquals(getElement(lblCantidadProd3).getText(), cantProd3);
        Assert.assertEquals(getElement(lblCantidadProd4).getText(), cantProd4);
        Assert.assertEquals(getElement(lblCantidadProd5).getText(), cantProd5);
        Assert.assertEquals(getElement(lblCantidadProd6).getText(), cantProd6);
        Utilidades.screenshot();
        Utilidades.waitInMs(2000);
        return this;
    }
	
	@Step("Ver mas Productos Abarrotes")
    public GestionProductoPage verMasProductosAbarrotes() {
        Utilidades.waitInMs(1000);
        
        click(lblVerMasProductosAbarrotes);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Seleccionar Mas Productos Abarrotes")
    public GestionProductoPage seleccionarMasProductosAbarrotes() {
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote1);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote2);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote3);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote4);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote5);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote6);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote7);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote8);
        Utilidades.waitInMs(1000);
        click(btnProdAbarrote9);
        Utilidades.waitInMs(1000);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	@Step("Aumentar y Quitar Mas Productos Abarrotes")
    public GestionProductoPage aumentarQuitarMasProductosAbarrotes() {
        Utilidades.waitInMs(1000);
        click(lblMasProductos);
        click(lblMasProductos);
        click(lblMasProductos);
        click(lblMasProductos);
        click(lblMasProductos);
        click(lblMasProductos);
        
        click(lblMenosProductos);
        click(lblMenosProductos);
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	@Step("Seleccionar Boton Carrito de Compra")
    public GestionProductoPage seleccionarCarritoCompra() {
        Utilidades.waitInMs(1000);
        click(btnCarrito);
        
        Utilidades.screenshot();
        Utilidades.waitInMs(1000);
        return this;
    }
	
	
	

}
