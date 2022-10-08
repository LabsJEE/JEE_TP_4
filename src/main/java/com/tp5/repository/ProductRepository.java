package com.tp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tp5.model.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Long> {
    Product findByProdName(final String prodName);
}