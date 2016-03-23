package com.common.Service;

import com.common.model.Category;

public interface CategoryService {

	Category findByCategoryIDAndCategoryName(Integer categoryId,String categoryName);
}
