package com.bao.api.service;



import com.bao.api.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategory();

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto getCategoryById(long categoryId);

    CategoryDto updateProduct(CategoryDto categoryDto);

    void deleteCategory(long categoryId);
}
