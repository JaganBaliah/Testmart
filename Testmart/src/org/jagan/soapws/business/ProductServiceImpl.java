package org.jagan.soapws.business;

import java.util.ArrayList;
import java.util.List;

import org.jagan.soapws.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<String>(); 
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl() {
		super();
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");
		
		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek Into Darkness");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch(category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;	
		}
		return null;
	}
		
	public List<Product> getProductsV2(String category) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Book1", "abcd", 1.23d));
		products.add(new Product("Book2", "xyz", 7.89d));
		return products;		
	}
	
	public boolean addProduct(String category, String product) {
		switch(category.toLowerCase()) {
		case "books":
			return bookList.add(product);
		case "music":
			return musicList.add(product);
		case "movies":
			return movieList.add(product);
		}
		return false;
	}
	
}
