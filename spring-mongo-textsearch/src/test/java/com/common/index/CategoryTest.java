package com.common.index;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.common.Service.CategoryService;
import com.common.model.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-config.xml"})
public class CategoryTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(CategoryTest.class);
	
	@Autowired
	private CategoryService categoryService;
	
	
	@Test
	public void testCategoryForIdAndName() {
		LOGGER.debug("~~~  testCategoryForIdAndName ~~~~");
		Category category = categoryService.findByCategoryIDAndCategoryName(1, "Beverages");
		LOGGER.debug("----------------------");
		LOGGER.debug("CategoryID  : "+category.getCategoryId());
		LOGGER.debug("CategoryName: "+category.getCategoryName());
		LOGGER.debug("Description : "+category.getDescription());
		LOGGER.debug("Picture     : "+category.getPicture());
		LOGGER.debug("field4      : "+category.getField4());
		LOGGER.debug("field5      : "+category.getField5());
		LOGGER.debug("field6      : "+category.getField6());
		LOGGER.debug("field7      : "+category.getField7());
	}
	
	

}
