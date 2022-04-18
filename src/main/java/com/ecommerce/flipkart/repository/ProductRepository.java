package com.ecommerce.flipkart.repository;

import com.ecommerce.flipkart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
