package com.bao.api.service.impl;

import com.bao.api.dto.CategoryDto;
import com.bao.api.entity.Category;
import com.bao.api.mapper.CategoryMapper;
import com.bao.api.repository.CategoryRepository;
import com.bao.api.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAllCategory() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map((CategoryMapper::mapToCategoryDto))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.maptoCategory(categoryDto);
        Category saveCategory = categoryRepository.save(category);
        return CategoryMapper.mapToCategoryDto(saveCategory);
    }

    @Override
    public CategoryDto getCategoryById(long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(
                        () -> new RuntimeException("Category id not found" + categoryId));
                return CategoryMapper.mapToCategoryDto(category);
    }

    @Override
    public CategoryDto updateProduct(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public void deleteCategory(long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
