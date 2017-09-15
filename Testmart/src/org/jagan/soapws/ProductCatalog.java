package org.jagan.soapws;

import java.util.List;

import javax.jws.WebService;

import org.jagan.soapws.business.ProductServiceImpl;
import org.jagan.soapws.model.Product;


@WebService(serviceName="TestMartService", 
			portName="TestMartServicePort", 
			name="TestMartCatalog",
			endpointInterface="org.jagan.soapws.ProductCatalogInterface")

public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	public List<String> getProductCategories() {
		return productServiceImpl.getProductCategories();
	}
	
	public List<String> getProducts(String category) {
		return productServiceImpl.getProducts(category);
	}
	
	public List<Product> getProductsV2(String category) {
		return productServiceImpl.getProductsV2(category);
	}
	
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
	
}
