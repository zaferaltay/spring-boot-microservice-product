package com.sha.productmicroservis.controller;


import com.sha.productmicroservis.entities.Product;
import com.sha.productmicroservis.manager.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private IProductService ps;

    @PostMapping
    private ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(ps.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    private ResponseEntity<?> deleteProduct(@PathVariable Long id){
        ps.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    private ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(ps.findAllProducts());
    }
}
