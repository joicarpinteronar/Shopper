package com.shopper.test;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopper.test.utils.Listeners.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

@Listeners({ TestListener.class })
@Epic("Gestion Producto")
@Feature("Gestion Producto Tests")

public class GestionProductoTest extends BaseTest{
	
public Properties fileprops = new Properties();
	
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	/*
	@Test(priority=0, description="Buscar Producto")
    @Severity(SeverityLevel.NORMAL)
    @Description("Buscar Producto")
    @Story("Buscar Producto")
    @TmsLink("XRPRJ-1")
    public void buscarProductoPorNombre () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");		
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		gestion.buscarProductoNombre("cerveza")
		.comprobarResultadoBuscarProducto("\"cerveza\"");
		
    }
	
	
	@Test(priority=1, description="Buscar Tienda")
    @Severity(SeverityLevel.NORMAL)
    @Description("Buscar Tienda y Producto")
    @Story("Buscar Tienda")
    @TmsLink("XRPRJ-1")
    public void buscarTiendaNombre () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");		
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		gestion.buscarTiendaNombre("supermercado","atun");
		
    }
	
	@Test(priority=2, description="Seleccionar Tienda Por Nombre y Validar valores de Compra")
    @Severity(SeverityLevel.NORMAL)
    @Description("Seleccionar Tienda")
    @Story("Compra")
    @TmsLink("XRPRJ-1")
    public void validarValoresCompra () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");		
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		gestion.seleccionarTiendaPorNombre("Tienda Arias")
		.seleccionarProductoCategoria("Abarrotes")
		.seleccionarProductoCategoria("Bebidas");		
		tienda.verCarrito();
		gestion.agregarMasProductos()
		.seleccionarProductoCategoria("Licores");
		tienda.verCarrito();
		gestion.comprobarResultadoValoresPedidoUnidad("Tu pedido (6 Artículo)", "$ 12.000", "$ 3.000", 
				"$ 3.500", "$ 750", "$ 12.000", "$ 15.600", "$ 46.850", "$ 1.000", "$ 47.850");
		tienda.aumentarProdutosResumen2();
		gestion.comprobarResultadoValoresPedidoUnidad("Tu pedido (6 Artículo)", "$ 48.000", "$ 9.000", 
				"$ 17.500", "$ 3.750", "$ 48.000", "$ 93.600", "$ 219.850", "$ 1.000", "$ 220.850");
		tienda.verResumenProd("Efectivo")
		.finalizarPedido()
		.comprobarResultadoCorrectoCompra();
		
    }
	
	@Test(priority=3, description="Validar Valores de Compra en Pedido en Curso")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar Compra")
    @Story("Compra")
    @TmsLink("XRPRJ-1")
    public void validarValoresCompraPedidoEnCurso () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");		
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		gestion.seleccionarTiendaPorNombre("Tienda Arias")
		.seleccionarProductoCategoria("Abarrotes")
		.seleccionarProductoCategoria("Bebidas")
		.seleccionarProductoCategoria("Cervezas");		
		tienda.verCarrito();		
		gestion.comprobarResultadoValoresPedidoUnidad("Tu pedido (6 Artículo)", "$ 12.000", "$ 3.000", 
				"$ 3.500", "$ 750", "$ 2.300", "$ 4.000", "$ 25.550", "$ 1.000", "$ 26.550");
		tienda.aumentarProdutosResumen2();
		gestion.comprobarResultadoValoresPedidoUnidad("Tu pedido (6 Artículo)", "$ 48.000", "$ 9.000", 
				"$ 17.500", "$ 3.750", "$ 9.200", "$ 24.000", "$ 111.450", "$ 1.000", "$ 112.450");
		tienda.verResumenProd("Efectivo")
		.finalizarPedido()
		.comprobarResultadoCorrectoCompra()
		.validarPedidosActivos();
		gestion.validarPedidoVer()
		.comprobarResultadoValoresPedidoEnCurso("$ 112.450", "$ 111.450", "$ 1.000", "$ 48.000", "$ 9.000", "$ 17.500",
				"$ 3.750", "$ 9.200", "$ 24.000", "4", "3", "5", "5", "4", "6");
		
    }*/
	
	@Test(priority=4, description="Validar Mas Abarrotes en la Lista")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validar Mas Productos")
    @Story("Compra")
    @TmsLink("XRPRJ-1")
    public void seleccionarMasProductos () throws Exception {
		home.irPortal(getProperties().getProperty("url"))
        .seleccionarCiudad("Bogotá")
        .comprobarResultadoCorrecto()
        .seleccionarRol("Consumidor");		
		login.ingresarNumeroCelular("3222255941")
		.ingresarCodigoValidacion("1", "2", "3", "4", "5");
		gestion.seleccionarTiendaPorNombre("Tienda Arias")
		//.verMasProductosAbarrotes()
		//.seleccionarMasProductosAbarrotes()
		//.aumentarQuitarMasProductosAbarrotes()
		//.seleccionarCarritoCompra();
		.buscarCategoriaPorNombre("Abarrotes")
		.seleccionarProductos();
	}

}
