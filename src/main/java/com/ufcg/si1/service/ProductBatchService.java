package com.ufcg.si1.service;

import java.util.List;

import com.ufcg.si1.model.Batch;
import com.ufcg.si1.model.Product;

public interface ProductBatchService {

	/*
	 * Product Operations
	 */
	List<Product> findAllProducts();

	Product findProductByBarCode(String barCode);
	
	Product saveProduct(Product product);
	
	Product updateProduct(Product product);
	
	void deleteProduct(String barCode);

	boolean productAlreadyExists(String barCode);
	
	/*
	 * Batch Operations
	 */
	List<Batch> findAllBatches();

	Batch saveBatch(Batch batch);

	List<Batch> getBatchesByProduct(Product product);
}
