package com.bao.api.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDto {
    private long id;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private String imageUrl;

    private int unitsInStock;

    private String brand;

    private long categoryId;

    private String categoryName;

}
