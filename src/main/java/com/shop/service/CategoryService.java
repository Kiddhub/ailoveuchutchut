package com.shop.service;

import com.shop.dto.CategoryDto;
import com.shop.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();


//    /*Customer
//     */
//    List<CategoryDto> getCategoryAndProduct();


}
