package com.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.common.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

	Category findByCategoryIdAndCategoryName(Integer categoryId,String categoryName);
}
