package com.aimbra.finance.product.endpoints.services;

import com.aimbra.finance.core.entities.Product;
import com.aimbra.finance.core.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {
    private final ProductRepository productRepository;
    public Iterable<Product> findAll(Pageable pageable) {
        log.info("Listing all products");
        return productRepository.findAll(pageable);
    }
}
