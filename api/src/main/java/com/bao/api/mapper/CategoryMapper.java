package com.bao.api.mapper;

import com.bao.api.dto.CategoryDto;
import com.bao.api.entity.Category;

public class CategoryMapper {
    public static CategoryDto mapToCategoryDto(Category category){
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public static Category maptoCategory(CategoryDto categoryDto){
        return Category.builder()
                .id(categoryDto.getId())
                .name(categoryDto.getName())
                .build();
    }
}
