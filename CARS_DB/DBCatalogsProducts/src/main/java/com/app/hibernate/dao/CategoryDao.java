package com.app.hibernate.dao;

import java.util.List;

import com.app.hibernate.srcs.Category;

public interface CategoryDao {

    void saveCategory(Category category);
    
    List<Category> findAllCategories();
    
    void deleteById(String categoryId);
    
    Category findById(String categoryId);
     
    void updateCategory(Category category);
	
}
