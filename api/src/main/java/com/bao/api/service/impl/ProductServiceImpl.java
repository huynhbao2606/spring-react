package com.bao.api.service.impl;

import com.bao.api.dto.ProductDto;
import com.bao.api.entity.Product;
import com.bao.api.mapper.ProductMapper;
import com.bao.api.repository.ProductRepository;
import com.bao.api.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;


    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map((ProductMapper::mapToProductDto))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = ProductMapper.mapToProduct(productDto);
        Product saveProduct = productRepository.save(product);
        return ProductMapper.mapToProductDto(saveProduct);
    }

    @Override
    public ProductDto getProductById(long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(
                        () -> new RuntimeException("Product id not found" + productId));
                return ProductMapper.mapToProductDto(product);
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }
}
