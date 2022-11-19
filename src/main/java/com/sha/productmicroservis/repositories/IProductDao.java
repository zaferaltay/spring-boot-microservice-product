package com.sha.productmicroservis.repositories;

import com.sha.productmicroservis.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product,Long> {
}
