package org.jagan.soapws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.jagan.soapws.model.Product;

@WebService(targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductsV2(String category);
	
	@WebMethod
	boolean addProduct(String category, String product);

}