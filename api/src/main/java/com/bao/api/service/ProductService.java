package com.bao.api.service;

import com.bao.api.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllProducts();

    ProductDto createProduct(ProductDto productDto);

    ProductDto getProductById(long productId);

    ProductDto updateProduct(ProductDto productDto);

    void deleteProduct(long productId);
}
