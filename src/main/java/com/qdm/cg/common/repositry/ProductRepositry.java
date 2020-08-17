package com.qdm.cg.common.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.cg.common.modal.Product;
@Repository
public interface ProductRepositry extends JpaRepository<Product, Integer> {
   List<Product> save(Integer productId);
	
	
}
 