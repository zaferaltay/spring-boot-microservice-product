package com.sha.productmicroservis.manager;

import com.sha.productmicroservis.entities.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);
    void deleteProduct(Long id);
    List<Product> findAllProducts();
}
