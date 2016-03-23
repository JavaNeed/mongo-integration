package com.common.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.common.model.Category;
import com.common.repository.CategoryRepository;

@Component
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository cRepository;

	public Category findByCategoryIDAndCategoryName(Integer categoryId,String categoryName) {
		Category category = cRepository.findByCategoryIdAndCategoryName(categoryId, categoryName);
		return category;
	}

}
