package com.sha.productmicroservis.manager;

import com.sha.productmicroservis.entities.Product;
import com.sha.productmicroservis.repositories.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductDao productDao;

    @Override
    public Product saveProduct(Product product)
    {
        product.setCreateTime(LocalDateTime.now());
        return productDao.save(product);
    }

    @Override
    public void deleteProduct(Long productId)
    {
        productDao.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return productDao.findAll();
    }
}
