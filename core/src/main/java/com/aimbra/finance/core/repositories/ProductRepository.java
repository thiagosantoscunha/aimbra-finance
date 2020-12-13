package com.aimbra.finance.core.repositories;


import com.aimbra.finance.core.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
