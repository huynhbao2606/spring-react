package com.bao.api.mapper;

import com.bao.api.dto.ProductDto;
import com.bao.api.entity.Category;
import com.bao.api.entity.Product;

public class ProductMapper {
    public static ProductDto mapToProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .unitPrice(product.getUnitPrice())
                .imageUrl(product.getImageUrl())
                .unitsInStock(product.getUnitsInStock())
                .brand(product.getBrand())
                .categoryId(product.getCategory().getId())
                .categoryName(product.getCategory().getName())
                .build();
    }

    public static Product mapToProduct(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .description(productDto.getDescription())
                .unitPrice(productDto.getUnitPrice())
                .imageUrl(productDto.getImageUrl())
                .unitsInStock(productDto.getUnitsInStock())
                .brand(productDto.getBrand())
                .category(Category.builder().id(productDto.getCategoryId()).build())
                .build();
    }
}
