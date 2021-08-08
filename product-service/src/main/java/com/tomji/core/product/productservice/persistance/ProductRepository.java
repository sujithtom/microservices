package com.tomji.core.product.productservice.persistance;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<ProductEntity, String> {
    Optional<ProductEntity> findByProductId(int productId);

    Page<ProductEntity> findAll(Pageable nextPage);
}
